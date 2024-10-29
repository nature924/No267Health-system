package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YaopinleixingDao;
import com.entity.YaopinleixingEntity;
import com.service.YaopinleixingService;
import com.entity.vo.YaopinleixingVO;
import com.entity.view.YaopinleixingView;

@Service("yaopinleixingService")
public class YaopinleixingServiceImpl extends ServiceImpl<YaopinleixingDao, YaopinleixingEntity> implements YaopinleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopinleixingEntity> page = this.selectPage(
                new Query<YaopinleixingEntity>(params).getPage(),
                new EntityWrapper<YaopinleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopinleixingEntity> wrapper) {
		  Page<YaopinleixingView> page =new Query<YaopinleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopinleixingVO> selectListVO(Wrapper<YaopinleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopinleixingVO selectVO(Wrapper<YaopinleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopinleixingView> selectListView(Wrapper<YaopinleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopinleixingView selectView(Wrapper<YaopinleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

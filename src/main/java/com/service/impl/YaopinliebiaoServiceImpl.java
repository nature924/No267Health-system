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


import com.dao.YaopinliebiaoDao;
import com.entity.YaopinliebiaoEntity;
import com.service.YaopinliebiaoService;
import com.entity.vo.YaopinliebiaoVO;
import com.entity.view.YaopinliebiaoView;

@Service("yaopinliebiaoService")
public class YaopinliebiaoServiceImpl extends ServiceImpl<YaopinliebiaoDao, YaopinliebiaoEntity> implements YaopinliebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopinliebiaoEntity> page = this.selectPage(
                new Query<YaopinliebiaoEntity>(params).getPage(),
                new EntityWrapper<YaopinliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopinliebiaoEntity> wrapper) {
		  Page<YaopinliebiaoView> page =new Query<YaopinliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopinliebiaoVO> selectListVO(Wrapper<YaopinliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopinliebiaoVO selectVO(Wrapper<YaopinliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopinliebiaoView> selectListView(Wrapper<YaopinliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopinliebiaoView selectView(Wrapper<YaopinliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

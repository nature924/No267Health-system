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


import com.dao.KeshileixingDao;
import com.entity.KeshileixingEntity;
import com.service.KeshileixingService;
import com.entity.vo.KeshileixingVO;
import com.entity.view.KeshileixingView;

@Service("keshileixingService")
public class KeshileixingServiceImpl extends ServiceImpl<KeshileixingDao, KeshileixingEntity> implements KeshileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeshileixingEntity> page = this.selectPage(
                new Query<KeshileixingEntity>(params).getPage(),
                new EntityWrapper<KeshileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeshileixingEntity> wrapper) {
		  Page<KeshileixingView> page =new Query<KeshileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeshileixingVO> selectListVO(Wrapper<KeshileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeshileixingVO selectVO(Wrapper<KeshileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeshileixingView> selectListView(Wrapper<KeshileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeshileixingView selectView(Wrapper<KeshileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

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


import com.dao.ZaixianyuyueDao;
import com.entity.ZaixianyuyueEntity;
import com.service.ZaixianyuyueService;
import com.entity.vo.ZaixianyuyueVO;
import com.entity.view.ZaixianyuyueView;

@Service("zaixianyuyueService")
public class ZaixianyuyueServiceImpl extends ServiceImpl<ZaixianyuyueDao, ZaixianyuyueEntity> implements ZaixianyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixianyuyueEntity> page = this.selectPage(
                new Query<ZaixianyuyueEntity>(params).getPage(),
                new EntityWrapper<ZaixianyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixianyuyueEntity> wrapper) {
		  Page<ZaixianyuyueView> page =new Query<ZaixianyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixianyuyueVO> selectListVO(Wrapper<ZaixianyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixianyuyueVO selectVO(Wrapper<ZaixianyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixianyuyueView> selectListView(Wrapper<ZaixianyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixianyuyueView selectView(Wrapper<ZaixianyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

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


import com.dao.DiscussjiankangshipinDao;
import com.entity.DiscussjiankangshipinEntity;
import com.service.DiscussjiankangshipinService;
import com.entity.vo.DiscussjiankangshipinVO;
import com.entity.view.DiscussjiankangshipinView;

@Service("discussjiankangshipinService")
public class DiscussjiankangshipinServiceImpl extends ServiceImpl<DiscussjiankangshipinDao, DiscussjiankangshipinEntity> implements DiscussjiankangshipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiankangshipinEntity> page = this.selectPage(
                new Query<DiscussjiankangshipinEntity>(params).getPage(),
                new EntityWrapper<DiscussjiankangshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiankangshipinEntity> wrapper) {
		  Page<DiscussjiankangshipinView> page =new Query<DiscussjiankangshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiankangshipinVO> selectListVO(Wrapper<DiscussjiankangshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiankangshipinVO selectVO(Wrapper<DiscussjiankangshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiankangshipinView> selectListView(Wrapper<DiscussjiankangshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiankangshipinView selectView(Wrapper<DiscussjiankangshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

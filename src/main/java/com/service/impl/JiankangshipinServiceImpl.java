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


import com.dao.JiankangshipinDao;
import com.entity.JiankangshipinEntity;
import com.service.JiankangshipinService;
import com.entity.vo.JiankangshipinVO;
import com.entity.view.JiankangshipinView;

@Service("jiankangshipinService")
public class JiankangshipinServiceImpl extends ServiceImpl<JiankangshipinDao, JiankangshipinEntity> implements JiankangshipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangshipinEntity> page = this.selectPage(
                new Query<JiankangshipinEntity>(params).getPage(),
                new EntityWrapper<JiankangshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangshipinEntity> wrapper) {
		  Page<JiankangshipinView> page =new Query<JiankangshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangshipinVO> selectListVO(Wrapper<JiankangshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangshipinVO selectVO(Wrapper<JiankangshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangshipinView> selectListView(Wrapper<JiankangshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangshipinView selectView(Wrapper<JiankangshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

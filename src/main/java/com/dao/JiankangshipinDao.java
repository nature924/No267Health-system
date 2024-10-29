package com.dao;

import com.entity.JiankangshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangshipinVO;
import com.entity.view.JiankangshipinView;


/**
 * 健康视频
 * 
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
public interface JiankangshipinDao extends BaseMapper<JiankangshipinEntity> {
	
	List<JiankangshipinVO> selectListVO(@Param("ew") Wrapper<JiankangshipinEntity> wrapper);
	
	JiankangshipinVO selectVO(@Param("ew") Wrapper<JiankangshipinEntity> wrapper);
	
	List<JiankangshipinView> selectListView(@Param("ew") Wrapper<JiankangshipinEntity> wrapper);

	List<JiankangshipinView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangshipinEntity> wrapper);
	
	JiankangshipinView selectView(@Param("ew") Wrapper<JiankangshipinEntity> wrapper);
	
}

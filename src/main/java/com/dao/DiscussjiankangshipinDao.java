package com.dao;

import com.entity.DiscussjiankangshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiankangshipinVO;
import com.entity.view.DiscussjiankangshipinView;


/**
 * 健康视频评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
public interface DiscussjiankangshipinDao extends BaseMapper<DiscussjiankangshipinEntity> {
	
	List<DiscussjiankangshipinVO> selectListVO(@Param("ew") Wrapper<DiscussjiankangshipinEntity> wrapper);
	
	DiscussjiankangshipinVO selectVO(@Param("ew") Wrapper<DiscussjiankangshipinEntity> wrapper);
	
	List<DiscussjiankangshipinView> selectListView(@Param("ew") Wrapper<DiscussjiankangshipinEntity> wrapper);

	List<DiscussjiankangshipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiankangshipinEntity> wrapper);
	
	DiscussjiankangshipinView selectView(@Param("ew") Wrapper<DiscussjiankangshipinEntity> wrapper);
	
}

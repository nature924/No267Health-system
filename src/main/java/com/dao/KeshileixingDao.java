package com.dao;

import com.entity.KeshileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeshileixingVO;
import com.entity.view.KeshileixingView;


/**
 * 科室类型
 * 
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
public interface KeshileixingDao extends BaseMapper<KeshileixingEntity> {
	
	List<KeshileixingVO> selectListVO(@Param("ew") Wrapper<KeshileixingEntity> wrapper);
	
	KeshileixingVO selectVO(@Param("ew") Wrapper<KeshileixingEntity> wrapper);
	
	List<KeshileixingView> selectListView(@Param("ew") Wrapper<KeshileixingEntity> wrapper);

	List<KeshileixingView> selectListView(Pagination page,@Param("ew") Wrapper<KeshileixingEntity> wrapper);
	
	KeshileixingView selectView(@Param("ew") Wrapper<KeshileixingEntity> wrapper);
	
}

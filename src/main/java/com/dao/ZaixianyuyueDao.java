package com.dao;

import com.entity.ZaixianyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixianyuyueVO;
import com.entity.view.ZaixianyuyueView;


/**
 * 在线预约
 * 
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
public interface ZaixianyuyueDao extends BaseMapper<ZaixianyuyueEntity> {
	
	List<ZaixianyuyueVO> selectListVO(@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);
	
	ZaixianyuyueVO selectVO(@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);
	
	List<ZaixianyuyueView> selectListView(@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);

	List<ZaixianyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);
	
	ZaixianyuyueView selectView(@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);
	
}

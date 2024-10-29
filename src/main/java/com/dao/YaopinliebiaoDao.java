package com.dao;

import com.entity.YaopinliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopinliebiaoVO;
import com.entity.view.YaopinliebiaoView;


/**
 * 药品列表
 * 
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
public interface YaopinliebiaoDao extends BaseMapper<YaopinliebiaoEntity> {
	
	List<YaopinliebiaoVO> selectListVO(@Param("ew") Wrapper<YaopinliebiaoEntity> wrapper);
	
	YaopinliebiaoVO selectVO(@Param("ew") Wrapper<YaopinliebiaoEntity> wrapper);
	
	List<YaopinliebiaoView> selectListView(@Param("ew") Wrapper<YaopinliebiaoEntity> wrapper);

	List<YaopinliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<YaopinliebiaoEntity> wrapper);
	
	YaopinliebiaoView selectView(@Param("ew") Wrapper<YaopinliebiaoEntity> wrapper);
	
}

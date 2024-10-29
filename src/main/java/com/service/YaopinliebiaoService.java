package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopinliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopinliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopinliebiaoView;


/**
 * 药品列表
 *
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
public interface YaopinliebiaoService extends IService<YaopinliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopinliebiaoVO> selectListVO(Wrapper<YaopinliebiaoEntity> wrapper);
   	
   	YaopinliebiaoVO selectVO(@Param("ew") Wrapper<YaopinliebiaoEntity> wrapper);
   	
   	List<YaopinliebiaoView> selectListView(Wrapper<YaopinliebiaoEntity> wrapper);
   	
   	YaopinliebiaoView selectView(@Param("ew") Wrapper<YaopinliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopinliebiaoEntity> wrapper);
   	
}


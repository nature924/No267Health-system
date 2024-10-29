package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopinleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopinleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopinleixingView;


/**
 * 药品类型
 *
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
public interface YaopinleixingService extends IService<YaopinleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopinleixingVO> selectListVO(Wrapper<YaopinleixingEntity> wrapper);
   	
   	YaopinleixingVO selectVO(@Param("ew") Wrapper<YaopinleixingEntity> wrapper);
   	
   	List<YaopinleixingView> selectListView(Wrapper<YaopinleixingEntity> wrapper);
   	
   	YaopinleixingView selectView(@Param("ew") Wrapper<YaopinleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopinleixingEntity> wrapper);
   	
}


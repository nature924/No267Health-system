package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeshileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeshileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeshileixingView;


/**
 * 科室类型
 *
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
public interface KeshileixingService extends IService<KeshileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeshileixingVO> selectListVO(Wrapper<KeshileixingEntity> wrapper);
   	
   	KeshileixingVO selectVO(@Param("ew") Wrapper<KeshileixingEntity> wrapper);
   	
   	List<KeshileixingView> selectListView(Wrapper<KeshileixingEntity> wrapper);
   	
   	KeshileixingView selectView(@Param("ew") Wrapper<KeshileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeshileixingEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangshipinView;


/**
 * 健康视频
 *
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
public interface JiankangshipinService extends IService<JiankangshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangshipinVO> selectListVO(Wrapper<JiankangshipinEntity> wrapper);
   	
   	JiankangshipinVO selectVO(@Param("ew") Wrapper<JiankangshipinEntity> wrapper);
   	
   	List<JiankangshipinView> selectListView(Wrapper<JiankangshipinEntity> wrapper);
   	
   	JiankangshipinView selectView(@Param("ew") Wrapper<JiankangshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangshipinEntity> wrapper);
   	
}


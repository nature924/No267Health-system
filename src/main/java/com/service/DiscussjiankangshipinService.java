package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiankangshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiankangshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiankangshipinView;


/**
 * 健康视频评论表
 *
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
public interface DiscussjiankangshipinService extends IService<DiscussjiankangshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiankangshipinVO> selectListVO(Wrapper<DiscussjiankangshipinEntity> wrapper);
   	
   	DiscussjiankangshipinVO selectVO(@Param("ew") Wrapper<DiscussjiankangshipinEntity> wrapper);
   	
   	List<DiscussjiankangshipinView> selectListView(Wrapper<DiscussjiankangshipinEntity> wrapper);
   	
   	DiscussjiankangshipinView selectView(@Param("ew") Wrapper<DiscussjiankangshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiankangshipinEntity> wrapper);
   	
}


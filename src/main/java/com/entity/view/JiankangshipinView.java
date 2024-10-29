package com.entity.view;

import com.entity.JiankangshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康视频
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
@TableName("jiankangshipin")
public class JiankangshipinView  extends JiankangshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangshipinView(){
	}
 
 	public JiankangshipinView(JiankangshipinEntity jiankangshipinEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

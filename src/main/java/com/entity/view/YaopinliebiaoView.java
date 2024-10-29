package com.entity.view;

import com.entity.YaopinliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药品列表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
@TableName("yaopinliebiao")
public class YaopinliebiaoView  extends YaopinliebiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaopinliebiaoView(){
	}
 
 	public YaopinliebiaoView(YaopinliebiaoEntity yaopinliebiaoEntity){
 	try {
			BeanUtils.copyProperties(this, yaopinliebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

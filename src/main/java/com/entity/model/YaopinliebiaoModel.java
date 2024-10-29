package com.entity.model;

import com.entity.YaopinliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 药品列表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-24 10:41:30
 */
public class YaopinliebiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品类型
	 */
	
	private String yaopinleixing;
		
	/**
	 * 药品简介
	 */
	
	private String yaopinjianjie;
		
	/**
	 * 适用症状
	 */
	
	private String shiyongzhengzhuang;
		
	/**
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：药品类型
	 */
	 
	public void setYaopinleixing(String yaopinleixing) {
		this.yaopinleixing = yaopinleixing;
	}
	
	/**
	 * 获取：药品类型
	 */
	public String getYaopinleixing() {
		return yaopinleixing;
	}
				
	
	/**
	 * 设置：药品简介
	 */
	 
	public void setYaopinjianjie(String yaopinjianjie) {
		this.yaopinjianjie = yaopinjianjie;
	}
	
	/**
	 * 获取：药品简介
	 */
	public String getYaopinjianjie() {
		return yaopinjianjie;
	}
				
	
	/**
	 * 设置：适用症状
	 */
	 
	public void setShiyongzhengzhuang(String shiyongzhengzhuang) {
		this.shiyongzhengzhuang = shiyongzhengzhuang;
	}
	
	/**
	 * 获取：适用症状
	 */
	public String getShiyongzhengzhuang() {
		return shiyongzhengzhuang;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}

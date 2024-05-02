package com.entity.view;

import com.entity.YinlexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 音乐信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
@TableName("yinlexinxi")
public class YinlexinxiView  extends YinlexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinlexinxiView(){
	}
 
 	public YinlexinxiView(YinlexinxiEntity yinlexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yinlexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

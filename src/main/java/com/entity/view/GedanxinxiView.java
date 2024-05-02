package com.entity.view;

import com.entity.GedanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 歌单信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
@TableName("gedanxinxi")
public class GedanxinxiView  extends GedanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GedanxinxiView(){
	}
 
 	public GedanxinxiView(GedanxinxiEntity gedanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gedanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

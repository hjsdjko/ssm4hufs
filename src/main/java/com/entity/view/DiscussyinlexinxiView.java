package com.entity.view;

import com.entity.DiscussyinlexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 音乐信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
@TableName("discussyinlexinxi")
public class DiscussyinlexinxiView  extends DiscussyinlexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyinlexinxiView(){
	}
 
 	public DiscussyinlexinxiView(DiscussyinlexinxiEntity discussyinlexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussyinlexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

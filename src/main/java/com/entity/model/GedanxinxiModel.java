package com.entity.model;

import com.entity.GedanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 歌单信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public class GedanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 歌单类型
	 */
	
	private String gedanleixing;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 歌曲数量
	 */
	
	private Integer gequshuliang;
		
	/**
	 * 歌曲播放
	 */
	
	private String gequbofang;
		
	/**
	 * 歌曲列表
	 */
	
	private String gequliebiao;
		
	/**
	 * 添加日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiariqi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：歌单类型
	 */
	 
	public void setGedanleixing(String gedanleixing) {
		this.gedanleixing = gedanleixing;
	}
	
	/**
	 * 获取：歌单类型
	 */
	public String getGedanleixing() {
		return gedanleixing;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：歌曲数量
	 */
	 
	public void setGequshuliang(Integer gequshuliang) {
		this.gequshuliang = gequshuliang;
	}
	
	/**
	 * 获取：歌曲数量
	 */
	public Integer getGequshuliang() {
		return gequshuliang;
	}
				
	
	/**
	 * 设置：歌曲播放
	 */
	 
	public void setGequbofang(String gequbofang) {
		this.gequbofang = gequbofang;
	}
	
	/**
	 * 获取：歌曲播放
	 */
	public String getGequbofang() {
		return gequbofang;
	}
				
	
	/**
	 * 设置：歌曲列表
	 */
	 
	public void setGequliebiao(String gequliebiao) {
		this.gequliebiao = gequliebiao;
	}
	
	/**
	 * 获取：歌曲列表
	 */
	public String getGequliebiao() {
		return gequliebiao;
	}
				
	
	/**
	 * 设置：添加日期
	 */
	 
	public void setTianjiariqi(Date tianjiariqi) {
		this.tianjiariqi = tianjiariqi;
	}
	
	/**
	 * 获取：添加日期
	 */
	public Date getTianjiariqi() {
		return tianjiariqi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}

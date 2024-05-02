package com.entity.model;

import com.entity.YinlexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 音乐信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public class YinlexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 音乐类型
	 */
	
	private String yinleleixing;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 歌手
	 */
	
	private String geshou;
		
	/**
	 * 编曲
	 */
	
	private String bianqu;
		
	/**
	 * 填词
	 */
	
	private String tianci;
		
	/**
	 * 语言
	 */
	
	private String yuyan;
		
	/**
	 * 专辑
	 */
	
	private String zhuanji;
		
	/**
	 * 时长
	 */
	
	private String shizhang;
		
	/**
	 * 音频
	 */
	
	private String yinpin;
		
	/**
	 * 歌词
	 */
	
	private String geci;
		
	/**
	 * 发行方
	 */
	
	private String faxingfang;
		
	/**
	 * 发行日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faxingriqi;
		
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
	 * 设置：音乐类型
	 */
	 
	public void setYinleleixing(String yinleleixing) {
		this.yinleleixing = yinleleixing;
	}
	
	/**
	 * 获取：音乐类型
	 */
	public String getYinleleixing() {
		return yinleleixing;
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
	 * 设置：歌手
	 */
	 
	public void setGeshou(String geshou) {
		this.geshou = geshou;
	}
	
	/**
	 * 获取：歌手
	 */
	public String getGeshou() {
		return geshou;
	}
				
	
	/**
	 * 设置：编曲
	 */
	 
	public void setBianqu(String bianqu) {
		this.bianqu = bianqu;
	}
	
	/**
	 * 获取：编曲
	 */
	public String getBianqu() {
		return bianqu;
	}
				
	
	/**
	 * 设置：填词
	 */
	 
	public void setTianci(String tianci) {
		this.tianci = tianci;
	}
	
	/**
	 * 获取：填词
	 */
	public String getTianci() {
		return tianci;
	}
				
	
	/**
	 * 设置：语言
	 */
	 
	public void setYuyan(String yuyan) {
		this.yuyan = yuyan;
	}
	
	/**
	 * 获取：语言
	 */
	public String getYuyan() {
		return yuyan;
	}
				
	
	/**
	 * 设置：专辑
	 */
	 
	public void setZhuanji(String zhuanji) {
		this.zhuanji = zhuanji;
	}
	
	/**
	 * 获取：专辑
	 */
	public String getZhuanji() {
		return zhuanji;
	}
				
	
	/**
	 * 设置：时长
	 */
	 
	public void setShizhang(String shizhang) {
		this.shizhang = shizhang;
	}
	
	/**
	 * 获取：时长
	 */
	public String getShizhang() {
		return shizhang;
	}
				
	
	/**
	 * 设置：音频
	 */
	 
	public void setYinpin(String yinpin) {
		this.yinpin = yinpin;
	}
	
	/**
	 * 获取：音频
	 */
	public String getYinpin() {
		return yinpin;
	}
				
	
	/**
	 * 设置：歌词
	 */
	 
	public void setGeci(String geci) {
		this.geci = geci;
	}
	
	/**
	 * 获取：歌词
	 */
	public String getGeci() {
		return geci;
	}
				
	
	/**
	 * 设置：发行方
	 */
	 
	public void setFaxingfang(String faxingfang) {
		this.faxingfang = faxingfang;
	}
	
	/**
	 * 获取：发行方
	 */
	public String getFaxingfang() {
		return faxingfang;
	}
				
	
	/**
	 * 设置：发行日期
	 */
	 
	public void setFaxingriqi(Date faxingriqi) {
		this.faxingriqi = faxingriqi;
	}
	
	/**
	 * 获取：发行日期
	 */
	public Date getFaxingriqi() {
		return faxingriqi;
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

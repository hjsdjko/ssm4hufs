package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YinlexinxiEntity;
import com.entity.view.YinlexinxiView;

import com.service.YinlexinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 音乐信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
@RestController
@RequestMapping("/yinlexinxi")
public class YinlexinxiController {
    @Autowired
    private YinlexinxiService yinlexinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YinlexinxiEntity yinlexinxi, 
		HttpServletRequest request){

        EntityWrapper<YinlexinxiEntity> ew = new EntityWrapper<YinlexinxiEntity>();
		PageUtils page = yinlexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlexinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YinlexinxiEntity yinlexinxi, 
		HttpServletRequest request){
        EntityWrapper<YinlexinxiEntity> ew = new EntityWrapper<YinlexinxiEntity>();
		PageUtils page = yinlexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlexinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YinlexinxiEntity yinlexinxi){
       	EntityWrapper<YinlexinxiEntity> ew = new EntityWrapper<YinlexinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yinlexinxi, "yinlexinxi")); 
        return R.ok().put("data", yinlexinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YinlexinxiEntity yinlexinxi){
        EntityWrapper< YinlexinxiEntity> ew = new EntityWrapper< YinlexinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yinlexinxi, "yinlexinxi")); 
		YinlexinxiView yinlexinxiView =  yinlexinxiService.selectView(ew);
		return R.ok("查询音乐信息成功").put("data", yinlexinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YinlexinxiEntity yinlexinxi = yinlexinxiService.selectById(id);
		yinlexinxi.setClicknum(yinlexinxi.getClicknum()+1);
		yinlexinxi.setClicktime(new Date());
		yinlexinxiService.updateById(yinlexinxi);
        return R.ok().put("data", yinlexinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YinlexinxiEntity yinlexinxi = yinlexinxiService.selectById(id);
		yinlexinxi.setClicknum(yinlexinxi.getClicknum()+1);
		yinlexinxi.setClicktime(new Date());
		yinlexinxiService.updateById(yinlexinxi);
        return R.ok().put("data", yinlexinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YinlexinxiEntity yinlexinxi, HttpServletRequest request){
    	yinlexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinlexinxi);

        yinlexinxiService.insert(yinlexinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YinlexinxiEntity yinlexinxi, HttpServletRequest request){
    	yinlexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinlexinxi);

        yinlexinxiService.insert(yinlexinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YinlexinxiEntity yinlexinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinlexinxi);
        yinlexinxiService.updateById(yinlexinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yinlexinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YinlexinxiEntity> wrapper = new EntityWrapper<YinlexinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yinlexinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,YinlexinxiEntity yinlexinxi, HttpServletRequest request,String pre){
        EntityWrapper<YinlexinxiEntity> ew = new EntityWrapper<YinlexinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = yinlexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlexinxi), params), params));
        return R.ok().put("data", page);
    }


}

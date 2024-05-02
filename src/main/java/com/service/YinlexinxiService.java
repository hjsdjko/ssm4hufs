package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinlexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinlexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinlexinxiView;


/**
 * 音乐信息
 *
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface YinlexinxiService extends IService<YinlexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinlexinxiVO> selectListVO(Wrapper<YinlexinxiEntity> wrapper);
   	
   	YinlexinxiVO selectVO(@Param("ew") Wrapper<YinlexinxiEntity> wrapper);
   	
   	List<YinlexinxiView> selectListView(Wrapper<YinlexinxiEntity> wrapper);
   	
   	YinlexinxiView selectView(@Param("ew") Wrapper<YinlexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinlexinxiEntity> wrapper);
   	
}


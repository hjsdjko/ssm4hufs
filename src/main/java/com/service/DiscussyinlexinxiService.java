package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyinlexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyinlexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyinlexinxiView;


/**
 * 音乐信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface DiscussyinlexinxiService extends IService<DiscussyinlexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyinlexinxiVO> selectListVO(Wrapper<DiscussyinlexinxiEntity> wrapper);
   	
   	DiscussyinlexinxiVO selectVO(@Param("ew") Wrapper<DiscussyinlexinxiEntity> wrapper);
   	
   	List<DiscussyinlexinxiView> selectListView(Wrapper<DiscussyinlexinxiEntity> wrapper);
   	
   	DiscussyinlexinxiView selectView(@Param("ew") Wrapper<DiscussyinlexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyinlexinxiEntity> wrapper);
   	
}


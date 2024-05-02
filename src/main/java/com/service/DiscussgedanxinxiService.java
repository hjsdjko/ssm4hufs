package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgedanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgedanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgedanxinxiView;


/**
 * 歌单信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface DiscussgedanxinxiService extends IService<DiscussgedanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgedanxinxiVO> selectListVO(Wrapper<DiscussgedanxinxiEntity> wrapper);
   	
   	DiscussgedanxinxiVO selectVO(@Param("ew") Wrapper<DiscussgedanxinxiEntity> wrapper);
   	
   	List<DiscussgedanxinxiView> selectListView(Wrapper<DiscussgedanxinxiEntity> wrapper);
   	
   	DiscussgedanxinxiView selectView(@Param("ew") Wrapper<DiscussgedanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgedanxinxiEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GedanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GedanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GedanleixingView;


/**
 * 歌单类型
 *
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface GedanleixingService extends IService<GedanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GedanleixingVO> selectListVO(Wrapper<GedanleixingEntity> wrapper);
   	
   	GedanleixingVO selectVO(@Param("ew") Wrapper<GedanleixingEntity> wrapper);
   	
   	List<GedanleixingView> selectListView(Wrapper<GedanleixingEntity> wrapper);
   	
   	GedanleixingView selectView(@Param("ew") Wrapper<GedanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GedanleixingEntity> wrapper);
   	
}


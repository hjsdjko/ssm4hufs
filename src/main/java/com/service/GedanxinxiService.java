package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GedanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GedanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GedanxinxiView;


/**
 * 歌单信息
 *
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface GedanxinxiService extends IService<GedanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GedanxinxiVO> selectListVO(Wrapper<GedanxinxiEntity> wrapper);
   	
   	GedanxinxiVO selectVO(@Param("ew") Wrapper<GedanxinxiEntity> wrapper);
   	
   	List<GedanxinxiView> selectListView(Wrapper<GedanxinxiEntity> wrapper);
   	
   	GedanxinxiView selectView(@Param("ew") Wrapper<GedanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GedanxinxiEntity> wrapper);
   	
}


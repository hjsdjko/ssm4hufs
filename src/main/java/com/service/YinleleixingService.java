package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinleleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinleleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinleleixingView;


/**
 * 音乐类型
 *
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface YinleleixingService extends IService<YinleleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinleleixingVO> selectListVO(Wrapper<YinleleixingEntity> wrapper);
   	
   	YinleleixingVO selectVO(@Param("ew") Wrapper<YinleleixingEntity> wrapper);
   	
   	List<YinleleixingView> selectListView(Wrapper<YinleleixingEntity> wrapper);
   	
   	YinleleixingView selectView(@Param("ew") Wrapper<YinleleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinleleixingEntity> wrapper);
   	
}


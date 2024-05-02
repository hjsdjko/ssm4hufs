package com.dao;

import com.entity.YinleleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinleleixingVO;
import com.entity.view.YinleleixingView;


/**
 * 音乐类型
 * 
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface YinleleixingDao extends BaseMapper<YinleleixingEntity> {
	
	List<YinleleixingVO> selectListVO(@Param("ew") Wrapper<YinleleixingEntity> wrapper);
	
	YinleleixingVO selectVO(@Param("ew") Wrapper<YinleleixingEntity> wrapper);
	
	List<YinleleixingView> selectListView(@Param("ew") Wrapper<YinleleixingEntity> wrapper);

	List<YinleleixingView> selectListView(Pagination page,@Param("ew") Wrapper<YinleleixingEntity> wrapper);
	
	YinleleixingView selectView(@Param("ew") Wrapper<YinleleixingEntity> wrapper);
	
}

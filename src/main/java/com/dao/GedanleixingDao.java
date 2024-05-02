package com.dao;

import com.entity.GedanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GedanleixingVO;
import com.entity.view.GedanleixingView;


/**
 * 歌单类型
 * 
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface GedanleixingDao extends BaseMapper<GedanleixingEntity> {
	
	List<GedanleixingVO> selectListVO(@Param("ew") Wrapper<GedanleixingEntity> wrapper);
	
	GedanleixingVO selectVO(@Param("ew") Wrapper<GedanleixingEntity> wrapper);
	
	List<GedanleixingView> selectListView(@Param("ew") Wrapper<GedanleixingEntity> wrapper);

	List<GedanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<GedanleixingEntity> wrapper);
	
	GedanleixingView selectView(@Param("ew") Wrapper<GedanleixingEntity> wrapper);
	
}

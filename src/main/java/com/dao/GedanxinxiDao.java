package com.dao;

import com.entity.GedanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GedanxinxiVO;
import com.entity.view.GedanxinxiView;


/**
 * 歌单信息
 * 
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface GedanxinxiDao extends BaseMapper<GedanxinxiEntity> {
	
	List<GedanxinxiVO> selectListVO(@Param("ew") Wrapper<GedanxinxiEntity> wrapper);
	
	GedanxinxiVO selectVO(@Param("ew") Wrapper<GedanxinxiEntity> wrapper);
	
	List<GedanxinxiView> selectListView(@Param("ew") Wrapper<GedanxinxiEntity> wrapper);

	List<GedanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GedanxinxiEntity> wrapper);
	
	GedanxinxiView selectView(@Param("ew") Wrapper<GedanxinxiEntity> wrapper);
	
}

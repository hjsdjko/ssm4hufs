package com.dao;

import com.entity.YinlexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinlexinxiVO;
import com.entity.view.YinlexinxiView;


/**
 * 音乐信息
 * 
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface YinlexinxiDao extends BaseMapper<YinlexinxiEntity> {
	
	List<YinlexinxiVO> selectListVO(@Param("ew") Wrapper<YinlexinxiEntity> wrapper);
	
	YinlexinxiVO selectVO(@Param("ew") Wrapper<YinlexinxiEntity> wrapper);
	
	List<YinlexinxiView> selectListView(@Param("ew") Wrapper<YinlexinxiEntity> wrapper);

	List<YinlexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YinlexinxiEntity> wrapper);
	
	YinlexinxiView selectView(@Param("ew") Wrapper<YinlexinxiEntity> wrapper);
	
}

package com.dao;

import com.entity.DiscussyinlexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyinlexinxiVO;
import com.entity.view.DiscussyinlexinxiView;


/**
 * 音乐信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface DiscussyinlexinxiDao extends BaseMapper<DiscussyinlexinxiEntity> {
	
	List<DiscussyinlexinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyinlexinxiEntity> wrapper);
	
	DiscussyinlexinxiVO selectVO(@Param("ew") Wrapper<DiscussyinlexinxiEntity> wrapper);
	
	List<DiscussyinlexinxiView> selectListView(@Param("ew") Wrapper<DiscussyinlexinxiEntity> wrapper);

	List<DiscussyinlexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyinlexinxiEntity> wrapper);
	
	DiscussyinlexinxiView selectView(@Param("ew") Wrapper<DiscussyinlexinxiEntity> wrapper);
	
}

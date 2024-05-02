package com.dao;

import com.entity.DiscussgedanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussgedanxinxiVO;
import com.entity.view.DiscussgedanxinxiView;


/**
 * 歌单信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-28 10:22:46
 */
public interface DiscussgedanxinxiDao extends BaseMapper<DiscussgedanxinxiEntity> {
	
	List<DiscussgedanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussgedanxinxiEntity> wrapper);
	
	DiscussgedanxinxiVO selectVO(@Param("ew") Wrapper<DiscussgedanxinxiEntity> wrapper);
	
	List<DiscussgedanxinxiView> selectListView(@Param("ew") Wrapper<DiscussgedanxinxiEntity> wrapper);

	List<DiscussgedanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgedanxinxiEntity> wrapper);
	
	DiscussgedanxinxiView selectView(@Param("ew") Wrapper<DiscussgedanxinxiEntity> wrapper);
	
}

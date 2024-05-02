package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussyinlexinxiDao;
import com.entity.DiscussyinlexinxiEntity;
import com.service.DiscussyinlexinxiService;
import com.entity.vo.DiscussyinlexinxiVO;
import com.entity.view.DiscussyinlexinxiView;

@Service("discussyinlexinxiService")
public class DiscussyinlexinxiServiceImpl extends ServiceImpl<DiscussyinlexinxiDao, DiscussyinlexinxiEntity> implements DiscussyinlexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyinlexinxiEntity> page = this.selectPage(
                new Query<DiscussyinlexinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyinlexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyinlexinxiEntity> wrapper) {
		  Page<DiscussyinlexinxiView> page =new Query<DiscussyinlexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyinlexinxiVO> selectListVO(Wrapper<DiscussyinlexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyinlexinxiVO selectVO(Wrapper<DiscussyinlexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyinlexinxiView> selectListView(Wrapper<DiscussyinlexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyinlexinxiView selectView(Wrapper<DiscussyinlexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

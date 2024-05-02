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


import com.dao.DiscussgedanxinxiDao;
import com.entity.DiscussgedanxinxiEntity;
import com.service.DiscussgedanxinxiService;
import com.entity.vo.DiscussgedanxinxiVO;
import com.entity.view.DiscussgedanxinxiView;

@Service("discussgedanxinxiService")
public class DiscussgedanxinxiServiceImpl extends ServiceImpl<DiscussgedanxinxiDao, DiscussgedanxinxiEntity> implements DiscussgedanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgedanxinxiEntity> page = this.selectPage(
                new Query<DiscussgedanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussgedanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgedanxinxiEntity> wrapper) {
		  Page<DiscussgedanxinxiView> page =new Query<DiscussgedanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgedanxinxiVO> selectListVO(Wrapper<DiscussgedanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgedanxinxiVO selectVO(Wrapper<DiscussgedanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgedanxinxiView> selectListView(Wrapper<DiscussgedanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgedanxinxiView selectView(Wrapper<DiscussgedanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

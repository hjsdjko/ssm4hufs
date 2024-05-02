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


import com.dao.GedanleixingDao;
import com.entity.GedanleixingEntity;
import com.service.GedanleixingService;
import com.entity.vo.GedanleixingVO;
import com.entity.view.GedanleixingView;

@Service("gedanleixingService")
public class GedanleixingServiceImpl extends ServiceImpl<GedanleixingDao, GedanleixingEntity> implements GedanleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GedanleixingEntity> page = this.selectPage(
                new Query<GedanleixingEntity>(params).getPage(),
                new EntityWrapper<GedanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GedanleixingEntity> wrapper) {
		  Page<GedanleixingView> page =new Query<GedanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GedanleixingVO> selectListVO(Wrapper<GedanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GedanleixingVO selectVO(Wrapper<GedanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GedanleixingView> selectListView(Wrapper<GedanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GedanleixingView selectView(Wrapper<GedanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

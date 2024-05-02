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


import com.dao.YinleleixingDao;
import com.entity.YinleleixingEntity;
import com.service.YinleleixingService;
import com.entity.vo.YinleleixingVO;
import com.entity.view.YinleleixingView;

@Service("yinleleixingService")
public class YinleleixingServiceImpl extends ServiceImpl<YinleleixingDao, YinleleixingEntity> implements YinleleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinleleixingEntity> page = this.selectPage(
                new Query<YinleleixingEntity>(params).getPage(),
                new EntityWrapper<YinleleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinleleixingEntity> wrapper) {
		  Page<YinleleixingView> page =new Query<YinleleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinleleixingVO> selectListVO(Wrapper<YinleleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinleleixingVO selectVO(Wrapper<YinleleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinleleixingView> selectListView(Wrapper<YinleleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinleleixingView selectView(Wrapper<YinleleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

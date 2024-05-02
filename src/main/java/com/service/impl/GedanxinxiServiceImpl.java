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


import com.dao.GedanxinxiDao;
import com.entity.GedanxinxiEntity;
import com.service.GedanxinxiService;
import com.entity.vo.GedanxinxiVO;
import com.entity.view.GedanxinxiView;

@Service("gedanxinxiService")
public class GedanxinxiServiceImpl extends ServiceImpl<GedanxinxiDao, GedanxinxiEntity> implements GedanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GedanxinxiEntity> page = this.selectPage(
                new Query<GedanxinxiEntity>(params).getPage(),
                new EntityWrapper<GedanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GedanxinxiEntity> wrapper) {
		  Page<GedanxinxiView> page =new Query<GedanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GedanxinxiVO> selectListVO(Wrapper<GedanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GedanxinxiVO selectVO(Wrapper<GedanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GedanxinxiView> selectListView(Wrapper<GedanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GedanxinxiView selectView(Wrapper<GedanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

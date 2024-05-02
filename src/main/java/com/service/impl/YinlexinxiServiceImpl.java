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


import com.dao.YinlexinxiDao;
import com.entity.YinlexinxiEntity;
import com.service.YinlexinxiService;
import com.entity.vo.YinlexinxiVO;
import com.entity.view.YinlexinxiView;

@Service("yinlexinxiService")
public class YinlexinxiServiceImpl extends ServiceImpl<YinlexinxiDao, YinlexinxiEntity> implements YinlexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinlexinxiEntity> page = this.selectPage(
                new Query<YinlexinxiEntity>(params).getPage(),
                new EntityWrapper<YinlexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinlexinxiEntity> wrapper) {
		  Page<YinlexinxiView> page =new Query<YinlexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinlexinxiVO> selectListVO(Wrapper<YinlexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinlexinxiVO selectVO(Wrapper<YinlexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinlexinxiView> selectListView(Wrapper<YinlexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinlexinxiView selectView(Wrapper<YinlexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

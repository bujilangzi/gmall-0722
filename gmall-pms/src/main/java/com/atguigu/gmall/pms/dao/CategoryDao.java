package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhaohuiyong
 * @email 1963880581@qq.com
 * @date 2020-04-25 19:57:36
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

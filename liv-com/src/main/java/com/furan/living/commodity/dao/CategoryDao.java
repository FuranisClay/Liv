package com.furan.living.commodity.dao;

import com.furan.living.commodity.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品分类表
 * 
 * @author furan
 * @email cryxctk@outlook.com
 * @date 2024-07-29 14:58:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

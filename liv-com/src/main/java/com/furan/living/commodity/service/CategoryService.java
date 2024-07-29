package com.furan.living.commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.furan.common.utils.PageUtils;
import com.furan.living.commodity.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品分类表
 *
 * @author furan
 * @email cryxctk@outlook.com
 * @date 2024-07-29 14:58:51
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


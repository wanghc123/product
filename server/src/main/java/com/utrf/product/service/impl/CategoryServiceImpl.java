package com.utrf.product.service.impl;

import com.utrf.product.dao.CategoryMapper;
import com.utrf.product.data.ProductCategory;
import com.utrf.product.service.sv.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @author: wanghongchun
 * @date: 2019/2/19
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return null;
    }
}

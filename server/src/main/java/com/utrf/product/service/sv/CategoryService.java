package com.utrf.product.service.sv;

import com.utrf.product.data.ProductCategory;

import java.util.List;

/**
 * @Description:
 * @author: wanghongchun
 * @date: 2019/2/19
 */
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

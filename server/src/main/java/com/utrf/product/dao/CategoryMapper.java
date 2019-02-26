package com.utrf.product.dao;

import com.utrf.product.data.ProductCategory;
import com.utrf.product.sql.GategorySql;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @author: wanghongchun
 * @date: 2019/2/19
 */
public interface CategoryMapper {
    @SelectProvider(type = GategorySql.class,method ="queryGategoryByIds")
    List<ProductCategory> findByCategoryTypeIn();

}

package com.utrf.product.sql;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @author: wanghongchun
 * @date: 2019/2/19
 */
public class GategorySql {
    public String queryGategoryByIds(Map<String, Object> param){
        String sql = new SQL(){
            {
                SELECT("*");
                FROM("product_category");
            }
        }.toString();
        return sql;
    }
}

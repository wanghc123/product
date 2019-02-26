package com.utrf.product.controller;

import com.utrf.product.data.ProductInfo;
import com.utrf.product.service.sv.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

/**
 * @Description:
 * @author: wanghongchun
 * @date: 2019/2/25
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @PostMapping("/listForOrder")
    public String listForOrder(String id){
        System.out.println(id);
        return "hello"+1;
    }
}

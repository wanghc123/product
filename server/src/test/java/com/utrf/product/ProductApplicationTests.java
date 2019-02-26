package com.utrf.product;

import com.utrf.product.dao.CategoryMapper;
import com.utrf.product.data.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {
	@Autowired
	CategoryMapper sv;

	@Test
	public void contextLoads() {
		List<ProductCategory> ls = sv.findByCategoryTypeIn();
		System.out.println(1);
	}

}

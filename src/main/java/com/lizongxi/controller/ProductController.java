package com.lizongxi.controller;

import com.lizongxi.pojo.TProduct;
import com.lizongxi.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName ProductController.java
 * @Description TODO
 * @createTime 2022年07月01日 21:12:00
 */

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @RequestMapping("list")
    public List<TProduct> getProducts(){
        return productService.getProducts();
    }
}

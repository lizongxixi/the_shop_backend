package com.lizongxi.service.Impl;

import com.lizongxi.mapper.TProductMapper;
import com.lizongxi.pojo.TProduct;
import com.lizongxi.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName ProductServiceImpl.java
 * @Description TODO
 * @createTime 2022年07月01日 20:52:00
 */
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    TProductMapper tProductMapper;
    public void addProduct(TProduct tProduct) {
        tProductMapper.insert(tProduct);
    }

    public List<TProduct> getProducts() {
        return tProductMapper.list();
    }
}

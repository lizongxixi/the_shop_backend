package com.lizongxi.service;

import com.lizongxi.pojo.TProduct;

import java.util.List;

public interface IProductService {
    void addProduct(TProduct tProduct);
    List<TProduct> getProducts();
}

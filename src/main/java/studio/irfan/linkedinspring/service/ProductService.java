package studio.irfan.linkedinspring.service;


import studio.irfan.linkedinspring.data.Product;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductService {
    @Transactional
    List<Product> getProducts(int startId, int endId);

    @Transactional
    boolean addProduct(Product product);
}

package studio.irfan.linkedinspring.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import studio.irfan.linkedinspring.data.Product;
import studio.irfan.linkedinspring.repository.ProductRepository;
import studio.irfan.linkedinspring.service.ProductService;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServieImpl implements ProductService {
    @Autowired
    public ProductRepository productRepository;

    @Transactional
    public List<Product> getProducts(int startId, int pages) {
        Page<Product> page = productRepository.findAll(PageRequest.of(0, 1));
        return page.stream().toList();
    }
}

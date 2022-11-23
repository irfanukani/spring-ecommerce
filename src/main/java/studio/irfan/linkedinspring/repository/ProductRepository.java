package studio.irfan.linkedinspring.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import studio.irfan.linkedinspring.data.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}

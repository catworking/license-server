package cn.catwork.license.server.jpa.repository;

import cn.catwork.license.server.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by figo-007 on 2017/3/16.
 */
@RepositoryRestResource(path="product")
public interface ProductRepository extends JpaRepository<Product, Long> {
}

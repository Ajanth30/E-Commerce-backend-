package com.practice.ECommerce.app.dao;

import com.practice.ECommerce.app.Entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product_category",path = "category")
public interface ProductCategoryRepo extends JpaRepository<ProductCategory,Long> {
}

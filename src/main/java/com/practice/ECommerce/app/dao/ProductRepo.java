package com.practice.ECommerce.app.dao;

import com.practice.ECommerce.app.Entity.Product;
import com.practice.ECommerce.app.Entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepo extends JpaRepository<Product,Long> {


}

package com.raushan.shopify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raushan.shopify.entities.MedicneProduct;

public interface MedicineRepository extends JpaRepository <MedicneProduct, Integer>{

}

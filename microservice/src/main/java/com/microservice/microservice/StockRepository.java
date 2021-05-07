package com.microservice.microservice;
import com.microservice.microservice.Stock;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer>
{

    List<Stock> findAll();
    Stock findById(String id);
    Stock findTop1ByOrderByIdDesc();

}
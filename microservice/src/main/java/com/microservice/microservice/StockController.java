package com.microservice.microservice;

import com.microservice.microservice.Stock;
import com.microservice.microservice.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock-quote-manager")
public class StockController
{
        @Autowired
        private StockRepository repository;

        @GetMapping
        public ResponseEntity getAll()
        {
            if (repository.count() > 0)
            {
                return ResponseEntity.ok(repository.findAll());
            }
            else
            {
                return ResponseEntity.noContent().build();
            }
        }

        @GetMapping("/findById/{id}")
        public ResponseEntity findById(@RequestParam String id)
        {
            if (id.equals(null))
            {
                return ResponseEntity.notFound().build();
            }
            else
            {
                return ResponseEntity.ok(repository.findById(id));
            }
        }

        @PostMapping("/register-stock")
        public ResponseEntity registerStock(@RequestBody Stock stock)
        {
            repository.save(stock);
            return ResponseEntity.created(null).build();
        }

}


package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findAll();

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
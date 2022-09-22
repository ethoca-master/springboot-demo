package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findAll();

    @Query(value = "SELECT * FROM CUSTOMER WHERE FIRST_NAME = :firstName", nativeQuery = true)
    List<Customer> findByFirstName(@Param("firstName") String firstName);

    Customer findById(long id);
}
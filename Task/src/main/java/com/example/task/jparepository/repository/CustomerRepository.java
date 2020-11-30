package com.example.task.jparepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.example.task.jparepository.model.Customer;

//@NoRepositoryBean
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
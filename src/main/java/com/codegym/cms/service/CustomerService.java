package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface CustomerService extends CrudRepository<Customer, Long> {
    Page<Customer> findAll(Pageable pageInfo);

    Iterable<Customer> search(String keyword);

    Page<Customer> search(String keyword, Pageable pageInfo);

    boolean existsByEmail(String email);
}

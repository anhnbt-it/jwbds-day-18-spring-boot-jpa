package com.codegym.cms.validator;

import com.codegym.cms.model.Customer;
import com.codegym.cms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, Customer> {
    @Autowired
    private CustomerService customerService;

    @Override
    public boolean isValid(Customer value, ConstraintValidatorContext context) {
        return customerService.existsByEmail(value.getEmail());
    }
}

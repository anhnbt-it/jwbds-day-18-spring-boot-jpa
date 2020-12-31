package com.codegym.cms.service.impl;

import com.codegym.cms.model.Province;
import com.codegym.cms.repository.ProvinceRepository;
import com.codegym.cms.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public <S extends Province> S save(S entity) {
        return provinceRepository.save(entity);
    }

    @Override
    public <S extends Province> Iterable<S> saveAll(Iterable<S> entities) {
        return provinceRepository.saveAll(entities);
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return provinceRepository.existsById(id);
    }

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Iterable<Province> findAllById(Iterable<Long> ids) {
        return provinceRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return provinceRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        provinceRepository.deleteById(id);
    }

    @Override
    public void delete(Province entity) {
        provinceRepository.delete(entity);
    }

    @Override
    public void deleteAll(Iterable<? extends Province> entities) {
        provinceRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        provinceRepository.deleteAll();
    }
}

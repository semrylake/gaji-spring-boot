package com.gajiku.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.gajiku.entity.Gaji;
import com.gajiku.repository.GajiRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GajiService {

    @Autowired
    private GajiRepository repository;

    public Iterable<Gaji> findAll() {
        return repository.findAll();
    }

    public void addGaji(Gaji gaji) {
        repository.save(gaji);
    }

    public void destroyGajiById(Long id) {
        repository.deleteById(id);
    }

    public Optional<Gaji> findById(long id) {
        return repository.findById(id);
    }

}

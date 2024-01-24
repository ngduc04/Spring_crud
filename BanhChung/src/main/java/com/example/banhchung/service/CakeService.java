package com.example.banhchung.service;
import com.example.banhchung.model.Cake;
import com.example.banhchung.repository.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeService {
    @Autowired
    public CakeRepository cakeRepository;

    public List<Cake> getCakeList () {
        return cakeRepository.getCakeList ( );
    }

    public void createCake ( Cake cake ) {
        cakeRepository.createCake ( cake );
    }
}
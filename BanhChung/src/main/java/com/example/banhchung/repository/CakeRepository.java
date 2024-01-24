package com.example.banhchung.repository;
import com.example.banhchung.model.Cake;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CakeRepository {
    List<Cake> list = new ArrayList<> ( );



    public List<Cake> getCakeList () {
        return list;
    }

    public void createCake ( Cake cake ) {
        list.add ( cake );
    }
}
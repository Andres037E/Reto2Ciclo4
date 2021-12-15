/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2.repositorio;

import Reto2.interfaces.InterfaceFootwears;
import Reto2.modelo.Footwears;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository
public class FootwearsRepositorio {
    @Autowired
    private InterfaceFootwears repository;

    public List<Footwears> getAll() {
        return repository.findAll();
    }

    public Optional<Footwears> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Footwears create(Footwears clothe) {
        return repository.save(clothe);
    }

    public void update(Footwears clothe) {
        repository.save(clothe);
    }
    
    public void delete(Footwears clothe) {
        repository.delete(clothe);
    }
}



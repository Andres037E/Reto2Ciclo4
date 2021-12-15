    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2.servicio;

import Reto2.modelo.Footwears;
import Reto2.repositorio.FootwearsRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class FootwearsService {
    @Autowired
    private FootwearsRepositorio clotheRepository;

    public List<Footwears> getAll() {
        return clotheRepository.getAll();
    }

   public Optional<Footwears> getClothe(String reference) {
        return clotheRepository.getClothe(reference);
    }

    public Footwears create(Footwears accesory) {
        if (accesory.getReference() == null) {
            return accesory;
        } else {
            return clotheRepository.create(accesory);
        }
    }

    public Footwears update(Footwears accesory) {

        if (accesory.getReference() != null) {
            Optional<Footwears> accessoryDb = clotheRepository.getClothe(accesory.getReference());
            if (!accessoryDb.isEmpty()) {
                
                if (accesory.getBrand()!= null) {
                    accessoryDb.get().setBrand(accesory.getBrand());
                }
                
                if (accesory.getCategory() != null) {
                    accessoryDb.get().setCategory(accesory.getCategory());
                }
                 if (accesory.getMaterial() != null) {
                    accessoryDb.get().setMaterial(accesory.getMaterial());
                
                }
                if (accesory.getGender() != null) {
                    accessoryDb.get().setGender(accesory.getGender());
                }
                if (accesory.getSize() != null) {
                    accessoryDb.get().setSize(accesory.getSize());
                }
                if (accesory.getDescription() != null) {
                    accessoryDb.get().setDescription(accesory.getDescription());
                }
                if (accesory.getPrice() != 0.0) {
                    accessoryDb.get().setPrice(accesory.getPrice());
                }
                
                
                if (accesory.getQuantity() != 0) {
                    accessoryDb.get().setQuantity(accesory.getQuantity());
                }
                if (accesory.getPhotography() != null) {
                    accessoryDb.get().setPhotography(accesory.getPhotography());
                }
                accessoryDb.get().setAvailability(accesory.isAvailability());
                clotheRepository.update(accessoryDb.get());
                return accessoryDb.get();
            } else {
                return accesory;
            }
        } else {
            return accesory;
        }
    }

    public boolean delete(String reference) {
        Boolean aBoolean = getClothe(reference).map(accesory -> {
            clotheRepository.delete(accesory);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
    
}


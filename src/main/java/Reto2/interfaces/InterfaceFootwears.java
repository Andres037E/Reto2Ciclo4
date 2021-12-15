/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2.interfaces;

import Reto2.modelo.Footwears;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Lenovo
 */
public interface InterfaceFootwears extends MongoRepository<Footwears, String> {
    
}

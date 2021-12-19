/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.modelo.Cookware;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.InterfaceCookware;

/**
 *
 * @author USUARIO
 */
@Repository
public class CookwareRepositorio {
    @Autowired
    private InterfaceCookware repository;

    public List<Cookware> getAll() {
        return repository.findAll();
    }

    public Optional<Cookware> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Cookware create(Cookware clothe) {
        return repository.save(clothe);
    }

    public void update(Cookware clothe) {
        repository.save(clothe);
    }
    
    public void delete(Cookware clothe) {
        repository.delete(clothe);
    }
}

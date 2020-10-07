package br.com.daione.pavan.controllers;

import br.com.daione.pavan.entities.TypeEntity;
import br.com.daione.pavan.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController("/type")
public class Main {

    @Autowired
    private TypeService service;

    @PostMapping("/insert-all")
    public Stream<TypeEntity> saveAll (@RequestBody List<TypeEntity> typeEntities){
        return typeEntities.stream().map(typeEntity -> this.service.save(typeEntity));
    }


}

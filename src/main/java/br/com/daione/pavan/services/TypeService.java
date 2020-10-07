package br.com.daione.pavan.services;

import br.com.daione.pavan.entities.TypeEntity;
import br.com.daione.pavan.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
public class TypeService {
    @Autowired
    private TypeRepository repository;

    public List<TypeEntity> listAll(){
        return this.repository.findAll();
    }

    public TypeEntity save(TypeEntity typeEntity){
        return this.repository.save(typeEntity);
    }

    public void delete(Integer id){
        this.repository.deleteById(id);
    }

    public Optional<TypeEntity> findEntity(Integer id){
        return this.repository.findById(id);
    }

    public void update(Integer id, TypeEntity newEntity){
        TypeEntity oldEntity = this.findEntity(id).get();
        oldEntity.setGoogleMapsNameType(StringUtils.isEmpty(newEntity.getGoogleMapsNameType()) ? oldEntity.getGoogleMapsNameType(): newEntity.getGoogleMapsNameType());
        oldEntity.setNameTranslatedPortuguese(StringUtils.isEmpty(newEntity.getNameTranslatedPortuguese())? oldEntity.getNameTranslatedPortuguese(): newEntity.getNameTranslatedPortuguese());
        this.save(oldEntity);
    }
}

package br.com.daione.pavan.entities;

import javax.persistence.*;

@Entity
@Table(name="TYPE")
public class TypeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)private Integer id;
    private String nameTranslatedPortuguese;
    private String googleMapsNameType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTranslatedPortuguese() {
        return nameTranslatedPortuguese;
    }

    public void setNameTranslatedPortuguese(String nameTranslatedPortuguese) {
        this.nameTranslatedPortuguese = nameTranslatedPortuguese;
    }

    public String getGoogleMapsNameType() {
        return googleMapsNameType;
    }

    public void setGoogleMapsNameType(String googleMapsNameType) {
        this.googleMapsNameType = googleMapsNameType;
    }
}

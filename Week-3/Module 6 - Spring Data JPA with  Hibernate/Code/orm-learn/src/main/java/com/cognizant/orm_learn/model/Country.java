package com.cognizant.orm_learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="country")
public class Country {
    @Id
    @Column(name="co_code")
    private String  id ;

    @Column(name="co_name")
    private String name ;


    public Country() {}

    public Country(String code, String name) {
        this.id = code ;
        this.name = name ;
    }


    public String  getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String  id) {
        this.id = id;
    }


    @Override
    public String toString(){
        return "Country{"+
                "id=" + id +
                " , name='" + name +'\''+
                '}';
    }
}

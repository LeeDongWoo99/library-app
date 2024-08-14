package com.group.libraryapp.domain.address;

import com.group.libraryapp.domain.person.Person;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;
    private String city;
    private String street;
    @OneToOne
    private Person person;
}


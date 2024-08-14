package com.group.libraryapp.domain.person;

import com.group.libraryapp.domain.address.Address;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id = null;
    private String name;
    @OneToOne
    private Address address;
}

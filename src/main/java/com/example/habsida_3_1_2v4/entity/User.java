package com.example.habsida_3_1_2v4.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "occupation")
    private String occupation;
    @Column(name = "income")
    private int income;

    public User() {
    }

    public User(String name, String lastName, String occupation, int income) {
        this.name = name;
        this.lastName = lastName;
        this.occupation = occupation;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getIncome() {
        return income;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}

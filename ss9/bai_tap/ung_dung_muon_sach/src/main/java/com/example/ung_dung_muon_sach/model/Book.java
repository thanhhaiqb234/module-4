package com.example.ung_dung_muon_sach.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false , unique = true)
    private String name;

    @Column(name = "quantity",nullable = false)
    private int quantity;

    @Column(name = "content" , nullable = false)
    private String content;


    @OneToMany(mappedBy = "book")
    private Set<Order> orders;

    public Book() {
    }

    public Book(int id, String name, int quantity, String content, Set<Order> orders) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.content = content;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}

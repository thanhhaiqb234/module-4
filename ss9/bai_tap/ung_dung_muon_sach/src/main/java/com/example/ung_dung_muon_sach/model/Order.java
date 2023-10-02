package com.example.ung_dung_muon_sach.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "book_id",referencedColumnName = "id")
    private Book book;

    @Column(name = "borrow_code", nullable = false,unique = true)
    private String borrowcCode;


    @Column(name = "status",nullable = false , columnDefinition = "varchar(50) check (status in ('borrowing' , 'returned'))")
    private String status;

    public Order() {
    }

    public Order(int id, Book book, String borrowcCode, String status) {
        this.id = id;
        this.book = book;
        this.borrowcCode = borrowcCode;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBorrowcCode() {
        return borrowcCode;
    }

    public void setBorrowcCode(String borrowcCode) {
        this.borrowcCode = borrowcCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

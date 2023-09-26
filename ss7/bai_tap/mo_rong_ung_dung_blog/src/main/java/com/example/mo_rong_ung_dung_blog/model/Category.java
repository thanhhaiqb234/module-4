package com.example.mo_rong_ung_dung_blog.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Blog> folderList;

    public Category() {
    }

    public Category(int id, String name, List<Blog> folderList) {
        this.id = id;
        this.name = name;
        this.folderList = folderList;
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

    public List<Blog> getFolderList() {
        return folderList;
    }

    public void setFolderList(List<Blog> folderList) {
        this.folderList = folderList;
    }
}

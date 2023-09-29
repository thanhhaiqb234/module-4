package com.example.validate_thong_tin_bai_hat.model;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "varchar(255) not null")
    private String name;

    @Column(columnDefinition = "varchar(255) not null")
    private String singer;
    @Column(columnDefinition = "varchar(255) not null")
    private String kindOfMusic;

    public Song() {
    }

    public Song(int id, String name, String singer, String kindOfMusic) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.kindOfMusic = kindOfMusic;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }
}

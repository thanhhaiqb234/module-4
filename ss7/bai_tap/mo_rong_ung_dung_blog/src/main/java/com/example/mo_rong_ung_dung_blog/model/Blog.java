package com.example.mo_rong_ung_dung_blog.model;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ten;
    private double gia;
    private String tenTacGia;
    private int soTrang;
    private String ngaySanXuat;
    private String anh;

    public Blog() {
    }

    public Blog(int id, String ten, double gia, String tenTacGia, int soTrang, String ngaySanXuat, String anh) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
        this.ngaySanXuat = ngaySanXuat;
        this.anh = anh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
}

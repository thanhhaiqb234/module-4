package com.example.ung_dung_muon_sach.repository;

import com.example.ung_dung_muon_sach.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Integer> {
}

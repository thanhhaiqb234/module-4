package com.example.form_dang_ky.repository;

import com.example.form_dang_ky.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface IUserRepository extends JpaRepository<User,Integer> {
    @Query(value = "select * from user",nativeQuery = true)
    Page<User> findAllByNameContaining(Pageable pageable, @Param("name") String name);
}

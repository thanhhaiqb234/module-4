package com.example.mo_rong_ung_dung_blog.repository;
import com.example.mo_rong_ung_dung_blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ICategoryRepository extends JpaRepository<Category,Integer> {
    Page<Category> findAllByNameContaining(Pageable pageable, String seachName);
}

package com.example.mo_rong_ung_dung_blog.repository;

import com.example.mo_rong_ung_dung_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    @Query(value = "select * from Blog where category_id =:categoryId and name like:nameSearch",nativeQuery = true)
    Page<Blog> findAllBy(Pageable pageable,@Param("categoryId") int categoryId,@Param("nameSearch") String nameSearch);
}

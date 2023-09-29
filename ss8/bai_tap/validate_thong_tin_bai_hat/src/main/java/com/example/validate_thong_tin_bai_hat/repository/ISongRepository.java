package com.example.validate_thong_tin_bai_hat.repository;

import com.example.validate_thong_tin_bai_hat.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRepository extends JpaRepository<Song,Integer> {
}

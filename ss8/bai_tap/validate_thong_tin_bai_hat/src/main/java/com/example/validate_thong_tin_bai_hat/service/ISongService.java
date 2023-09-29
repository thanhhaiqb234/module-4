package com.example.validate_thong_tin_bai_hat.service;

import com.example.validate_thong_tin_bai_hat.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> getAllSong();

    Song getSong(int id);

    void updateSong(Song song);

    void createSong(Song song);
}

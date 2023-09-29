package com.example.validate_thong_tin_bai_hat.service;

import com.example.validate_thong_tin_bai_hat.model.Song;
import com.example.validate_thong_tin_bai_hat.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService{

    @Autowired
    private ISongRepository songRepository;
    @Override
    public List<Song> getAllSong() {
        return songRepository.findAll();
    }

    @Override
    public Song getSong(int id) {
        return songRepository.findById(id).get();
    }

    @Override
    public void updateSong(Song song) {
        songRepository.save(song);
    }

    @Override
    public void createSong(Song song) {
        songRepository.save(song);
    }
}

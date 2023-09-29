package com.example.validate_thong_tin_bai_hat.controller;

import com.example.validate_thong_tin_bai_hat.dto.SongDto;
import com.example.validate_thong_tin_bai_hat.model.Song;
import com.example.validate_thong_tin_bai_hat.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {

    @Autowired
    private ISongService songService;

    @GetMapping("/list")
    public String getSongList(Model model) {
        List<Song> songList = songService.getAllSong();
        model.addAttribute("songList", songList);
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String getSong(@PathVariable int id, Model model,
                          @Valid SongDto songDto ) {
        Song song = songService.getSong(id);
        BeanUtils.copyProperties(song,songDto);
        model.addAttribute("songDto",songDto);
        return "edit";
    }

    @PostMapping("/update")
    public String updateSong(@Valid @ModelAttribute SongDto songDto,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes){
        new SongDto().validate(songDto,bindingResult);
        if (bindingResult.hasErrors()){
            return "edit";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDto,song);
        songService.updateSong(song);
        return "redirect:/song/list";
    }

    @GetMapping("/create")
    private String createSong(Model model) {
        model.addAttribute("songDto", new SongDto());
        return "create";
    }

    @PostMapping("/create")
    public String createSong(@Valid @ModelAttribute SongDto songDto,
                             RedirectAttributes redirectAttributes,
                             BindingResult bindingResult){
        new SongDto().validate(songDto,bindingResult);
        if (bindingResult.hasErrors()){
            return "create";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDto,song);
        songService.createSong(song);
        return "redirect:/song/list";
    }
}

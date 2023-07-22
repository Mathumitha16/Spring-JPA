package com.example.song.controller;
import com.example.song.model.*;
import com.example.song.service.SongJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
public class SongController{
@Autowired
SongJpaService song;
@GetMapping("/songs")
public ArrayList<Song> getSongs(){
    return song.getSongs();
}
@GetMapping("/songs/{id}")
public Song getSongById(@PathVariable("id") int id){
    return song.getSongById(id);

}
@PostMapping("/songs")
    public Song addSong(@RequestBody Song s){
        return song.addSong(s);
    }

@PutMapping("/songs/{id}")
public Song updateSong(@PathVariable("id") int id,@RequestBody Song s){
    return song.updateSong(id,s);
}
@DeleteMapping("/songs/{id}")
public void deleteSong(@PathVariable("id") int id){
    song.deleteSong(id);
}

}
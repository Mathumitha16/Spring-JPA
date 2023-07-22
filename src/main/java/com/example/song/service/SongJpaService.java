package com.example.song.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.example.song.repository.*;
import com.example.song.model.Song;

import java.util.*;
@Service
public class SongJpaService implements SongRepository{
    @Autowired
    SongJpaRepository songrep;
    @Override
    public ArrayList<Song> getSongs(){
        List<Song> ls = songrep.findAll();
        ArrayList<Song> list = new ArrayList<>(ls);
        return list;

    }
    @Override 
    public Song getSongById(int id){
        try{
            Song s = songrep.findById(id).get();
            return s;
        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
    @Override 
    public Song  addSong(Song s){
        songrep.save(s);
        return s;
    }
    @Override 
    public Song updateSong(int id,Song s){
        try{
            Song st = songrep.findById(id).get();
            if(s.getSongName()!=null) {
                st.setSongName(s.getSongName());
            }
            if(s.getLyricist()!=null){
                st.setLyricist(s.getLyricist());
            }
            if(s.getSinger()!=null){
                st.setSinger(s.getSinger());
            }
            if(s.getMusicDirector()!=null){
                st.setMusicDirector(s.getMusicDirector());
            }
            songrep.save(st);
            return st;

        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
    @Override 
    public void deleteSong(int id){
        try{
            songrep.deleteById(id);

        }
         catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}

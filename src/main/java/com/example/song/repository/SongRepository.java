package com.example.song.repository;
import com.example.song.model.*;
import java.util.*;
public interface SongRepository{
    ArrayList<Song> getSongs();
    Song getSongById(int id);
    Song addSong(Song s);
    Song updateSong(int id,Song s);
    void deleteSong(int id);
}


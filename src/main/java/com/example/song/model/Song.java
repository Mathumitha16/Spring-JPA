package com.example.song.model;
import javax.persistence.*;
@Entity
@Table(name="playlist")
public class Song{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="songid")
    private int songId;
    @Column(name="songname")
    private String songName;
    @Column(name="lyricist")
    private String lyricist;
    @Column(name="singer")
    private String singer;
    @Column(name="musicdirector")
    private String musicDirector;
    public Song(){}
    public Song(int id,String name,String lyric,String singer,String direct){
        this.songId=id;
        this.songName=name;
        this.lyricist=lyric;
        this.singer=singer;
        this.musicDirector=direct;
    }
    public int getSongId(){
        return this.songId;
    }
    public void setSongId(int id){
        this.songId=id;
    }
    public String getSongName(){
        return this.songName;
    }
    public void setSongName(String name){
        this.songName=name;
    }
    public String getLyricist(){
        return this.lyricist;
    }
    public void setLyricist(String name){
        this.lyricist=name;
    }
    public String getSinger(){
        return this.singer;
    }
    public void setSinger(String name){
        this.singer=name;
    }
    public String getMusicDirector(){
        return this.musicDirector;
    }
    public void setMusicDirector(String name){
        this.musicDirector=name;
    }


}
 

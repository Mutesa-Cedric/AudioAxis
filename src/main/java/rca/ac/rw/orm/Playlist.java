package rca.ac.rw.orm;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(schema = "playlists")
public class Playlist {
private String name;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int creatorId;
private ArrayList<Song> songs;
private int likes;
private int monthlyListeners;

public Playlist(String name, int creatorId,ArrayList<Song> songs){
    this.songs = songs;
    this.creatorId = creatorId;
    this.name = name;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getMonthlyListeners() {
        return monthlyListeners;
    }

    public void setMonthlyListeners(int monthlyListeners) {
        this.monthlyListeners = monthlyListeners;
    }
}

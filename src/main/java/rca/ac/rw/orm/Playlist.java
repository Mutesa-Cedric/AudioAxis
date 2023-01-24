package rca.ac.rw.orm;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Playlist {
private String name;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int creatorId;
@OneToMany(cascade = CascadeType.ALL,mappedBy = "id")
private List<Song> songs;
private int likes;
private Status status;
private int monthlyListeners;

public Playlist(String name, int creatorId,ArrayList<Song> songs, Status stat){
    this.songs = songs;
    this.creatorId = creatorId;
    this.name = name;
    this.status = stat;
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

    public List<Song> getSongs() {
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

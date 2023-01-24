package rca.ac.rw.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Song implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String artist;
    private String path;
    private String url;
    @ManyToOne()
    @JoinColumn()
    private Playlist playlists;

    public Song(String name,String artist, String path, String url){
        this.name = name;
        this.artist = artist;
        this.path = path;
        this.url = path;
    }
    public Song(String name,String artist, String path){
        this.name = name;
        this.artist = artist;
        this.path = path;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

package rca.ac.rw.orm;

import javax.persistence.*;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "artist")
    private String artist;

    @Column(name = "path")
    private String path;

    @Column(name = "url")
    private String url;

    // Getters and setters
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

    public Song(String name, String artist, String path, String url){
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

    public Song () {}
}


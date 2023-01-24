package rca.ac.rw.orm;

import javax.persistence.*;

@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int song_id;

    private String name;
    private String artist;
    private String path;
    private String url;

    public Song(){

    }

    public Song(String name,String artist, String path, String url){
        this.name = name;
        this.artist = artist;
        this.path = path;
        this.url = url;
    }

    public Song(String name,String artist, String path){
        this.name = name;
        this.artist = artist;
        this.path = path;
    }

    public String getName(){return name;}
    public String getPath(){return path;}
    public String getUrl(){return url;}
    public String getArtist(){return artist;}
}

package rca.ac.rw.orm;

public class Song {
    private String name;
    private String artist;
    private String path;
    private String url;

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
}

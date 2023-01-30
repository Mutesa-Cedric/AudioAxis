package rca.ac.rw.dao.song;

import java.util.List;

public interface Song {

    List<Song> getAllSongs();

    public Song getSongById(int id);

    public void addSong(Song song);

    public void updateSong(Song song);

    public void deleteSong(int id);
}

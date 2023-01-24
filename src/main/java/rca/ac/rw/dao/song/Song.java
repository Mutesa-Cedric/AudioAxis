package rca.ac.rw.dao.song;

import java.util.List;

public interface Song {
    public void saveSong();
    public void updateSong();
    public void deleteSong();
    public List<Song> getSongs();
}

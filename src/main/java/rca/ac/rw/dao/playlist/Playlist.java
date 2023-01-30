package rca.ac.rw.dao.playlist;

import rca.ac.rw.orm.Song;

import java.util.ArrayList;
import java.util.List;
public interface Playlist {
    Playlist getPlaylistById(int id);

    void createPlaylist(String name, int creator, ArrayList<Song> songs);

    void deletePlaylist(int id);
}

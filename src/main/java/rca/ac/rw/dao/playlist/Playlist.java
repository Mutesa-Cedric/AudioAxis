package rca.ac.rw.dao.playlist;

import rca.ac.rw.orm.Song;

import java.util.ArrayList;

public interface Playlist {


    public void createPlaylist(String name, int creator, ArrayList<Song> songs);
    public void addSong(Song song, int playListId);
    public void removeSong(int songId, int playListId);

    public void deletePlaylist(int id);
}

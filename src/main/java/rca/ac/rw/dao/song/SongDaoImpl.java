package rca.ac.rw.dao.song;

import javax.persistence.*;
import java.util.List;

public class SongDaoImpl implements Song {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Song> getAllSongs() {
        return entityManager.createQuery("SELECT s FROM Song s", Song.class).getResultList();
    }

    @Override
    public Song getSongById(int id) {
        return entityManager.find(Song.class, id);
    }

    @Override
    public void addSong(Song song) {
        entityManager.persist(song);
    }

    @Override
    public void updateSong(Song song) {
        entityManager.merge(song);
    }

    @Override
    public void deleteSong(int id) {
        Song song = getSongById(id);
        entityManager.remove(song);
    }
}

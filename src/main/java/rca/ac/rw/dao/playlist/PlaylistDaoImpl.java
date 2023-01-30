package rca.ac.rw.dao.playlist;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rca.ac.rw.orm.Song;
import javax.persistence.*;
import java.util.ArrayList;

public class PlaylistDaoImpl implements Playlist {
    private Transaction transaction = null;
    private Session session;
    PlaylistDaoImpl(Transaction trans, Session sess){
        this.session = session;
        transaction = session.beginTransaction();
    }
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Playlist getPlaylistById(int id) {
        return entityManager.find(Playlist.class, id);
    }
    @Override
    public void createPlaylist(String name, int creator, ArrayList<Song> songs) {
       try{
           rca.ac.rw.orm.Playlist newPlayList = new rca.ac.rw.orm.Playlist(name,creator,songs);
           session.save(newPlayList);
           transaction.commit();
       }catch(Exception e){
           if(transaction != null){
               transaction.rollback();
           }
           e.printStackTrace();
       }
    }

    @Override
    public void deletePlaylist(int id) {
        Playlist playlist = getPlaylistById(id);
        entityManager.remove(playlist);
    }
}

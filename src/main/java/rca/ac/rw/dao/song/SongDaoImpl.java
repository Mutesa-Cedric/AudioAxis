package rca.ac.rw.dao.song;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SongDaoImpl {
    private Session session;
    Transaction transaction=null;

    public SongDaoImpl(Session session){
        this.session=session;
    }

    public void saveSong(Song song){
        try {
            transaction = session.beginTransaction();
            session.save(song);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Song> getSongs(){
        List<Song> songs = session.createCriteria(Song.class).list();
        return songs;
    }

    public void updateSong(Song song){
        try {
            transaction = session.beginTransaction();
            session.update(song);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteSong(int id) {
        try {
            transaction = session.beginTransaction();
            Song song = (Song) session.get(Song.class, id);
            if (song != null) {
                session.delete(song);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}

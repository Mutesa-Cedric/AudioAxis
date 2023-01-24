package rca.ac.rw.starter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import rca.ac.rw.orm.Playlist;
import rca.ac.rw.orm.Song;
import rca.ac.rw.orm.User;

import java.util.ArrayList;

public class StarterApp {
    public static void main(String args[]){
        System.out.println("The configuration are being loaded");
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        System.out.println("The configuration files have been loaded");
//        ArrayList<Likes> likes
//        ArrayList<Comment> comments
        User user = new User("Mutesa Cedric" , "0782841323" , "mutesacedric@gmail.com" , "data:image/png;base64,V2I/Y87mC4rUmEnzVDleMzVJOEDra5m8UIqhp60NheQQ+RpgJw1HEGl6Avx83UhHmvR");
        Song song = new Song("Let you down","NF","./","");
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(song);
        Playlist play = new Playlist("Mood",123,songs);
        try{
            SessionFactory factory = configuration.buildSessionFactory();
            Session session = factory.openSession();

            System.out.println("Beginning Transactions..........");
            Transaction transaction = session.beginTransaction();

              session.saveOrUpdate(user);
             session.save(play);
            System.out.println("Committing transaction.............");
            transaction.commit();
            System.out.println("Before Closing the session");
            session.close();
            factory.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

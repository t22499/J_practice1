package codecademyJAVA.java03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice02 {
    public static void main(String[] args) {
        ArrayList<Playlist> playlists = new ArrayList<>();
        playlists.add(new Playlist(1,"aa"));
        playlists.add(new Playlist(2,"bb"));
        playlists.add(new Playlist(3,"cc"));
        playlists.add(new Playlist(4,"dd"));
        playlists.add(new Playlist(5,"ee"));
        System.out.println(playlists);
        Iterator<Playlist> iterator = playlists.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        System.out.println(playlists.size());
//        System.out.println(playlists.remove(1));
//        System.out.println(playlists.size());
        System.out.println(playlists);
        playlists.set(1,new Playlist(1,"aa"));
        playlists.set(0,new Playlist(2,"bb"));
//        playlists.set(1,new Playlist(2,"bb"));
        Iterator<Playlist> iterator2 = playlists.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());

        }

    }
}
class Playlist{
    int songId;
    String song;

    public Playlist() {
    }

    public Playlist(int songId, String song) {
        this.songId = songId;
        this.song = song;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "songId=" + songId +
                ", song='" + song + '\'' +
                '}';
    }
}

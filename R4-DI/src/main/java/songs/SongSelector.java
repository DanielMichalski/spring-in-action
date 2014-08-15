package songs;

import java.util.List;
import java.util.Random;

/**
 * Author: Daniel
 */
public class SongSelector {
    private List<String> songs;

    public String selectSong() {
        if (songs.size() == 0) return "";

        Random random = new Random();
        int i = random.nextInt(songs.size());
        return songs.get(i);
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}

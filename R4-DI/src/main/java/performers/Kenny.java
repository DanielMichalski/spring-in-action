package performers;

/**
 * Author: Daniel
 */
public class Kenny implements Performer {
    private String song;

    @Override
    public void perform() {
        System.out.println(getClass().getName() + ".perform()");
        System.out.println("song = " + song);
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}

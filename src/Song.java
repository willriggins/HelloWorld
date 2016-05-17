/**
 * Created by will on 5/16/16.
 */
public class Song {
    int yearReleased;
    int timesPlayed;
    double runtime;
    String artist;
    String genre;
    boolean isPopular;
    boolean onRadio;

    public Song(int yearReleased, int timesPlayed, double runtime, String artist, String genre, boolean isPopular, boolean onRadio) {
        this.yearReleased = yearReleased;
        this.timesPlayed = timesPlayed;
        this.runtime = runtime;
        this.artist = artist;
        this.genre = genre;
        this.isPopular = isPopular;
        this.onRadio = onRadio;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int newYearReleased) {
        yearReleased = newYearReleased;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }

    public void setTimesPlayed(int newTimesPlayed) {
        if (isNotPlayed(newTimesPlayed)) {
            timesPlayed = newTimesPlayed;
        }
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime (double newRuntime) {
        runtime = newRuntime;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String newArtist) {
        artist = newArtist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String newGenre) {
        genre = newGenre;
    }

    public boolean getIsPopular() {
        return isPopular;
    }

    public void setIsPopular(boolean newIsPopular) {
        isPopular = newIsPopular;
    }

    public boolean getOnRadio() {
        return onRadio;
    }

    public void setOnRadio(boolean newOnRadio) {
        onRadio = newOnRadio;
    }

    public static boolean isNotPlayed(int newTimesPlayed) {
        return newTimesPlayed > 0;
    }
}


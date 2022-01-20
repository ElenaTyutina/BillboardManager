import java.util.Date;

public class Poster {
    private String genre;
    private String name;
    private Date releaseDate;

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Poster(String genre, String name, Date releaseDate) {
        this.genre = genre;
        this.name = name;
        this.releaseDate = releaseDate;
    }
}



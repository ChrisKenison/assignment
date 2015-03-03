package models;
import java.sql.Blob;
import play.data.validation.Constraints.Required;

public class AddMovieForm {

    @Required(message="name")
    private String name;

    @Required(message="description")
    private String description;

    @Required(message="rating")
    private String rating;

    @Required(message="runLength")
    private String runLength;

    private Blob movieImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRunLength() {
        return runLength;
    }

    public void setRunLength(String runLength) {
        this.runLength = runLength;
    }

    public Blob getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(Blob movieImage) {
        this.movieImage = movieImage;
    }
}

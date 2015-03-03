package com.sofi.models;

//import org.hibernate.annotations.Type;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
 
import java.io.Serializable;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie implements Serializable {

    private static final long serialVersionUID = 4558448;

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="rating")
    private String rating;

    @Column(name="description")
    private String description;

    @Column(name="run_length")
    private String runLength;

    @Column(name="movie_img")
    private Blob movieImage;

    @Column(name="is_rented")
    private boolean isRented;

    public Movie() {

    }

    public Movie(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRunLength() {
        return runLength;
    }

    public void setRunLength(String runLength) {
        this.runLength = runLength;
    }

    public boolean getIsRented() {
        return isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }
/*
    public String getMovieImage() throws Exception{
        File image = new File("/tmp/images/image.jpeg");
        FileOutputStream fos = new FileOutputStream(image);

        byte[] buffer = new byte[1];
        InputStream is = movieImage.getBinaryStream();
        while (is.read(buffer) > 0) {
            fos.write(buffer);
        }

        fos.close();

        return "Testing";
        //return movieImage;
    }
*/
    public Blob getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(Blob movieImage) {
        this.movieImage = movieImage;
    }
}



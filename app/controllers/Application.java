package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import models.LegacyContactForm;
import models.AddMovieForm;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.about;
import views.html.contact;
import views.html.crud;
import views.html.index;
import views.html.rent;

import com.sofi.models.Movie;
import com.sofi.models.dao.MovieDao;

import play.libs.*;
import play.Logger;

@org.springframework.stereotype.Controller
public class Application extends Controller {
    @Autowired
    private MovieDao movieDao;

    public Result get() {
        return ok(index.render("Your new application is ready."));
    }

    public Result contactComplete(){
        return ok(contact.render(Form.form(LegacyContactForm.class)));
    }

    public Result contactPage(){
        return ok(contact.render(Form.form(LegacyContactForm.class)));
    }

    public Result aboutPage(){
        return ok(about.render("About"));
    }

    public Result crudPage(){
        List<Movie> movies = (List<Movie>)movieDao.findAll();

        return ok(crud.render(movies, Form.form(AddMovieForm.class)));
    }

    public Result rentPage(){
        return ok(rent.render("Rent"));
    }

    public Result removeMovie(Long id) {
        Logger.debug("Testing RemoveMovie");
        Movie movie = movieDao.deleteById(id);

        return redirect(routes.Application.crudPage());
    }

    public Result captcha(Long id) {
        Movie movie = movieDao.findById(id);
        
        try {
            BufferedImage img = ImageIO.read(movie.getMovieImage().getBinaryStream());
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            
            ImageIO.write(img, "jpg", baos);
            baos.flush();
            
            return ok(baos.toByteArray()).as("image/jpg");
        } catch(Exception e) {
            Logger.debug(e.getMessage());

            return ok(rent.render("Rent"));
        }
    }
   
    public Result addMovie() {
        Form<AddMovieForm> form = Form.form(AddMovieForm.class).bindFromRequest();
        
        if (form.hasErrors() == false) {
            Logger.debug("addMovie");
            Long id = Long.valueOf(4);
            
            AddMovieForm movieForm = form.get();
            
            Movie newMovie = new Movie(movieForm.getName());
            newMovie.setId(movieDao.findMaxID() + Long.valueOf(1));
            newMovie.setDescription(movieForm.getDescription());
            newMovie.setRunLength(movieForm.getRunLength());
            newMovie.setRating(movieForm.getRating());
            newMovie.setIsRented(false);
            Logger.debug("before setMovie");
            newMovie.setMovieImage(movieForm.getMovieImage());
            Logger.debug("after setMovie");
            movieDao.save(newMovie);
        }
        else {
            Logger.debug("Can't find form"+form.globalError());
        }

        return redirect(routes.Application.crudPage());
    }
}

import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    private int duration;


    public Movie(int duration) {
        this.duration = duration;
    }


    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

    public void watch(User user){
        user.getPurchaseMediaList().add(this);
        System.out.println(user.getUsername()+" watch "+getTitle());
    }
    public List<Movie> recommendSimilarmovies(List<Movie> movieCatalog1){
        List<Movie> movieCatalog=new ArrayList<>();
        for(Movie m : movieCatalog1){
            if(m.getAuteur().equalsIgnoreCase(this.getAuteur())&& m!=this){
                movieCatalog.add(m);
            }
        }
        return movieCatalog;
    }

    @Override
    public String getMediaType() {
        if(duration>=120){
            return"Long movie";
        }else {
            return "Movie";
        }

    }


    @Override
    public String toString() {
        return " " + getMediaType() + " " + getTitle() + " director: " + getAuteur()
                + " duration: " + duration + " Price: " + getPrice();
    }





























}

import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private String artist;

    public Music(String artist) {
        this.artist = artist;
    }
    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
    public void listen(User user){
        user.getPurchaseMediaList().add(this);
        System.out.println(user.getUsername()+" listen to: "+getTitle());
    }
    public List<Music> generatePlaylist(List<Music> musiccatalog) {
        List<Music> playlist = new ArrayList<>();
        for (Music m : musiccatalog) {
            if (m.getArtist().equalsIgnoreCase(this.getArtist()) && m != this) {
                playlist.add(m);
            }
        }
        return playlist;
    }

    @Override
    public String getMediaType() {
        if(getPrice() >= 10){
            return "Premium Music";
        }else{
            return "Music";
        }

    }

    @Override
    public String toString() {
        return " " + getMediaType() + " " + getTitle() + " artist: " + artist
                + " price: " + getPrice();
    }




























































}

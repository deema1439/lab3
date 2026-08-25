import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<User> users;
    private List<Media> medias;


    public void setUsers(List<User> users) {
        this.users = users;
    }
    public List<User> getUsers() {
        return users;
    }


    public void setMedia(List<Media> media) {
        this.medias = media;
    }

    public List<Media> getMedia() {
        return medias;
    }



    public Store() {
        this.users = new ArrayList<>();
        this.medias = new ArrayList<>();
    }

    public void addUser(User user){
         users.add(user);
    }

    public void displayUsers(User user) {
        System.out.println("<<<Registers users:>>> ");
        for(User u : users) {
            System.out.println("name: " + u.getUsername() + " email: " + u.getEmail());
        }
    }

    public void addMedia(Media media){
        medias.add(media);
    }

    public void displayMedias(){
        System.out.println("<<List of Available medias:>>");
        for(Media m:medias){
            System.out.println(m);
        }

    }

    public Book searchBook(String title) {
        for (Media m : medias) {
            if (m instanceof Book && m.getTitle().equals(title)) {
                return (Book) m;}
        }
        return null;
    }




























































}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Store store = new Store();


        System.out.println("                                   register user                                    ");
        System.out.println("--------------------------------------------------------------------------------------");
        User user = new User("", "");
        System.out.print("username: ");
        user.setUsername(sc.nextLine());
        System.out.print("email: ");
        user.setEmail(sc.nextLine());
        store.addUser(user);
        store.displayUsers(user);


        System.out.println("                                     add Book noval                                     ");
        System.out.println("---------------------------------------------------------------------------------------");
        Noval book = new Noval("", "", "", 0.0, 0, "");
        System.out.print("title: ");
        book.setTitle(sc.nextLine());
        System.out.print("author: ");
        book.setAuteur(sc.nextLine());
        System.out.print("price: ");
        book.setPrice(Double.parseDouble(sc.nextLine()));
        System.out.print("stock: ");
        book.setStock(Integer.parseInt(sc.nextLine()));
        System.out.print("genre: ");
        book.setGenre(sc.nextLine());
        store.addMedia(book);
        System.out.println(book.toString());



        System.out.println("                                         add movie                                        ");
        System.out.println("-------------------------------------------------------------------------------------------");
        Movie movie = new Movie("", "", "", 0.0, 0);
        System.out.print("title: ");
        movie.setTitle(sc.nextLine());
        System.out.print("director: ");
        movie.setAuteur(sc.nextLine());
        System.out.print("price: ");
        movie.setPrice(Double.parseDouble(sc.nextLine()));
        System.out.print("duration in minutes please : ");
        movie.setDuration(Integer.parseInt(sc.nextLine()));
        store.addMedia(movie);
        System.out.println(movie.toString());


        // ( for recommendations)
        System.out.println("                    add another movie same director                                ");
        System.out.println("-------------------------------------------------------------------------------------------");
        Movie movie2 = new Movie("", "", "", 0.0, 0);
        System.out.print("title: ");
        movie2.setTitle(sc.nextLine());
        movie2.setAuteur(movie.getAuteur());
        System.out.print("price: ");
        movie2.setPrice(Double.parseDouble(sc.nextLine()));
        System.out.print("duration in minutes please : ");
        movie2.setDuration(Integer.parseInt(sc.nextLine()));
        store.addMedia(movie2);
        System.out.println(movie2.toString());

        System.out.println("                              add Song                                                      ");
        System.out.println("-------------------------------------------------------------------------------------------");
        Music song = new Music("", "", "", 0.0," ");
        System.out.print("title: ");
        song.setTitle(sc.nextLine());
        System.out.print("artist: ");
        song.setArtist(sc.nextLine());
        System.out.print("price: ");
        song.setPrice(Double.parseDouble(sc.nextLine()));
        store.addMedia(song);
        System.out.println();
        store.displayMedias();
        System.out.println(song.toString());


        System.out.println("                      add to cart and checkout                                             ");
        System.out.println("-------------------------------------------------------------------------------------------");
        user.addToCart(book);
        user.addToCart(movie);
        user.checkOut();


        System.out.println("                                 add reviow                                                   ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("rating (1-5): ");
        int rating = Integer.parseInt(sc.nextLine());
        System.out.print("comment: ");
        String comment = sc.nextLine();
        book.addReview(new Reviow(user.getUsername(), rating, comment));

        System.out.println("average rating: " + book.getAverageRating());
        System.out.println("is bestseller? " + book.isBestseller());



        System.out.println("                                    restock Book                                          ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("restock quantity: ");
        int restockqty = Integer.parseInt(sc.nextLine());
        book.restock(restockqty);


        System.out.println("                                    search Book                                             ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("Enter title to search: ");
        String searchTitle = sc.nextLine();
        Book found = store.searchBook(searchTitle);
       if(found != null ) {
           System.out.println("found");
       }else{
           System.out.println("not found"); }


        System.out.println("                                   watch movie                                                  ");
        System.out.println("-------------------------------------------------------------------------------------------");
        movie.watch(user);
        List<Movie> movieCatalog = new ArrayList<>();
        movieCatalog.add(movie);
        movieCatalog.add(movie2);
        List<Movie> movieRecs = movie.recommendSimilarmovies(movieCatalog);
        System.out.println("                                    recommend movies                                          ");
        System.out.println("-------------------------------------------------------------------------------------------");
        for (Movie m : movieRecs) System.out.println("  " + m.getTitle());


        System.out.println("                                      listen to song                                       ");
        System.out.println("-------------------------------------------------------------------------------------------");
        song.listen(user);


        System.out.println("                                     store DISPLAY                                         ");
        System.out.println("-------------------------------------------------------------------------------------------");
        store.displayMedias();




















































































    }









}
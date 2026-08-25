import java.util.ArrayList;
import java.util.List;

public class Book extends Media  {
    private int stock;
    private List<Reviow> reviows;

    public Book(){

    }

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviows=new ArrayList<>();
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    public List<Reviow> getReviows() {
        return reviows;
    }

    public void setReviows(List<Reviow> reviows) {
        this.reviows = reviows;
    }

    public void addReview(Reviow reviow){
        this.reviows.add(reviow);
    }
    public double getAverageRating(){
       if(reviows.isEmpty()){
           return 0.0;
       }
       double sum=0.0;
       for(Reviow r:reviows){
           sum+=r.getRating();
       }
       return sum/reviows.size();
    }

    public void purchase (User user){
            if (stock > 0) {
                user.getPurchaseMediaList().add(this);
                stock--;
                System.out.println(user.getUsername() + " purchased:  " + getTitle());
            } else {
                System.out.println("Sorry " + getTitle() +  " is out of stock.");
            }
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

     public void restock(int quantity) {
        this.stock += quantity;
        System.out.println(quantity + "copies of: " + getTitle() + " add new stock: " + stock);
    }

    @Override
    public String getMediaType(){
        if (isBestseller()) {
            return "Bestselling Book";
        } else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return   " " +getMediaType() + " " + getTitle() + " " + getAuteur()+ " price: " + getPrice() + " stock: " + stock + "avg Rating: " + getAverageRating();
    }

































}

public class Noval extends Book {
    private String genre;

    public Noval(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }
    public Noval(String genre) {
        this.genre = genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    @Override
    public String getMediaType(){
        if(getAverageRating()>=4.5){
            return "Bestselling Novel";
        }else{
            return "Novel";
        }
    }

    @Override
    public String toString() {
        return " " + getMediaType() + " " + getTitle() + " " + genre + "  "
                + getAuteur() + " price: " + getPrice() + " stock: " + getStock()
                + " avg Rating:  " +  getAverageRating();
    }






}


































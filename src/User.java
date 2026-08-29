import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Media> purchaseMediaList;
    private List<Media> shoppingCart;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList= new ArrayList<>();
        this.shoppingCart = new ArrayList<>();

    }


    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public List<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(List<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }
    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }



    public void addToCart(Media media) {
        shoppingCart.add(media);
        System.out.println("add to cart " + media.getTitle() + " the name of custmer is " + username + " his/her email is" + email);
    }

    public void removeFromCart(Media media) {
        if (shoppingCart.remove(media)) {
            System.out.println("the item " + media.getTitle() + " has removed from cart of " + username + " email : " + email);
        } else {
            System.out.println(media.getTitle() + " dose not found in cart ");
        }
    } 

    public void checkOut() {
        if (shoppingCart.isEmpty()) {
            System.out.println(username+" does not buy anything");
            return;
        }
        for (Media media :shoppingCart) {
            if (media instanceof Book) {
                ((Book) media).purchase(this);
            } else {
                purchaseMediaList.add(media);
            }

        }
        shoppingCart.clear();
    }
}




































































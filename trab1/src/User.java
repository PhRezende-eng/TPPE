// abstract public class User {
public class User {
    String name;
    String phone;
    String addressRegion;
    Card card;
    String userType;

    User(String name, String phone, Card card, String addressRegion, String userType) {
        this.name = name;
        this.phone = phone;
        this.card = card;
        this.addressRegion = addressRegion;
        this.userType = userType;
    };
}

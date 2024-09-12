import java.time.LocalDateTime;
import java.util.List;

public class Order {

    public List<String> color;
    public String address;
    public String firstName;
    public String lastName;
    public String deliveryDate;
    public String metroStation;
    public String phone;
    public int rentTime;
    public String comment;

    public Order(List<String> color) {
        this.color = color;
        this.address = "ул. Моторостроителей, 29";
        this.firstName = "Чебохин";
        this.lastName = "Дмитрий";
        this.deliveryDate = LocalDateTime.now().toString();
        this.metroStation = "3";
        this.phone = "+79998887654";
        this.rentTime = 3;
        this.comment = "Готов к заказам";
    }
}
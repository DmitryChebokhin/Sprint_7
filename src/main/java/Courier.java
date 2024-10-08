import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.Random;

public class Courier {

    private String login;
    private String password;
    private String firstName;



    public Courier(String login, String password, String firstName) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;

    }

    public static Courier getRandomCourier() {
        final String courierLogin = RandomStringUtils.randomAlphabetic(10);
        final String courierPassword = RandomStringUtils.randomAlphabetic(10);
        final String courierFirstName = RandomStringUtils.randomAlphabetic(10);

        return new Courier(courierLogin, courierPassword, courierFirstName);
    }

    public static int getRandomCourierId() {
        Random random = new Random();
        return Math.abs(random.nextInt());
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
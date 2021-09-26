package mediator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import mediator.entity.*;

@SpringBootApplication
public class YogurtFactory {

    public static void main(String[] args) {
        var manager = new Manager(1, "Stas", "Denisenko", "yogurt products");
        var client = new Client("First", "Try", "Mediator", "pattern@gmail.com");

        ClientOrder clientOrder = client.createOrder("sweet", 500, 1000);

        manager.processOrder(clientOrder);

    }
}

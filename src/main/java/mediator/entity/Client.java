package mediator.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
@RequiredArgsConstructor
public class Client {

    private final String name;
    private final String surName;
    private final String email;
    private final String phone;
    private List<ClientOrder> clientOrders;

    public ClientOrder createOrder(String sweetness, int volume, int quantity) {
        log.info("Create ClientOrder{} {}", sweetness, volume);
        var clientOrder = new ClientOrder(1, 10, volume, quantity);
        clientOrders.add(clientOrder);
        return clientOrder;
    }

}

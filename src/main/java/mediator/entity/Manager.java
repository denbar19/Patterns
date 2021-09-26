package mediator.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mediator.manager.ManagerMediator;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Slf4j
@RequiredArgsConstructor

public class Manager {

    @Autowired
    private ManagerMediator managerMediator;

    private final long id;
    private final String name;
    private final String surname;
    private final String salesDirection;

    public void processOrder(ClientOrder clientOrder) {
        log.info("processOrder {}", clientOrder);
        if (!this.isOrderEnoughValuable(clientOrder)){
            log.info("processOrder, not valuable order");
            managerMediator.notificationDecline();
        }
        managerMediator.redirectOrderToEstimatePrice(clientOrder);
    }

    private boolean isOrderEnoughValuable(ClientOrder clientOrder) {
        log.info("estimateRawPrice");
        return (clientOrder.getVolume() * clientOrder.getQuantity()) > 500_000;
    }

}

package mediator.manager;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mediator.entity.ClientOrder;
import mediator.financialdepartment.FinancialMediator;
import mediator.noitificator.NotificatorMediator;
import mediator.techical_task.TechnicalTaskMediator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Slf4j
@RequiredArgsConstructor
@Component
public class ManagerMediator {

    @Autowired
    private final FinancialMediator financialMediator;

    @Autowired
    private final TechnicalTaskMediator technicalTaskMediator;

    @Autowired
    private final NotificatorMediator notificatorMediator;

    public void redirectOrderToEstimatePrice(ClientOrder clientOrder) {
        log.info("redirectOrder");
        financialMediator.estimateCost(clientOrder);
    }

    public void notificationDecline() {
        log.info("notificationDecline");
        notificatorMediator.sendDecline();
    }
}

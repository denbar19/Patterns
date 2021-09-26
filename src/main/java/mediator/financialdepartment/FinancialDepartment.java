package mediator.financialdepartment;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mediator.entity.ClientOrder;
import mediator.entity.ProductionOrder;
import mediator.techical_task.TechnicalTaskMediator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Slf4j
@RequiredArgsConstructor
@Component
public class FinancialDepartment {

    @Autowired
    private final FinancialMediator financialMediator;

    public void makeCalculations(ClientOrder clientOrder) {
        log.info("makeCalculations");
        if (!this.isCostEnough(clientOrder)) {
            log.info("makeCalculations, cost isn't enough");
            financialMediator.notificateManagerWithDecline(clientOrder);
        }
        financialMediator.sendTechnicalTask(clientOrder);
    }

    private boolean isCostEnough(ClientOrder clientOrder) {
        return (clientOrder.getQuantity() + clientOrder.getVolume()) > 500_000;
    }
}


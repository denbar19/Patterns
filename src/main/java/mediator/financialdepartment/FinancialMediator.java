package mediator.financialdepartment;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mediator.entity.ClientOrder;
import mediator.entity.TechnicalTask;
import mediator.manager.ManagerMediator;
import mediator.techical_task.TechnicalTaskMediator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Slf4j
@RequiredArgsConstructor
@Component
public class FinancialMediator {

    @Autowired
    private final ManagerMediator managerMediator;

    @Autowired
    private final FinancialDepartment financialDepartment;

    @Autowired
    private final TechnicalTaskMediator technicalTaskMediator;

    public void sendTechnicalTask(ClientOrder clientOrder){
        log.info("sendTechnicalTask");
        technicalTaskMediator.createTechnicalTask(clientOrder);
    }

    public void estimateCost(ClientOrder clientOrder) {
        log.info("estimateCost");
        financialDepartment.makeCalculations(clientOrder);
    }

    public void notificateManagerWithDecline(ClientOrder clientOrder) {
        managerMediator.notificationDecline();
    }
}

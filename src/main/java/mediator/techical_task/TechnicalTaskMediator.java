package mediator.techical_task;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mediator.entity.ClientOrder;
import mediator.entity.TechnicalTask;
import mediator.production.ProductionMediator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class TechnicalTaskMediator {

    @Autowired
    private final TechnicalTaskProcessing technicalTaskProcessing;

    @Autowired
    private final ProductionMediator productionMediator;

    public void createTechnicalTask(ClientOrder clientOrder) {
        log.info("createTechnicalTask");
        TechnicalTask technicalTask = technicalTaskProcessing.createTechnicalTask(clientOrder);
        this.checkProductCreation(technicalTask);
    }

    private void checkProductCreation(TechnicalTask technicalTask) {
        productionMediator.checkProductCreation(technicalTask);
    }
}

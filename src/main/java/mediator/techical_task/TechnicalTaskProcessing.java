package mediator.techical_task;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mediator.entity.ClientOrder;
import mediator.entity.TechnicalTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Component
public class TechnicalTaskProcessing {

    @Autowired
    private final TechnicalTaskMediator technicalTaskMediator;


    public TechnicalTask createTechnicalTask(ClientOrder clientOrder) {
        log.info("checkProductCreation");
        Map<String,String> receipt = new HashMap<>();
        Map<String,String> technicalProcess = new HashMap<>();
        return new TechnicalTask(1 , "yo_sw001ch", receipt,
                technicalProcess, clientOrder.getQuantity(), clientOrder.getVolume(), clientOrder.getSweetness());
    }
}

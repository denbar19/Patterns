package mediator.production;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mediator.entity.TechnicalTask;
import mediator.issuehandler.IssueMediator;
import mediator.storage.StorageMediator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@RequiredArgsConstructor
@Component
public class ProductionMediator {

    @Autowired
    private final IssueMediator issueMediator;

    @Autowired
    private final StorageMediator storageMediator;

    @Autowired
    private final ProductionMediator productionMediator;

    public void checkProductCreation(TechnicalTask technicalTask) {
        if (Objects.isNull(checkSomeParameters(technicalTask))) {
            issueMediator.processIssue();
            return;
        }
        placeInProduction(technicalTask);
    }

    private TechnicalTask checkSomeParameters(TechnicalTask technicalTask) {
        return technicalTask;
    }

    public void placeInProduction(TechnicalTask technicalTask) {
        log.info("placeInProduction");

    }
}

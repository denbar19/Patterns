package mediator.storage;

import lombok.RequiredArgsConstructor;
import mediator.delivery.DeliveryMediator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class StorageMediator {

    @Autowired
    private final DeliveryMediator deliveryMediator;

}

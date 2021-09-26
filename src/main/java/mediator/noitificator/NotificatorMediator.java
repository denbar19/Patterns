package mediator.noitificator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class NotificatorMediator {

    public void sendDecline() {
        log.info("Order is rejected due to low total price. Email sent.");
    }
}

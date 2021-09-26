package mediator.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Data
@Slf4j
@RequiredArgsConstructor
public class TechnicalTask {

    private final long id;
    private final String productionName;

    private final Map<String, String> receipt;
    private final Map<String, String> technicalProcess;

    private final int quantity;
    private final int volume;
    private final int sweetness;


}

package mediator.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RequiredArgsConstructor
public class ClientOrder {

    private final long id;
    private final int sweetness;
    private final int volume;
    private final int quantity;

}

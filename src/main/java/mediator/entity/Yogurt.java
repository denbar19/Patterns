package mediator.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Data
@Slf4j
@RequiredArgsConstructor
public class Yogurt {

    private final String name;
    
    private Map<String, String> receipt;
}

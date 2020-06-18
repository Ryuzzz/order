package order.external;

import order.Made;
import org.springframework.stereotype.Component;

@Component
public class MakeServiceFallback implements MakeService {
    @Override
    public Made checkStatusService(Long orderId) {
        System.out.println("Circuit breaker has been opened. Fallback returned instead.");
        return null;
    }
}

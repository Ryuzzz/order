package order.external;

import order.Cancelled;
import order.Made;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="make", url="${feign.make.url}")
//@FeignClient(name="payment", , fallback = PaymentServiceFallback.class)
public interface MakeService {
    @RequestMapping(method= RequestMethod.GET, value="/makes/{orderId}")
    public Made checkStatusService(@PathVariable("orderId") final Long orderId);
}


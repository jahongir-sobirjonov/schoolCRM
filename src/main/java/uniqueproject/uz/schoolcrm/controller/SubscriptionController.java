package uniqueproject.uz.schoolcrm.controller;

import org.springframework.web.bind.annotation.*;
import uniqueproject.uz.schoolcrm.entity.Subscription;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @GetMapping
    public List<Subscription> getAllSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }

    @GetMapping("/{id}")
    public Subscription getSubscriptionById(@PathVariable UUID id) {
        return subscriptionService.getSubscriptionById(id);
    }

    @PostMapping
    public Subscription createSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.createSubscription(subscription);
    }
}


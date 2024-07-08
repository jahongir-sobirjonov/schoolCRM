package uniqueproject.uz.schoolcrm.controller;

import org.springframework.web.bind.annotation.*;
import uniqueproject.uz.schoolcrm.entity.Notification;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {


    private final NotificationService notificationService;

    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @GetMapping("/{id}")
    public Notification getNotificationById(@PathVariable Long id) {
        return notificationService.getNotificationById(id);
    }

    @PostMapping
    public Notification createNotification(@RequestBody Notification notification) {
        return notificationService.createNotification(notification);
    }
}


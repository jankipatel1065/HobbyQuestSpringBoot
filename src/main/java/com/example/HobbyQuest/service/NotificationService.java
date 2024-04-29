package com.example.HobbyQuest.service;

import com.example.HobbyQuest.model.entities.AppClient;
import com.example.HobbyQuest.model.entities.Entry;
import org.springframework.scheduling.annotation.Async;

public interface NotificationService {
    @Async
    void sendNotification(AppClient appClient, Entry entry);
}

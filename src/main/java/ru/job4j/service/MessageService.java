package ru.job4j.service;

import org.springframework.stereotype.Service;
import ru.job4j.model.Message;

import java.util.List;

@Service
public interface MessageService {
    boolean send(String serviceId, Message message);
    List<Message> getReceivedMessages();
    void saveReceivedMessage(Message message);
}
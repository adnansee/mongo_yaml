package com.chatmessage.service;


import com.chatmessage.model.Message;
import org.springframework.stereotype.Service;
import java.util.List;


/**
 * MESSAGE SERVICE INTERFACE CLASS
 */

@Service
public interface MessageService {

    Message sendSingleMessage(Message message);

    List<Message> sendMultipleMessage(List<Message> messages);

    List<Message> getAllReceivedMessages(String user_id);

    List<Message> getAllSentMessages(String user_id);

    Double estimateDayMessages();

    Double estimateWeekMessages();

    void deleteAllMessages();

    List<Message> showAllMessages();

    String readMyMessage(String message_id);


}

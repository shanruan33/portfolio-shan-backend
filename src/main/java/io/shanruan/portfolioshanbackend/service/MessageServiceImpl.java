package io.shanruan.portfolioshanbackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.shanruan.portfolioshanbackend.dao.MessageRepository;
import io.shanruan.portfolioshanbackend.entity.Message;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageRepository theMessageReposirory;

    @Override
    public List<Message> findAll() {
        List<Message> Messages = theMessageReposirory.findAll();        
        return Messages;
    }

    @Override
    public Message findById(int theId) {
        Optional<Message> result = theMessageReposirory.findById(theId);
        Message theMessage = null;
        if(result.isPresent()) {
            theMessage = result.get();
        }        
        return theMessage;
    }

    @Override
    public void save(Message theMessage) {
        theMessageReposirory.save(theMessage);
    }

    @Override
    public void deleteById(Message theMessage) {
        theMessageReposirory.delete(theMessage);
    }
}

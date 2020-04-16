package io.shanruan.portfolioshanbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.shanruan.portfolioshanbackend.entity.Message;
import io.shanruan.portfolioshanbackend.service.MessageService;

@RestController
@RequestMapping("/api")
public class MessageController {
    @Autowired
    MessageService theMessageService;

    @GetMapping(value="/messages")
    public List<Message> findAll() {
        List<Message> Messages = theMessageService.findAll();
        return Messages;
    }

    @GetMapping(value="/messages/{theId}")
    public Message findById(@PathVariable int theId) {
        Message theMessage = theMessageService.findById(theId);
        return theMessage;
    }

    @PostMapping(value="/messages")
    public Message create(@RequestBody Message theMessage) {
        theMessage.setId(0);
        theMessageService.save(theMessage);
        return theMessage;
    }

    @PutMapping(value="/messages/{theId}")
    public Message update(@PathVariable int theId, @RequestBody Message theMessage) {
        theMessage.setId(theId);
        theMessageService.save(theMessage);
        return theMessage;
    }

    @DeleteMapping(value="/messages/{theId}")
    public String deleteById(@PathVariable int theId) {
        Message theMessage = theMessageService.findById(theId);
        theMessageService.deleteById(theMessage);
        return "Deleted Message id - " + theId;
    }
}
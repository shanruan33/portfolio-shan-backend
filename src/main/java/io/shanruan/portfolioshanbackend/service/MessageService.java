package io.shanruan.portfolioshanbackend.service;

import java.util.List;

import io.shanruan.portfolioshanbackend.entity.Message;

public interface MessageService {

	List<Message> findAll();

	Message findById(int theId);

	void save(Message theMessage);

	void deleteById(Message theMessage);

}

package io.shanruan.portfolioshanbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import io.shanruan.portfolioshanbackend.entity.Message;

@CrossOrigin
@RepositoryRestResource
public interface MessageRepository extends JpaRepository<Message, Integer>{

}
package com.adl.rabbit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adl.rabbit.model.MessageModel;

public interface MessageRepository extends JpaRepository<MessageModel, Integer> {

}

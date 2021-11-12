package com.adl.rabbit.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import com.adl.rabbit.model.MessageModel;
import com.google.gson.Gson;

public class RabbitMQListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		String data = new String (message.getBody());
		Gson gson = new Gson();
		MessageModel message2 = gson.fromJson(data, MessageModel.class);
		System.out.println("test");
	}

	
}

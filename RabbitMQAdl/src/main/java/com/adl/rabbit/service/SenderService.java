package com.adl.rabbit.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.adl.rabbit.model.MessageModel;

@Service
public class SenderService {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value ("${rabbit.quenue}")
	String quenueName;
	@Value ("${rabbit.exchange}")
	String exchange;
	@Value ("${rabbit.routingkey}")
	String routingkey;
	
	public void publish (MessageModel msg) {
		
		rabbitTemplate.convertAndSend(exchange, routingkey, msg);
		System.out.println("msg = " + msg) ;
//		MessageModel msg2 = (MessageModel) rabbitTemplate.receiveAndConvert(quenueName);
//		
//		System.out.println("msg = "+msg2.getIdPengirim());
//		
	} //untuk mengisi antrean tersebut, yang akan dikirim ke Controller 	
	
	

}

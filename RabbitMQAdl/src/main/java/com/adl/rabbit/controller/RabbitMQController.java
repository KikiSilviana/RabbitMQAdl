package com.adl.rabbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adl.rabbit.model.MessageModel;
import com.adl.rabbit.service.SenderService;

@RestController
public class RabbitMQController {
	
	@Autowired
	SenderService sendService;
	
	@GetMapping("/")
	public String rabbitSend(@RequestParam("idPengirim") int idPengirim, @RequestParam ("Message") String message) {
		MessageModel msg = new MessageModel();
		msg.setIdPengirim(idPengirim);
		msg.setMessage(message);
		sendService.publish(msg);
		return"Message berhasil dikirim";
	}
	

}

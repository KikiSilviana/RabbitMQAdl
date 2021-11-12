package com.adl.rabbit.model;

import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="message")
public class MessageModel {
	
	
	
	private int idPengirim;
	private String message;

	
}

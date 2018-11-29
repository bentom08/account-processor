package com.qa.producer.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.account.persistence.domain.sentAccount;
import com.qa.producer.repository.MongoAccountRepository;

@Component
public class AccountReceiver {
	
	@Autowired
	MongoAccountRepository repo;

	@JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
	public void receiveMessage(sentAccount account) {
		repo.insert(account);
	}
}

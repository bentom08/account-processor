package com.qa.producer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.account.persistence.domain.sentAccount;

@Repository
public interface MongoAccountRepository extends MongoRepository<sentAccount, String> {
}

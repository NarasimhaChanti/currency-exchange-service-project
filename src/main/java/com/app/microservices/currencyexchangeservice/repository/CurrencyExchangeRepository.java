package com.app.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.microservices.currencyexchangeservice.bean.ExchangeValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long> {

	public ExchangeValue  findByFromAndTo(String from,String to);
	
}

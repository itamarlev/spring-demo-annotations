package com.itamar.annotationdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "have a great day";
	}

}

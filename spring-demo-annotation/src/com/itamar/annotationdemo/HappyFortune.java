package com.itamar.annotationdemo;

public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "have a great day";
	}

}

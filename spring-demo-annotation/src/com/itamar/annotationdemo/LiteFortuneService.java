package com.itamar.annotationdemo;

public class LiteFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Lite up your life";
	}

}

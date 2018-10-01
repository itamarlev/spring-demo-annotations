package com.itamar.annotationdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "not that good a fortune";
	}

}

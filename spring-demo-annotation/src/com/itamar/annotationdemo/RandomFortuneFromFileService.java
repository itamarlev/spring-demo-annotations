package com.itamar.annotationdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneFromFileService implements FortuneService {

	@Value("${foo.fortune.array}")
	private String[] fortuneServiceArray;
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(fortuneServiceArray.length);
		return fortuneServiceArray[index];
	}

}

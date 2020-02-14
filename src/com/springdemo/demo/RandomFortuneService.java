package com.springdemo.demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	final String[] arr = { "Fortune one!", "Fortune two!", "Fortune three!" };

	@Override
	public String getFortune() {

		Random rand = new Random();

		return arr[rand.nextInt(3)];

	}

}

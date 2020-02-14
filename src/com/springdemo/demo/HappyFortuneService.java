package com.springdemo.demo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy new Fortune!";
	}

}

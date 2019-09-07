package com.example.demo3.service;

import com.example.demo3.Animal;

public class Bird implements Animal {
    String name;
    String type;
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
      this.name=name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public void makeASound() {
		// TODO Auto-generated method stub

	}

}

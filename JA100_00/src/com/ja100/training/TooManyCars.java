package com.ja100.training;

public class TooManyCars extends Exception {
public TooManyCars(int val) {
	super("Too Many Objects cannot be "+val);
}
	
}

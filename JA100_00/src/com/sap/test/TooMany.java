package com.sap.test;

public class TooMany extends Exception {

	public TooMany(int cnt) {
		super("Too many objects "+cnt);
	}
}

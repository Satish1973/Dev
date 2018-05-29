package com.sap.test;

public class CallObjs {
private static int objCnt;
	public CallObjs() throws TooMany {
		objCnt++;
		if (objCnt > 3) {
		
				throw new TooMany(objCnt);
		
		}
			else {
				System.out.println("Object Created");
			}
		}
	
	public CallObjs(int a) {
		
	}
	public CallObjs(String s) {
		
	}
	public CallObjs(String s, int a) {
	}
}


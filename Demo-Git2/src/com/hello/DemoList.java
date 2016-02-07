package com.hello;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

	static List<String> keyfileList = new ArrayList<String>();

	public static void main(String[] args) {
		for (int i = 0; i < keyfileList.size(); i++) {
			// out outTable(i)
			// sum
			// in inTable(i)
			i++;
			// outTable(i)
			// count
			// inTable(i)
		}

		
	}

	public String outTable(int index) {
		List<String> outkyeList = getoutTableList();
		String key = outkyeList.get(index);
		return key;
	}

	private List<String> getoutTableList() {
		
		return null;
	}

	public String inTable(int index) {
		List<String> inkyeList = getInTableList();
		String key = inkyeList.get(index);
		return key;
	}

	private List<String> getInTableList() {
		
		return null;
	}
}

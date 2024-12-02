package com.solution.main;

import com.solution.even.EvenNumberThread;
import com.solution.odd.OddNumberThread;

public class Test {

	public static void main(String[] args) {

		EvenNumberThread ent = new EvenNumberThread();
		ent.run();
		
		OddNumberThread ont = new OddNumberThread();
		ont.run();
	}

}

package com.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {
       
		StringJoiner joinMethod1 = new StringJoiner("+");
		StringJoiner joinMethod2 = new StringJoiner("+", "'", "'");
		StringJoiner joinMethod3 = new StringJoiner("+");
		joinMethod3.setEmptyValue("Prodapt");

		joinMethod1.add("Pro");
		joinMethod1.add("adpt");

		joinMethod2.add("Spring");
		joinMethod2.add("Boot");
		System.out.println(joinMethod1.merge(joinMethod2));
		System.out.println(joinMethod1.length());
		System.out.println(joinMethod2);

		System.out.println(joinMethod3);
		joinMethod3.add("Angular");
		joinMethod3.add("Js");

		System.out.println(joinMethod3);

	}

}

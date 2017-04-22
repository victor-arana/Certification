package com.arana.certification.loops.ifelse;

public class App {

	public static void main(String[] args) {
		String stuff = "TV";
		String res = null;
		
		if(stuff.equals("TV")){
			res = "Walter";
		} else if(stuff.equals("Movie")){
			res = "White";
		} else {
			res = "No Result";
		}
		
		System.out.println(res);
		
		String stuff2 = "Movies";
		String res2 = null;
		res2 = stuff2.equals("TV")?"Walter":stuff2.equals("Movie")?"White":"No Result";
		System.out.println(res2);

	}

}

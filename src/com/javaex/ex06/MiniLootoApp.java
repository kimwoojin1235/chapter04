package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class MiniLootoApp {

	public static void main(String[] args) {
		
		//로또 번호생성기-->중복체크 포함
		Set<Integer> iSet=new HashSet<Integer>();
		
		while (iSet.size()<6) {
			int num=(int)((Math.random()*45)+1);
			iSet.add(num);
		}

		for(Integer i   :iSet) {//iset은 전체이고 Integer는 하나씩 꺼낸다.
			System.out.print(i.toString()+" ");
		}
	}

}

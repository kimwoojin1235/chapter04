package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
	//set==>hashset
		
	Set<Integer> iSet=new HashSet<Integer>();//기본자료형을 못쓴다.
	
	//Integer i01=new Integer(3);
	//Integer i02=new Integer(5);
	
	//Integer i03=3;숫자가 들어가는 게 아닌 i02번 과 같이 메모리에 올라가는 주소 값으로 자동 변경됨 이게 박싱\
	
	//추가add()
	iSet.add(3);
	iSet.add(5);
	iSet.add(8);
	
	//toString()
	System.out.println(iSet.toString());
	
	//size()
	System.out.println("size:"+iSet.size());
	
	//출력: 
	//기돈 for문의 사용x
	//다른 for==>향상된 포문
	for(Integer i   :iSet) {//iset은 전체이고 Integer는 하나씩 꺼낸다.
		System.out.println(i.toString());
	}
	System.out.println("=======");
	for(int i:iSet) {//언박싱 된다.
		System.out.println(i);
	}
	//삭제
	System.out.println("=======");
	iSet.remove(3);//3번방 이런 개념이 아닌 그냥 숫자3을 지우라는 의미
	for(Integer i   :iSet) {//iset은 전체이고 Integer는 하나씩 꺼낸다.
		System.out.println(i.toString());
	}
	System.out.println("=======");
	//중복값 추가
	iSet.add(5);
	for(Integer i   :iSet) {//iset은 전체이고 Integer는 하나씩 꺼낸다.
		System.out.println(i.toString());
	}
	System.out.println("=======");
	//중복값 추가
	iSet.add(8);
	for(Integer i   :iSet) {//iset은 전체이고 Integer는 하나씩 꺼낸다.
		System.out.println(i.toString());
	}
}

}

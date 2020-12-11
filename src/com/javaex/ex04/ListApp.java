package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {
		//ArrayList사용+Ractaingle
		//ArrayList<Ractangle> rList=new ArrayList<Ractangle>();
		List<Ractangle> rList=new ArrayList<Ractangle>();
		//인터페이스가 있다면은 섞어쓰기를 많이한다. 그러면 바꿔치기할떄편함
		//섞어쓰기를 한다면 인터페이스 안에 있는 것들만 쓰겠다는 의미
		//LinkedList<Ractangle> rList=new LinkedList<Ractangle>();
		
		Ractangle r01 =new Ractangle(3,3);
		Ractangle r02 =new Ractangle(4,4);
		//add()
		rList.add(r01);
		rList.add(r02);
		//공부내용 메소드가 무었이 있나?
		//get()
		Ractangle r=rList.get(0);
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		r.draw();
		System.out.println(r.toString());
		//size()
		System.out.println(rList.size());
		Ractangle r03 =new Ractangle(100,100);
		rList.add(0, r03);
		//add에는 2가지종류가 있음 1번은 값만 넣는 것이고 하난 배열의 순서와 데이터 값을 넣는 
		//add가 있다.
		//전체출력get() size()
		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}
		System.out.println("===================================");
		System.out.println(rList.toString()); 
		
		System.out.println("===================================");
		//삭제remove(); 방의 번호를 넣어도 되고 이름을 넣어도됨
		rList.remove(0);
		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}
		System.out.println("===================================");
		rList.remove(r02);
		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}
		///////////////////////////////////////////원
		System.out.println("===원 관리================================");
		//ArrayList<Circle> cList=new ArrayList<Circle>();
		LinkedList<Circle> cList=new LinkedList<Circle>();
		//어레이를 링크드로 바꾸는 방법은 이름을 같게하고 자료형만 바꾸면된다.
		
		Circle c01=new Circle(5);
		Circle c02=new Circle(500);
		
		cList.add(c01);
		cList.add(c02);
		//cList.add(r01); 사각형 사용x
		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

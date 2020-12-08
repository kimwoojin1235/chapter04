package com.javaex.ex02;

public class ListApp02 {

	public static void main(String[] args) {
		//각각의 리스트 사용x
		//ObjList클래스를 3번 사용
		Ractangle r01=new Ractangle(3,3);
		Ractangle r02=new Ractangle(5,5);
		
		ObjList rList =new ObjList();
		
		rList.add(r01);
		rList.add(r02);
		for (int i = 0; i < rList.size(); i++) {
			((Ractangle)(rList.get(i))).draw();
		}
		//원 관리
		Circle c01=new Circle(4);
		Circle c02=new Circle(5);
		
		ObjList cList =new ObjList();
		
		cList.add(c01);
		cList.add(c02);//단점 다른 도형도 추가가된다.
		
		for (int i = 0; i < cList.size(); i++) {
			((Circle)(cList.get(i))).draw();
		}
	}

}

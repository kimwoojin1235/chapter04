package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		//사각형 관리
		RactList rList =new RactList();
		Ractangle r01=new Ractangle(3,9);
		Ractangle r02=new Ractangle(10,10);
		
		rList.add(r01);//0번째 방에 주소값을 넣음
		rList.add(r02);//1번째 방에 주소값을 넣음
		
		Ractangle r100= rList.get(0);//rArray의 주소 값이  r100에 들어감
		r100.draw();
		
		System.out.println(rList.size());
		//원 관리
		CirList cList=new CirList();
		Circle c01=new Circle(4);
		Circle c02=new Circle(8);
		
		cList.add(c01);
		cList.add(c02);
		
		Circle c100=cList.get(0);
		c100.draw();
		
		//삼각형 관리
		
		TrianglrList tList=new TrianglrList();
		Trianglr t01=new Trianglr(2,4);
		Trianglr t02=new Trianglr(4,8);
		
		tList.add(t01);
		tList.add(t02);
		Trianglr t100=tList.get(0);
		t100.draw();
	}

}

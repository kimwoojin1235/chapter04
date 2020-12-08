package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		//사각형 관리
		RactList rList =new RactList();
		Ractangle r01=new Ractangle(3,9);
		Ractangle r02=new Ractangle(10,10);
		
		rList.add(r01);//0번째 방에 주소값을 넣음
		rList.add(r02);//1번째 방에 주소값을 넣음
		
		Ractangle r100= rList.get(0);//rArray의0번째 방에 주소 값이  r100에 들어감
		//r100.draw();
		
		for (int i = 0; i < rList.size(); i++) {
			/*
			Ractangle r=rList.get(i);
			r.draw();
			*/
			rList.get(i).draw();
			//get(i)에서 배열에있는 주소를 불러온다음 그걸 출력을 한다.
			//위와 아래가 같음
		}
		
		System.out.println(rList.size());//배열에 들어가 있는 수를 알려줌
		
		//원 관리
		CirList cList=new CirList();
		Circle c01=new Circle(4);
		
		cList.add(c01);
		
		Circle c100=cList.get(0);
		//c100.draw();
		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}
		
		
		System.out.println(cList.size());
		//삼각형 관리
		
		TrianglrList tList=new TrianglrList();
		Trianglr t01=new Trianglr(2,4);
		Trianglr t02=new Trianglr(4,8);
		
		tList.add(t01);
		tList.add(t02);
		Trianglr t100=tList.get(0);
		t100.draw();
		System.out.println(tList.size());
	}

}

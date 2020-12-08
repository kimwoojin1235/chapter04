package com.javaex.ex03;

public class ListApp03 {
//최종형
	public static void main(String[] args) {
		//범용 objlist사용하는데
		//메모리에 몰릴때 사각형 용으로 만들어 버린다.
		MyList<Ractangle> rList =new MyList<Ractangle>();
		//꺽쇠 안에 다른 클래스를 넣음으로서 그 클래스만 들어갈수있게 되었다.
		Ractangle r01=new Ractangle(5,5);
		Ractangle r02=new Ractangle(10,10);
		rList.add(r01);
		rList.add(r02);
		
		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}
		
		//범용 objlist사용하는데
		//메모리에 몰릴때 원 용으로 만들어 버린다.
		//ObjList tList =new ObjList<Circle>();
		MyList<Circle> cList=new MyList<Circle>();
		
		Circle c01=new Circle(4);
		Circle c02=new Circle(7);
		
		cList.add(c01);
		cList.add(c02);
		//cList.add(r02);사각형은 추가될수 없다
		
		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}
		//범용 objlist사용하는데
		//메모리에 몰릴때 삼각형 용으로 만들어 버린다.
		//ObjList tList =new ObjList<Trianglr>();
		
		
	}

}

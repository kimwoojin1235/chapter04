package com.javaex.ex02;

public class ObjList {
	private Object[] oArray;
	private int crtPos;
	public ObjList() {
		oArray=new  Object[3];//배열을 3개만듬
		crtPos=0;//현재 위치를 배열의 0번째 방으로 지정
	}
	public void add(Object o) {//r에listApp애 있는 r0 주소가 들어가 있음
		//주소값을 알아서 넣어준다.
		oArray[crtPos] =o;//0번째 방에 주소값을 넣어라
		crtPos++;//다음방으로 간다 같은거
	}
	//가져오기
	public Object get(int index) {
		return oArray[index];
	}
	//사각형 갯수
	public int size() {//몇개??
		return crtPos;//현재 겟수로 리턴 지금 2개의 주소 값이 담겨있음
	}
	
}

package com.javaex.ex01;

public class RactList {
	//필드
	private Ractangle[] rArray;
	private int crtPos;//현재위치 관리
	//생성자
	public RactList() {
		rArray=new Ractangle[3];//배열을 3개만듬
		crtPos=0;//현재 위치를 배열의 0번째 방으로 지정
	}
	public void add(Ractangle r) {//r에listApp애 있는 r0 주소가 들어가 있음
		//주소값을 알아서 넣어준다.
		rArray[crtPos] =r;//0번째 방에 주소값을 넣어라
		crtPos++;//다음방으로 간다 같은거
	}
	//가져오기
	public Ractangle get(int index) {
		return rArray[index];
	}
	//사각형 갯수
	public int size() {//몇개??
		return crtPos;//현재 겟수로 리턴 지금 2개의 주소 값이 담겨있음
	}
}

package com.javaex.ex01;

public class CirList {
	private Circle[] cArray;
	private int crtPos;//현재위치 관리
	//생성자
	public CirList(){
		cArray=new Circle[3];//배열을 3개만듬
		crtPos=0;//현재 위치를 배열의 0번째 방으로 지정
	}
	public void add(Circle c) {
		cArray[crtPos] =c;
		crtPos++;
	}
	//가져오기
	public Circle get(int index) {
		return cArray[index];
	}
	//원의 갯수
	public int size() {//몇개??
		return crtPos;//현재 겟수로 리턴 지금 2개의 주소 값이 담겨있음
	}
}

package com.javaex.ex01;

public class TrianglrList {
	private Trianglr[] tArray;
	private int crtPos;//현재위치 관리
	//생성자
	public TrianglrList(){
		tArray=new Trianglr[3];//배열을 3개만듬
		crtPos=0;//현재 위치를 배열의 0번째 방으로 지정
	}
	public void add(Trianglr r) {
		tArray[crtPos] =r;
		crtPos++;
	}
	//가져오기
	public Trianglr get(int index) {
		return tArray[index];
	}
	//삼각형 갯수
	public int size() {//몇개??
		return crtPos;//현재 겟수로 리턴 지금 2개의 주소 값이 담겨있음
	}
}

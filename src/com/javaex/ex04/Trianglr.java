package com.javaex.ex04;

public class Trianglr {
	private int width;
	private int height;
	public Trianglr() {
	}
	public Trianglr(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println("삼각형(밑변="+width+" 높이="+height+")을 그렸습니다.");
	}
	@Override
	public String toString() {
		return "Trianglr [width=" + width + ", height=" + height + "]";
	}
	
}

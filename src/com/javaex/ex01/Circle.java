package com.javaex.ex01;

public class Circle {
	public int redisu;
	public Circle() {
	}
	public Circle(int redisu) {
		this.redisu = redisu;
	}
	public int getRedisu() {
		return redisu;
	}
	public void setRedisu(int redisu) {
		this.redisu = redisu;
	}
	public void draw() {
		System.out.println("원(반지름"+redisu+")을 그렸습니다.");
	}
	@Override
	public String toString() {
		return "Circle [redisu=" + redisu + "]";
	}
}

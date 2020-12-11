package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		//hashMap()사용하기
		Map<String, Point> pMap=new HashMap<String,Point>();
		Point p01=new Point(1,1);
		Point p02=new Point(2,2);
		Point p03=new Point(3,3);
		Point p04=new Point(4,4);
		
		pMap.put("박명수", p01);
		pMap.put("유재석", p02);
		pMap.put("정준하", p03);
		pMap.put("이효리", p04);
		
		System.out.println(pMap.toString());
		System.out.println(pMap.get("유재석").getX());
		System.out.println(pMap.get("박명수").getY());
		
		Point p05=new Point(5,5);
		pMap.put("박명수", p05);//이름이 기존의 것과 같으면 그 값으 덮어버린다.
		System.out.println(pMap.toString());
		System.out.println("갯수:"+pMap.size());
		
		//map에서 key값은 set으로 관리되고 있다.
		Set<String> keys = pMap.keySet();//관리하는 주머니를 준것
		for(String key :keys) {
			System.out.println(pMap.get(key).getX());
		}
	}

}

package com.javaex.ex03;

public class MyList<T> {//꺽쇠 안에 들어가 있는 T는 다르느 클래스를 도입하는 것 
	//범용 클래스 모든 리스트를 관리한다.
		private T[] oArray;
		private int crtPos;
		
		public MyList() {
			oArray=(T[])(new Object[3]);//T배열로 행변환
			crtPos=0;//현재 위치를 배열의 0번째 방으로 지정
		}
		public void add(T o) {//r에listApp애 있는 r0 주소가 들어가 있음
			//주소값을 알아서 넣어준다.
			oArray[crtPos] =o;//0번째 방에 주소값을 넣어라
			crtPos++;//다음방으로 간다 같은거
		}
		//가져오기
		public T get(int index) {
			return oArray[index];
		}
		//사각형 갯수
		public int size() {//몇개??
			return crtPos;//현재 겟수로 리턴 지금 2개의 주소 값이 담겨있음
		}

	}



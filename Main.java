package day0309;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int[] crd1 = { in.nextInt(), in.nextInt() };	// 첫 번째 좌표
		int[] crd2 = { in.nextInt(), in.nextInt() };	// 두 번째 좌표
		int[] crd3 = { in.nextInt(), in.nextInt() };	// 세 번째 좌표
 
		
		in.close();
		
		int x;
		int y;
 
		// x 좌표 비교 후 쌍을 이루지 않는 x좌표를 저장
		// 1번 x좌표와 2번 x좌표 비교 
		if (crd1[0] == crd2[0]) {	
			x = crd3[0];
		}
		// 1번 x좌표와 3번 x좌표 비교
		else if (crd1[0] == crd3[0]) {
			x = crd2[0];
		}
		// 2번 x좌표와 3번 x좌표 비교
		else {
			x = crd1[0];
		}
 
		// y 좌표 비교
		// 1번 y좌표와 2번 y좌표 비교
		if (crd1[1] == crd2[1]) {
			y = crd3[1];
		}
		// 1번 y좌표와 3번 y좌표 비교
		else if (crd1[1] == crd3[1]) {
			y = crd2[1];
		}
		// 2번 y좌표와 3번 y좌표 비교
		else {
			y = crd1[1];
		}
		
		System.out.println(x + " " + y);
		
	}
}
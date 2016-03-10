package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();

		/* 여기에 구현 코드를 작성 합니다. */

		int sum = 0;	// 합
		
		if( inputNumber%2 == 0 )	// 짝수인 경우
		{
			for(int i=1 ; i<=inputNumber/2 ; i++)
				sum += (i*2);
		} 
		else	// 홀수인 경우 
		{
			for(int i=0 ; i<(inputNumber/2)+1 ; i++)
				sum += (i*2+1);
		}
		
		// 결과 값 출력
		System.out.println("결과 값 : " + sum);
		
		scanner.close();
	}

}

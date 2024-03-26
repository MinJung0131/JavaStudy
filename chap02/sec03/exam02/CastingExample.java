package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		//강제 타입 변환
		//큰 허용 범위 타입을 작은 허용 범위 타입으로 강제로 나눠서 저장하는 것
		//()를 사용

		int intValue=44032;				//4byte
		char charValue=(char) intValue;	//2byte
		System.out.println(charValue);	//문자를 출력하기 위해 변환하는 경우가 있음
		
		long longValue = 500;			//8byte
		intValue = (int)longValue;		//4byte
		System.out.println(intValue);	
		
		double doubleValue = 3.14;		//8byte
		intValue = (int)doubleValue;	//4byte
		System.out.println(intValue);	//소수점 이하 버려짐
	}

}

package sec01.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		//변수 선언
		int value=10;
		
		//변수 value의 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		//value의 값을 초기화하지 않았기에 오류가 날것임
		int result = value+10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
	}

}

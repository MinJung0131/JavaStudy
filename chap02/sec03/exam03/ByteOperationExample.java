package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		//정수 타입 변수가 산술 연산식에서 피연산자로 사용되면 int타입보다 작은 타입의 변수는 자동으로 int타입으로 변환되어 연산 수행
		
		//피연산자가 변수가 아니므로 int타입으로 변환하지 않음
		//컴파일 단계에서 10+20을 먼저 연산하여 30을 만들고 변수에 30을 저장
		byte result = 10+20;
		System.out.println(result);
		
		byte x =10;
		byte y =20;
		int result2 = x+y;
		System.out.println(result2);

	}

}

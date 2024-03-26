package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		//자동 타입 변환
		//자동으로 타입 변환이 일어나는 것
		//값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될 때 발생
		byte byteValue =10;		//1byte
		int intValue = byteValue;	//4byte
		System.out.println("intValue: "+intValue);
		
		char charValue='가';		//2byte
		intValue=charValue;		//8byte
		System.out.println("\'가\'의 유니코드: "+intValue);
		
		intValue=50;			//4byte
		long longValue = intValue;	//8byte
		System.out.println("longValue: "+longValue);
		
		longValue=100;			//8byte
		float floatValue = longValue;	//4byte
		System.out.println("longValue: "+longValue);
		
		floatValue = 100.5F;		//4byte
		double doubleValue = floatValue;//8byte
		System.out.println("doubleValue: "+doubleValue);

	}

}

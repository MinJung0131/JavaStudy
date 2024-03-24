package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long var1 =10; //int 타입 허용 범위 이내라서 L을 붙여도, 붙이지 않아도 괜찮음
		long var2 =20L;
		long var3 = 1000000000000; //int 타입 허용 범위 외인데, L을 안붙였기에 컴파일 에러
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}

}

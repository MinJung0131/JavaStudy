package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14; 
		float var2 = 3.14f;
		double var3 = 3.14;
		//자바는 실수 리터럴을 기본적으로 double 타입으로 해석하기 때문에 double 타입 변수에 저장해야함
		//실수 리터럴을 float 타입에 저장하면 컴파일 에러 발생, 원할시 f또는F를 뒤에 붙여야함
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 =0.1234567890123456789;
		

		System.out.println("var2: "+var2);
		System.out.println("var3: "+var3);
		System.out.println("var4: "+var4);
		System.out.println("var5: "+var5);
		
		//e사용하기
		double var6 =3e6;
		float var7 = 3e6F;
		double var8 =2e-3;
		System.out.println("var6: "+var6);
		System.out.println("var7: "+var7);
		System.out.println("var8: "+var8);
		

	}

}

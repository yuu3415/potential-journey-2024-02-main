package ex;

public class ExceptionPractice {
	public static void main(String[] args) { 
		byte num1 = 80; 
		byte num2 = 50; 
		try { 
		byte result = add(num1, num2); 
		System.out.println("計算結果：" + result); 
		} catch (ArithmeticException e) { 
		String message = e.getMessage(); 
		System.out.println(message); 
		} 
		System.out.println("プログラムを終了します"); 
		} 
		/** 
		* 二つの byte 型整数の合計を返します。
		* 結果が byte の範囲を超える場合、例外をスローします。
		* @param num1 一つ目の値
		* @param num2 二つ目の値
		* @return 二つの byte 型整数の合計値
		* @throws ArithmeticException 結果が byte の範囲を超える場合
		*/
		static byte add(byte num1, byte num2) throws ArithmeticException { 
			 int result1=num1+num2;
			 
			 
			 if (-128<=result1&&result1<=127) {
			}else {
				String errMsg="計算結果がbyteの範囲を超えています";
				ArithmeticException ae=new ArithmeticException(errMsg);
				throw ae;
			}
			 byte result=(byte)result1;
			 return result;
		} 
		}

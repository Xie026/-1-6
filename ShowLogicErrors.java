
public class ShowLogicErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Celsius 35 is Fahrenheit degree ");
System.out.println((9/5)*35+32);
	}

}
逻辑错误：结果华氏67度是错误的，应该是95.0。Java中，整数相除是返回除数的整数部分，即小数部分被截掉，因此Java中9/5的结果是1。要得到正确结果，需要使用9.0/5，这样得到结果1.8。

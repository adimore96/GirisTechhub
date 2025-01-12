public class BitwiseNotOperator{
	public static void main(String[] args) {
		int i = 50;
		System.out.print(~i); //-51
		System.out.print(",");
		System.out.print(~--i); //-50 and i will be 49
		System.out.print(",");
		System.out.print(~++i); //-51 and i will be 50
	}
}

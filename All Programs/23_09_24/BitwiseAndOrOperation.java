class BitwiseAndOrOperation {
	public static void main(String args[]) {
		int a = 3;
		int b = 6;
		//   0 1 1
		//   1 1 0
		//----------
		//   1 1 1  =>  7
		int c = a | b;  //7
		//   0 1 1
		//   1 1 0
		//----------
		//   0 1 0  =>  2
		int d = a & b; //2
		System.out.println(c + "\t" + d);
	}
}

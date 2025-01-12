public class Demo1 {
    public static void main(String[] args) {
        int dailywage = 4;
        int number_of_days = 5;
		int salary;
		salary = number_of_days++ * --dailywage * dailywage++ * number_of_days--;
		//	   =   5     *   3     *   3   *   6
		//     =   225
        salary =- dailywage;
		//      = - 4
        System.out.println(dailywage + " " + number_of_days + " " + salary);
		// 					4					5				     -4
    }
}

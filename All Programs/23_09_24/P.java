public class P {
    public static void main(String[] args) {
    	
    	int a = 10, b = 5, c = 1, result;
    	result = a-++c-++b;
          //      result = a-(2)-(6)    
         //       result = 10-2=8
         //       result = 8-6
        //        result = 2 
    	System.out.println (result);
    }
}

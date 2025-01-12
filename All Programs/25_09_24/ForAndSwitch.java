class ForAndSwitch { 
public static void main(String args[])
{ 
    int z=3; 
    for(int i=0; i<2;i++)
     { 
    z++; 
     switch(z)
     { 
       case 3: 
            System.out.println(z=z+1); 
     case 5:
           System.out.println(z=z+2 ); 
          break; 
     default :
           System.out.println(z=z+8 ); 
     case 6: 
           System.out.println( z=z+4); 
      } 
     z--; 
    } 
 } 

}

//12  16  24  28
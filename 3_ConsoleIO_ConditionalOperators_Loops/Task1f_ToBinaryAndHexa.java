import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// The easy way :)
		//System.out.println(Integer.toString(numberToFormat,2)); 
		//System.out.println(Integer.toString(numberToFormat, 16));
		
		 char hexa[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		 int numberToFormat = sc.nextInt();
		 int hexFormat = numberToFormat;
 
	
	      String binaryValueOfNum = "";
	      String hexaValueOfNum = "";
	      
	      while(numberToFormat > 0)
	      {
	         int binary = numberToFormat % 2;
	         binaryValueOfNum = binary + binaryValueOfNum;
	         numberToFormat = numberToFormat / 2;
	      }
	      
	      while (hexFormat > 0) {
	    	  int temp = hexFormat % 16;
	    	  hexaValueOfNum = hexa[temp] + hexaValueOfNum;
	    	  hexFormat = hexFormat / 16;
	      }
	      System.out.println(binaryValueOfNum);
	      System.out.println(hexaValueOfNum);
	      sc.close();
	}

}

//Meghana Aravind A00256942 
//Divya Khemani A00254753
import java.util.Scanner;


public class Convertion
{
	public static void main(String[] args) {
		Double convert_value;
		String unit;
		Scanner scanner_one = new Scanner(System.in); 
		 System.out.println("Enter a value to convert:");
		  convert_value = scanner_one.nextDouble(); //accepting the value to be converted from the user
		  System.out.println("Enter the current unit of measure:"); 
		  Scanner scanner_two = new Scanner(System.in); 
		  unit = scanner_two.nextLine(); //accepting the current unit of the value from the user

		 
          switch(unit)
		  {
			  case "km" : //to accept all cases
			  case "Km" :
			  case "KM" :
			  System.out.println(convert_value+ " km is equal to " +(convert_value*0.62)+"mi");   
			  break;
			  case "mi" :
			  case "MI" :
			  case "Mi" :
			  System.out.println(convert_value+ "mi is equal to " +(convert_value*1.61)+"km");
			  break;


			  case "CM" :
			  case "cm" :
			  case "Cm" :
			  System.out.println(convert_value+ "cm is equal to " +(convert_value*0.39)+"in");
			  break;
			  case "IN" :
			  case "in" :
			  case "In" :
			  System.out.println(convert_value+ "in is equal to " +(convert_value*2.54)+"cm");
			  break;


			  case "KG" :
			  case "kg" :
			  case "Kg" :
			  System.out.println(convert_value+ "kg is equal to " +(convert_value*2.21)+"lbs");
			  break;
              case "lbs" :
			  case "LBS" :
			  case "Lbs" :
			  System.out.println(convert_value+ "lbs is equal to " +(convert_value/2.21)+"kg");
			  break;


			  case "g" :
			  case "G" :
			  System.out.println(convert_value+ "g is equal to " +(convert_value*0.04)+"oz");
			  break;
			  case "OZ" :
			  case "oz" :
			  case "Oz" :
			  System.out.println(convert_value+ "oz is equal to " +(convert_value*28.35)+"g");
			  break;


			  case "l" :
			  case "L" :
			  System.out.println(convert_value+ "L is equal to " +(convert_value*4.17)+"cups");
			  break;
			  case "cup" :
			  case "CUP" :
			  case "Cup" :
			  System.out.println(convert_value+ "oz is equal to " +(convert_value*0.24)+"l");
			  break;

			  
			  case "c" :
			  case "C" :
			  System.out.println(convert_value+ "C is equal to " +((convert_value*9/5)+32)+"F");
			  System.out.println(convert_value+ "C is equal to " +(convert_value+273.15)+"K");
			  break;
			  case "f" :
			  case "F" :
			  System.out.println(convert_value+ "F is equal to " +((convert_value-32)*5/9+"C"));
			  System.out.println(convert_value+ "F is equal to " +((convert_value-32)*5/9+(273.15)+"K"));
			  break;
			  }
 }
}

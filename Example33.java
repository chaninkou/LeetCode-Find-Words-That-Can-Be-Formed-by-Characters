package example33;
import java.util.Scanner;
/*   
Author: Chan In Kou
Purpose: The Display will show mean and standard deviation
*/
public class Example33 
{
	public static void main(String[] args) 
	{
	    //create a Scanner
		Scanner in = new Scanner(System.in);
		
		//declaring variables	
		double sum = 0;
		double count = 0;
		double mean = 0;
		double sumOfInputSquared = 0;
		
		//reads in an unknown amount of input 
		System.out.print("Enter positive numbers (-1 to end input): ");

		while(true) 
		{
			double input = in.nextDouble();
			if(input == -1) 
			break;
		    if(input > 0) 
			{
		    sum += input;
			count++;
			//computes the mean
			mean = sum / count;
			sumOfInputSquared += input * input;
			}
			else
			{
		    //must be positive
			System.out.println("number must be positive");
			}
		}
		//calculation
		double sumSquared = sum*sum;
		double something = (sumOfInputSquared - ((1/count) * sumSquared)) / (count - 1);
		double dev = Math.sqrt(something);
		
		//spaces
		System.out.println("");
		 
		//displaying the mean
		System.out.println("Mean: \t\t" + mean);
		
		//displaying the deviation
		System.out.println("Deviation: \t" + dev);
    }
}
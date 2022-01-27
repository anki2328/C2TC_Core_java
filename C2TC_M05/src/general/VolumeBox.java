package general;
import java.util.*;


public class VolumeBox {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length of Box:");
		double l=s.nextDouble();
		System.out.println("Enter the Bredth of Box:");
		double b=s.nextDouble();
		System.out.println("Enter the Height of Box:");
		double h=s.nextDouble();
		
		double volume=l*b*h;
		System.out.println("Volume of the Box is:" +volume);
		

	}

}

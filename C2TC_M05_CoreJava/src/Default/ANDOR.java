package Default;

public class ANDOR {

	public static void main(String[] args) {
		int x, y;
		x=10;
		y=-10;
		
		if(x>0 && y>0) {
			System.out.println("both number are +ve");
		}else if(x>0 || y>0) {
			System.out.println("atleast one number is +ve");
	}else {
		System.out.println("both nums are -ve");

	}
}
}

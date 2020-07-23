import java.lang.Math;
public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = Math.random();
		while(true) {
			if( r > 0.01) {
				double result = 3.14*r;
				System.out.println("the radius of circle is: " +r);
				System.out.println("the area of circle is: " + result);
				System.out.println();
			}
			else {
				System.out.println("the radius of circle is:" +r);
				System.out.println("Invalid Range");
				break;
			}
		}
	
	
	}

}

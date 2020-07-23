import java.util.*;
class SimilarTypeArratList {

// I am not able to implement this question
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		System.out.println("Enter the list:");
		Scanner input = new Scanner(System.in);
		//input.nextLine();
		try {
				if(input.hasNextLine() == input.hasNextInt()) {
					Scanner a = new Scanner(System.in);
					a.hasNextInt();
					l.add(a);
				}
				else if(input.hasNextLine() == input.hasNextDouble()) {
					Scanner a = new Scanner(System.in);
					a.hasNextDouble();
					l.add(a);
				}
				else {
					String a = input.nextLine();
					l.add(a);
				}	
				System.out.println(l);
		}	
		catch(Exception e) {
			
			System.out.println("Error");
		}
	}
	

}

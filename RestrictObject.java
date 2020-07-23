
public class RestrictObject {
	//private static RestrictObjectCreation;
	public static int objCount = 0;
	 
	private void RestrictObjectCreation(){
	     System.out.println("Singleton(): Private constructor invoked");
	     objCount  ++;
	}
	 
	public static RestrictObject getInstance(){
		RestrictObject object = null;
		if (objCount < 3){
			object = new RestrictObject(); 
	 }
	return object; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestrictObject obj1= RestrictObject.getInstance();
		RestrictObject obj2= RestrictObject.getInstance();
		RestrictObject obj3= RestrictObject.getInstance();
		RestrictObject obj4= RestrictObject.getInstance();
		RestrictObject obj5= RestrictObject.getInstance();
		 
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
	}

}

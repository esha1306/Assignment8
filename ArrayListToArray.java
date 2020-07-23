import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> EmpList = new ArrayList<>();  
       
        EmpList.add("Charise");  
        EmpList.add("Caron");  
        EmpList.add("Cindy");  
        EmpList.add("Marie");  
        EmpList.add("Lea");  
        System.out.println("Converting ArrayList to Array" );  
        String[] item = EmpList.toArray(new String[EmpList.size()]);  
        for(String s : item){  
            System.out.println(s);  
        }  
        System.out.println("Converting Array to ArrayList" );  
        List<String>l2 = new ArrayList<>();  
        l2 =  Arrays.asList(item);  
        System.out.println(l2);  
	}

}

package hankerrank.easy;
import java.util.HashMap;
import java.util.Scanner;

public class map {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
   
        
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone= Integer.valueOf(in.nextLine());
            
            map.put(name, phone);
			// in.nextLine();
		}
        
        // System.out.println(map.get("uncle sam"));

		while(in.hasNext())
		{
			String s=in.nextLine();
            if(map.get(s) !=null )
            System.out.println(s+ "="+map.get(s));
            else
             System.out.println("Not found");
            //  System.out.println(s);
		}
        in.close();
    }
    
}

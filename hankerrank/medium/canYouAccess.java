package hankerrank.medium;

import java.io.BufferedReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Permission;

import hankerrank.easy.reflection;

public class canYouAccess {
    
    public static void main(String[] args) throws Exception {
		DoNotTerminate.forbidExit();	

		try{
			// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// int num = Integer.parseInt(br.readLine().trim());
            int num = 8;
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

			//Write your code here
            Inner i = new Inner();
            o = i.new Private();

            System.out.println(o.getClass().getCanonicalName());
            
            Method m = o.getClass().getDeclaredMethod("powerof2", int.class);
            

            System.out.println(m.invoke(o, num));


		System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		
		}//end of try
		
		catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}//end of main
	static class Inner{
		private class Private{
			private String powerof2(int num){
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}//end of Inner
	
}//end of Solution

class DoNotTerminate { //This class prevents exit(0)
	 
    public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}	
	

// https://www.hackerrank.com/challenges/can-you-access/problem?isFullScreen=true
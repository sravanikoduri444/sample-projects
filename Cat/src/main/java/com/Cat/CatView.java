package com.Cat;
import java.util.Scanner;
import com.CatController.CatController;
import com.CatController.CatControllerInterface;

public class CatView {

	public static void main(String[] args) {  //Public:-- To provide access permission to the jvm declare main is public.
		                                      //static:-- To provide direct access permission to the jvm declare main is 
		                                       //static(with out creation of object able to access main method)
												//void:-- don’t return any values to the JVM.						
		String s = "y";
		while(s.contentEquals("y")) { //Comparing
		System.out.println("*********************MAIN MENU*********************");  // 
		System.out.println("Press 1 to create a profile");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
	    CatControllerInterface cc = new CatController();
	    switch(ch)
	    {
	    case 1:
	    	cc.createProfileController();
	    	break;
	    default:System.out.println("Wrong choice");
	    }
	    System.out.println("do you want to continue press y/n");
	    s=sc.next();
		}
	}

}

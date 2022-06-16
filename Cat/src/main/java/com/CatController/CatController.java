package com.CatController;

import java.util.Scanner;

import com.CatEntity.Catuser;
import com.CatService.CatService;
import com.CatService.CatServiceInterface;

public class CatController implements CatControllerInterface {

	public void createProfileController() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name =sc.next();
		System.out.println("Enter email");
		String email= sc.next();
		System.out.println("Enter passowrd");
		String password = sc.next();
		System.out.println("Enter address");
		String address=sc.next();
		Catuser cu = new Catuser();
		cu.setName(name);
		cu.setEmail(email);
		cu.setPassowrd(password);
		cu.setAddress(address);
		CatServiceInterface cs = new CatService();
		int i = cs.createProfileService(cu);
		if(i>0)
		{
			System.out.println("your profile created");
		}
		else
		{
			System.out.println("Your profile not created");
		}
	}

}

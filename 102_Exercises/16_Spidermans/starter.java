/*
	Author: Abigail Chavez 
	Date: 10/28/25
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
	

		Spiderman x = new Spiderman("Tobye_miguirer");
		x.setAge(48);
		x.setvillain("green goblin");
		System.out.println(x.getactor());
		System.out.println(x.getAge());
		System.out.println(x.getvillen());
		System.out.println("------------------");
		
		Spiderman y = new Spiderman("Andrew Garfield");
		y.setAge(40);
		y.setvillain("Electro");
		System.out.println(y.getactor());
		System.out.println(y.getAge());
		System.out.println(y.getvillen());
		System.out.println("------------------");
		
		Spiderman z = new Spiderman("Tom Holland");
		z.setAge(27);
		z.setvillain("The Vulture");
		System.out.println(z.getactor());
		System.out.println(z.getAge());
		System.out.println(z.getvillen());
		System.out.println("------------------");
		
		Spiderman a = new Spiderman("miles morales");
		a.setAge(17);
		a.setvillain("The Tinkerer");
		System.out.println(a.getactor());
		System.out.println(a.getAge());
		System.out.println(a.getvillen());
		System.out.println("------------------");
		

	}
}

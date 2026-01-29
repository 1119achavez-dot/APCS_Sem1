/*
 *	Author:  a
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name = name; 
		this.age = age;   // this = varibal 
		
	}

	/*	Accessor Methods */
	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;

	}

	/*	Mutator Methods	*/
	public void setName(String nane){
		this.name = name;
	}
	
	public void setAge(int age){ // change to int or no run , why
		this.age=age;
	}

	public boolean isSameName(String name){
		return this.name.equals(name); // name = name
	}
}


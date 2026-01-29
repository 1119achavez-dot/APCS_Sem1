package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name ;
	int age ;
	String breed ;
		
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	
	public Dog(String x) {
		name = x;
		age = 1;
		breed = "dog dog";
	}
		public Dog(String x,String a) {
		name = x;
		age = 1;
		breed = a;
	}
		public Dog(String x,int y) {
		name = x;
		age = y;
		breed = "dog dog";
	}
		public Dog(String x,int y,String a) {
		name = x;
		age = y;
		breed = a;
	}
	
	public void setName(String x) {
		name = x;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setBreed(String y) {
		breed = y;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
	
	public boolean isSleeping() {
		int ty = (int)(Math.random() *(2-1)+1);
		if (ty == 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void bark() {
		System.out.print(name +":bark!bark!");
		
	}
	
}

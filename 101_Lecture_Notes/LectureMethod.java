/* 
    Lecture note example - Methods
*/
import java.util.Scanner;
class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Numba 1:");
        int num1 = sc.nextInt();
        System.out.println ("numba 2:");
        int num2 = sc.nextInt();
        
        int num1Squared = squared(num1);
        System.out.println(squared(num2));
        
        System.out.println(absoulute(num1));
        System.out.println(absoulute(num2));
        
    }
    public static int squared (int a) { 
        return a * a;
    }
    public static int absoulute (int a){
        if(a<0) {
            return a * (-1);
        }
        else{
            return a;
        }
    }
	}

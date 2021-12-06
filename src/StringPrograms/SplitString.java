package StringPrograms;


import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine(); // today is saturday  ->> saturday today is

		String[] test = s.split(" ");
	/*
		
		for(int i=0; i<test.length;i++) {
           
            System.out.println("s["+i+"] : "+test[i]);
          
        }
		
		*/
		System.out.println(test[2]);
		System.out.println(test[1]);
		System.out.println(test[0]);

	}

}

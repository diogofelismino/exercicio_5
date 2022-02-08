package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		char ch = 'A';
		
		for(int i=1; i <= 3; i++) {
			System.out.print("How many students for course " + ch + "? ");
			int esc = sc.nextInt();
			
			for(int l=1; l <= esc; l++) {
				int code = sc.nextInt();
				set.add(new Student(code));
			}		
			ch++;
		}
		
		System.out.println("Total students: " + set.size());
	
		sc.close();
	}

}

package ua.lviv.lgs.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {
	static void menu() {
		System.out.println("Press 1 to add a new item to the list ");
		System.out.println("Press 2 to remove the element index ");
	}
	boolean isEmpty(){
        boolean bool = (testList.size()<1);
        return bool;
    }
	static List<String> testList = new ArrayList<String>();

	public static void main(String[] args) {		
		while (true) {
			menu();
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			switch (s) {
			case 1: {
				System.out.println("Enter what you want to add to the list ");
				System.out.println(testList);
				sc = new Scanner(System.in);
				String text = sc.nextLine();
				testList.add(text);
				System.out.println(testList);
				break;
			}
			
			case 2: {
				System.out.println("Enter index of the element what you want to remove ");
				System.out.println(testList);
				sc = new Scanner(System.in);
				int index = sc.nextInt();
				testList.remove(index);
				System.out.println(testList);
				break;
			}
			
			}
		}

	}
}

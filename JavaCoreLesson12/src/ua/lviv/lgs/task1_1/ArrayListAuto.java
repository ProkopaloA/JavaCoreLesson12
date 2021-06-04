package ua.lviv.lgs.task1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListAuto {
	static void menu() {
		System.out.println("Enter 1 to display an array of random cars");
		System.out.println("Enter 2 to fill the array with the same values for a random car");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<SteeringWheelMaterial> wheelMaterialList = new ArrayList<SteeringWheelMaterial>();

		for (SteeringWheelMaterial wheelMaterialValue : SteeringWheelMaterial.values()) {
			wheelMaterialList.add(wheelMaterialValue);
		}

		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1: {
				List<Auto> autoArrayList = new ArrayList<Auto>();
				for (int i = 0; i < getRandomValueFromRange(0, 5); i++) {
					List<Auto> autoArrayList1 = new ArrayList<Auto>();
					for (int j = 0; j < getRandomValueFromRange(0, 5); j++) {
						autoArrayList1.add(new Auto(getRandomValueFromRange(25, 450),
								getRandomValueFromRange(1980, 2021),
								new SteeringWheel(getRandomValueFromRange(25, 35), wheelMaterialList
										.get(getRandomValueFromRange(0, wheelMaterialList.size() - 1)).toString()),
								new Engine(getRandomValueFromRange(2, 16))));
					}
					autoArrayList.addAll(autoArrayList1);
				}

				System.out.println(autoArrayList);
				break;
			}

			case 2: {

				Auto auto = new Auto(getRandomValueFromRange(25, 450), getRandomValueFromRange(1980, 2021),
						new SteeringWheel(getRandomValueFromRange(25, 35), wheelMaterialList
								.get(getRandomValueFromRange(0, wheelMaterialList.size() - 1)).toString()),
						new Engine(getRandomValueFromRange(2, 16)));

				List<Auto> autoArrayList = new ArrayList<Auto>();

				for (int i = 0; i < getRandomValueFromRange(0, 5); i++) {
					autoArrayList.add(auto);
				}

				System.out.println(autoArrayList);
				break;
			}

			default: {
				System.out.println("The entered number must be 1 or 2!");
				break;
			}

			}
		}
	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}

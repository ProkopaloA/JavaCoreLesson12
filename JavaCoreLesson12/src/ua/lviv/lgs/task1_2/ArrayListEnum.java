package ua.lviv.lgs.task1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEnum {
	static void menu() {
		System.out.println("ўоб перев≥рити чи м≥с€ць ≥снуЇ введ≥ть 0");
		System.out.println("ўоб вивести вс≥ м≥с€ц≥ з такою ж порою року введ≥ть 1");
		System.out.println("ўоб вивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в введ≥ть 2");
		System.out.println("ўоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в введ≥ть 3");
		System.out.println("ўоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в введ≥ть 4");
		System.out.println("ўоб вивести на екран наступну пору року введ≥ть 5");
		System.out.println("ўоб вивести на екран попередню пору року введ≥ть 6");
		System.out.println("ўоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в введ≥ть 7");
		System.out.println("ўоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в введ≥ть 8");
		System.out.println("ўоб вивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в введ≥ть 9");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Seasons> seasons = new ArrayList<Seasons>();
		List<Month> month = new ArrayList<Month>();

		while (true) {
			menu();
			switch (sc.next()) {
			case "0": {
				System.out.println("¬вед≥ть м≥с€ць");
				sc = new Scanner(System.in);
				String month1 = sc.next().toUpperCase();
				boolean flag = false;

                for (Month m : month) {
                    if (m.name().equals(month1)) {
                        System.out.println("“акий м≥с€ць ≥снуЇ");
                        flag = true;
                    }

                }

                if (!flag) {
                    System.out.println("“акий м≥с€ць не ≥снуЇ");
                }

				break;
			}

			case "1": {
				System.out.println("¬вед≥ть пору року");
				String season = sc.next().toUpperCase();
				if (seasons.contains(season)) {
					for (Month m : month) {
						if (m.getSeasons().toString().equalsIgnoreCase(season)) {
							System.out.println("« такою ж порою року м≥с€ц≥ : " + m);
						}
					}
				}
				if (!seasons.contains(season)) {
					System.out.println("“акоњ пори року немаЇ");
				}
				break;
			}
			case "2": {
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в у м≥с€ц≥");
				sc = new Scanner(System.in);
				int NumberOfDays1 = sc.nextInt();
				if (NumberOfDays1 == 28) {
					System.out.println("Ћише Ћютий на таке спроможний");
				}
				for (Month m : month) {
					if (m.getNumberOfDays() == NumberOfDays1) {
						System.out.println("—т≥льки ж дн≥в у м≥с€ц≥ : " + m);
					}
				}
				if (NumberOfDays1 > 31) {
					System.out.println("ћ≥с€ц€ з такою к≥льк≥стью дн≥в не ≥снуЇ");
				}
				if (NumberOfDays1 < 28) {
					System.out.println("ћ≥с€ц€ з такою к≥льк≥стью дн≥в не ≥снуЇ");
				}
				break;
			}
			case "3": {
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в у м≥с€ц≥");
				int numberOfDays2 = sc.nextInt();

				boolean flag = false;

				for (Month m : month) {
					if (m.getNumberOfDays() == numberOfDays2) {
						flag = true;
					}
				}

				if (flag) {

					for (Month m2 : month) {
						if (m2.getNumberOfDays() < numberOfDays2) {
							System.out.println("” цьомц м≥с€ц≥ менше дн≥в " + m2);
						}
					}
				}

				if (flag == false)
					System.out.println("“аких м≥с€ц≥в не буваЇ");

				break;
			}
			case "4": {
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в у м≥с€ц≥");
				int numberOfDays3 = sc.nextInt();
				boolean flag = false;
				for (Month m : month) {
					if (m.getNumberOfDays() == numberOfDays3) {
						flag = true;
					}
				}

				if (flag) {

					for (Month m2 : month) {
						if (m2.getNumberOfDays() > numberOfDays3) {

							System.out.println("” цьомц м≥с€ц≥ б≥льше дн≥в " + m2);
						}
					}
				}

				if (!flag) {
					System.out.println("“аких м≥с€ц≥в не буваЇ");
				}
				break;
			}
			case "5": {
				System.out.println("¬вед≥ть пору року");
				String season1 = sc.next().toUpperCase();
				boolean flag = false;
				for (Seasons s : seasons) {
					if (s.name().equalsIgnoreCase(season1)) {
						Seasons seasons2 = Seasons.valueOf(season1);
						int i = seasons2.ordinal();

						if (i == (seasons.size() - 1)) {
							i = 0;
							System.out.println("Ќаступна " + seasons.get(i));
						} else {
							System.out.println("Ќаступна " + seasons.get(i + 1));
						}
					}
				}
				if (!seasons.contains(season1)) {
					System.out.println("Ќев≥рно вказано пору року");
				}

				break;
			}
			case "6": {
				System.out.println("¬вед≥ть пору року");
				String season0 = sc.next().toUpperCase();
				for (Seasons s : seasons) {
					if (s.name().equalsIgnoreCase(season0)) {
						Seasons seasons2 = Seasons.valueOf(season0);
						int i = seasons2.ordinal();

						if (i == (seasons.size() - 1)) {
							i = 0;
							System.out.println("ѕеред тим була " + seasons.get(i));
						} else {
							System.out.println("ѕеред тим була " + seasons.get(i + 1));
						}
					}
				}
				if (!seasons.contains(season0)) {
					System.out.println("Ќев≥рно вказано пору року");
				}

				break;
			}
			case "7": {
				System.out.println("м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в");
				for (Month m : month) {
					if (m.getNumberOfDays() % 2 == 0) {
						System.out.println(m);
					}
				}

				break;
			}
			case "8": {
				System.out.println("м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в ");

				for (Month m : month) {
					if (m.getNumberOfDays() % 2 != 0) {
						System.out.println(m);
					}
				}

				break;
			}
			case "9": {
				System.out.println("¬вед≥ть м≥с€ць ");
				String month0 = sc.next().toUpperCase();

				boolean flag = isMonthPresent(month, month0);

				if (flag) {
					Month m3 = Month.valueOf(month0);
					if (m3.numberOfDays % 2 == 0) {
						System.out.println("÷ей м≥с€ць: " + m3 + " маЇ парну к≥льк≥сть дн≥в " + m3.getNumberOfDays());
					} else {
						System.out
								.println("÷ей м≥с€ць: " + m3 + " маЇ не парну к≥льк≥сть дн≥в " + m3.getNumberOfDays());
					}
				}

				if (!flag)
					System.out.println("“аких м≥с€ц≥в не буваЇ ");

				break;
			}
			}
		}
	}

	private static boolean isMonthPresent(List<Month> month, String month1) {
		boolean flag = false;
		for (Month m : month) {
			if (m.name().equalsIgnoreCase(month1)) {
				System.out.println("ћ≥с€ць ≥снуЇ");
				flag = true;
			}
		}
		return flag;
	}

}

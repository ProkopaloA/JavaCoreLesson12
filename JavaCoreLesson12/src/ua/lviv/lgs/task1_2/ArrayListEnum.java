package ua.lviv.lgs.task1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEnum {
	static void menu() {
		System.out.println("��� ��������� �� ����� ���� ������ 0");
		System.out.println("��� ������� �� ����� � ����� � ����� ���� ������ 1");
		System.out.println("��� ������� �� ����� �� ����� ���� ���� ������� ��� ������ 2");
		System.out.println("��� ������� �� ����� �� ����� �� ����� ����� ������� ��� ������ 3");
		System.out.println("��� ������� �� ����� �� ����� �� ����� ����� ������� ��� ������ 4");
		System.out.println("��� ������� �� ����� �������� ���� ���� ������ 5");
		System.out.println("��� ������� �� ����� ��������� ���� ���� ������ 6");
		System.out.println("��� ������� �� ����� �� ����� �� ����� ����� ������� ��� ������ 7");
		System.out.println("��� ������� �� ����� �� ����� �� ����� ������� ������� ��� ������ 8");
		System.out.println("��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ��� ������ 9");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Seasons> seasons = new ArrayList<Seasons>();
		List<Month> month = new ArrayList<Month>();

		while (true) {
			menu();
			switch (sc.next()) {
			case "0": {
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				String month1 = sc.next().toUpperCase();
				boolean flag = false;

                for (Month m : month) {
                    if (m.name().equals(month1)) {
                        System.out.println("����� ����� ����");
                        flag = true;
                    }

                }

                if (!flag) {
                    System.out.println("����� ����� �� ����");
                }

				break;
			}

			case "1": {
				System.out.println("������ ���� ����");
				String season = sc.next().toUpperCase();
				if (seasons.contains(season)) {
					for (Month m : month) {
						if (m.getSeasons().toString().equalsIgnoreCase(season)) {
							System.out.println("� ����� � ����� ���� ����� : " + m);
						}
					}
				}
				if (!seasons.contains(season)) {
					System.out.println("���� ���� ���� ����");
				}
				break;
			}
			case "2": {
				System.out.println("������ ������� ��� � �����");
				sc = new Scanner(System.in);
				int NumberOfDays1 = sc.nextInt();
				if (NumberOfDays1 == 28) {
					System.out.println("���� ����� �� ���� ����������");
				}
				for (Month m : month) {
					if (m.getNumberOfDays() == NumberOfDays1) {
						System.out.println("������ � ��� � ����� : " + m);
					}
				}
				if (NumberOfDays1 > 31) {
					System.out.println("̳���� � ����� �������� ��� �� ����");
				}
				if (NumberOfDays1 < 28) {
					System.out.println("̳���� � ����� �������� ��� �� ����");
				}
				break;
			}
			case "3": {
				System.out.println("������ ������� ��� � �����");
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
							System.out.println("� ����� ����� ����� ��� " + m2);
						}
					}
				}

				if (flag == false)
					System.out.println("����� ������ �� ����");

				break;
			}
			case "4": {
				System.out.println("������ ������� ��� � �����");
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

							System.out.println("� ����� ����� ����� ��� " + m2);
						}
					}
				}

				if (!flag) {
					System.out.println("����� ������ �� ����");
				}
				break;
			}
			case "5": {
				System.out.println("������ ���� ����");
				String season1 = sc.next().toUpperCase();
				boolean flag = false;
				for (Seasons s : seasons) {
					if (s.name().equalsIgnoreCase(season1)) {
						Seasons seasons2 = Seasons.valueOf(season1);
						int i = seasons2.ordinal();

						if (i == (seasons.size() - 1)) {
							i = 0;
							System.out.println("�������� " + seasons.get(i));
						} else {
							System.out.println("�������� " + seasons.get(i + 1));
						}
					}
				}
				if (!seasons.contains(season1)) {
					System.out.println("������ ������� ���� ����");
				}

				break;
			}
			case "6": {
				System.out.println("������ ���� ����");
				String season0 = sc.next().toUpperCase();
				for (Seasons s : seasons) {
					if (s.name().equalsIgnoreCase(season0)) {
						Seasons seasons2 = Seasons.valueOf(season0);
						int i = seasons2.ordinal();

						if (i == (seasons.size() - 1)) {
							i = 0;
							System.out.println("����� ��� ���� " + seasons.get(i));
						} else {
							System.out.println("����� ��� ���� " + seasons.get(i + 1));
						}
					}
				}
				if (!seasons.contains(season0)) {
					System.out.println("������ ������� ���� ����");
				}

				break;
			}
			case "7": {
				System.out.println("����� �� ����� ����� ������� ���");
				for (Month m : month) {
					if (m.getNumberOfDays() % 2 == 0) {
						System.out.println(m);
					}
				}

				break;
			}
			case "8": {
				System.out.println("����� �� ����� ������� ������� ��� ");

				for (Month m : month) {
					if (m.getNumberOfDays() % 2 != 0) {
						System.out.println(m);
					}
				}

				break;
			}
			case "9": {
				System.out.println("������ ����� ");
				String month0 = sc.next().toUpperCase();

				boolean flag = isMonthPresent(month, month0);

				if (flag) {
					Month m3 = Month.valueOf(month0);
					if (m3.numberOfDays % 2 == 0) {
						System.out.println("��� �����: " + m3 + " �� ����� ������� ��� " + m3.getNumberOfDays());
					} else {
						System.out
								.println("��� �����: " + m3 + " �� �� ����� ������� ��� " + m3.getNumberOfDays());
					}
				}

				if (!flag)
					System.out.println("����� ������ �� ���� ");

				break;
			}
			}
		}
	}

	private static boolean isMonthPresent(List<Month> month, String month1) {
		boolean flag = false;
		for (Month m : month) {
			if (m.name().equalsIgnoreCase(month1)) {
				System.out.println("̳���� ����");
				flag = true;
			}
		}
		return flag;
	}

}

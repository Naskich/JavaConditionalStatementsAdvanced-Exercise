
/*5.	Пътешествие
Странно, но повечето хора си плануват от рано почивката. Млад програмист разполага с определен бюджет и свободно време в даден сезон. Напишете програма, която да приема на входа бюджета и сезона, а на изхода да изкарва, къде ще почива програмиста и колко ще похарчи.
Бюджета определя дестинацията, а сезона определя колко от бюджета ще изхарчи. Ако е лято ще почива на къмпинг, а зимата в хотел. Ако е в Европа, независимо от сезона ще почива в хотел. Всеки къмпинг или хотел, според дестинацията, има собствена цена която отговаря на даден процент от бюджета: 
•	При 100лв. или по-малко – някъде в България
o	Лято – 30% от бюджета
o	Зима – 70% от бюджета
•	При 1000лв. или по малко – някъде на Балканите
o	Лято – 40% от бюджета
o	Зима – 80% от бюджета
•	При повече от 1000лв. – някъде из Европа
o	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.
Вход
Входът се чете от конзолата и се състои от два реда, въведени от потребителя:
•	Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
•	Втори ред –  Един от двата възможни сезона: „summer” или “winter”
Изход
На конзолата трябва да се отпечатат два реда.
•	Първи ред – "Somewhere in [дестинация]“ измежду "Bulgaria", "Balkans" и "Europe"
•	Втори ред – "{Вид почивка} – {Похарчена сума}"
o	Почивката може да е между "Camp" и "Hotel"
o	Сумата трябва да е закръглена с точност до вторият знак след запетаята.
Примерен вход и изход
вход	изход
50
summer	Somewhere in Bulgaria
Camp - 15.00
75
winter	Somewhere in Bulgaria
Hotel - 52.50
312
summer	Somewhere in Balkans
Camp - 124.80
678.53
winter	Somewhere in Balkans
Hotel - 542.82
1500
summer	Somewhere in Europe
Hotel - 1350.00
 * */
import java.util.Scanner;
public class JourneyHolidays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double budgetHoliday = Double.parseDouble(scanner.nextLine());
		if (budgetHoliday>=10 && budgetHoliday<=5000) {
			String seаsonHoliday = scanner.nextLine();
			if ("summer".equals(seаsonHoliday) || "winter".equals(seаsonHoliday)) {
				switch (seаsonHoliday) {
				case "summer":
					if (budgetHoliday<=100) {
						budgetHoliday=budgetHoliday*0.3;
						System.out.printf("Somewhere in Bulgaria \nCamp - %.2f ", budgetHoliday);
					}
					if (budgetHoliday>100 && budgetHoliday<=1000) {
						budgetHoliday=budgetHoliday*0.4;
						System.out.printf("Somewhere in Balkans \nCamp - %.2f ", budgetHoliday);
					}
					if (budgetHoliday>1000) {
						budgetHoliday=budgetHoliday*0.9;
						System.out.printf("Somewhere in Europe \nHotel - %.2f ", budgetHoliday);
					}
					break;		
				case "winter":
					if (budgetHoliday<=100) {
						budgetHoliday=budgetHoliday*0.7;
						System.out.printf("Somewhere in Bulgaria \nHotel - %.2f ", budgetHoliday);
					}
					if (budgetHoliday>100 && budgetHoliday<=1000) {
						budgetHoliday=budgetHoliday*0.8;
						System.out.printf("Somewhere in Balkans \nHotel - %.2f ", budgetHoliday);
					}
					if (budgetHoliday>1000) {
						budgetHoliday=budgetHoliday*0.9;
						System.out.printf("Somewhere in Europe \nHotel - %.2f ", budgetHoliday);
					}
					break;
				}	
			} else {
			 System.out.println("Invalid string for season");
			}
		} else {
			System.out.println("Invalid parameter for sum ");
		}
	}
}


/*
*
* В една кинозала столовете са наредени в правоъгълна форма в
*  r реда и c колони. Има три вида прожекции с билети на различни цени:
•	Premiere – премиерна прожекция, на цена 12.00 лева.
•	Normal – стандартна прожекция, на цена 7.50 лева.
•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
Напишете програма, която чете тип прожекция (стринг), брой редове
 и брой колони в залата (цели числа), въведени от потребителя,
  и изчислява общите приходи от билети при пълна зала. Резултатът
   да се отпечата във формат като в примерите по-долу, с 2 знака след десетичната точка.  

вход	     изход                     
Premiere
10
12	       1440.00 leva

** */
import java.util.Scanner;
public class Cinema {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String movieScreening = scanner.nextLine();
		int numberRow = Integer.parseInt(scanner.nextLine());
		int numberColum = Integer.parseInt(scanner.nextLine());
		double priceAl = numberColum*numberRow;
		switch (movieScreening) {
		case "Premiere":
			System.out.printf(" %.2f leva", (priceAl*12.00));
			break;
		case "Normal":
			System.out.printf(" %.2f leva", (priceAl*7.50 ));
			break;
		case "Discount":
			System.out.printf(" %.2f leva", (priceAl*5.00 ));
			break; 
		}
	}
}

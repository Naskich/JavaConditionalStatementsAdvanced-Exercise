
/*2.Лятно облекло - Conditional Statements Advanced - Exercise -BASIC- JAVA
* Лято е с много променливо време и Виктор има нужда от вашата помощ.
*  Напишете програма която спрямо времето от денонощието и градусите 
*  да препоръча на Виктор какви дрехи да си облече. Вашия приятел има
*   различни планове за всеки етап от деня, които изискват и различен
*    външен вид, тях може да видите от таблицата.
*	От конзолата се четат точно два реда:
*	•	Градусите - цяло число в интервала [10…42]
*	•	Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"
*/
import java.util.Scanner;
public class SummerOutfitSecond {
		public static void main(String[] args) {
	        Scanner scanner = new  Scanner(System.in);
	        int degree = Integer.parseInt(scanner.nextLine());
	        String dayOfPart = scanner.nextLine();
	        double deg = 0.00;
			 deg = degree + deg;
	        if (10<=degree && degree<=18) {
				switch (dayOfPart) {
				case "Morning":
					System.out.printf("It's %.0f degrees, get your Sweatshirt and Sneakers.", deg);
					break;
				case "Afternoon": 
					System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", deg);
					break;
				case "Evening": 
					System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", deg);
					break;
				}
			}
	        if (18<degree && degree<=24) {
	        	switch (dayOfPart) {
				case "Morning":
					System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", deg);
					break;
				case "Afternoon":
					System.out.printf("It's %.0f degrees, get your T-Shirt and Sandals.", deg);
					break;
				case "Evening":
					System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", deg);
					break;
				}
			}
	        if (degree>=25 && degree<=42) {
	        	switch (dayOfPart) {
				case "Morning":
					System.out.printf("It's  %.0f degrees, get your T-Shirt and Sandals.", deg);
					break;
				case "Afternoon":
					System.out.printf("It's %.0f degrees, get your Swim Suit and Barefoot.", deg);
					break;
				case "Evening":
					System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", deg);
					break;
				}	
			}
		}
	}
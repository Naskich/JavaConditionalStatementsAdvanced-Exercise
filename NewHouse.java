
/*Марин и Нели си купуват къща не далеч от София.
Нели толкова много обича цветята, че Ви убеждава да
 напишете програма която да изчисли колко  ще им струва,
  да си засадят определен брой цветя и дали наличния бюджет ще им е 
  достатъчен. Различните цветя са с различни цени. 
цвете	Роза	Далия	Лале	Нарцис	Гладиола
Цена на брой в лева	5	3.80	2.80	3	2.50
Съществуват следните отстъпки:
•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
От конзолата се четат 3 реда:
•	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
•	Брой цветя - цяло число в интервала [10…1000]
•	Бюджет - цяло число в интервала [50…2500]
Да се отпечата на конзолата на един ред:
•	Ако бюджета им е достатъчен - 
"Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
•	Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
Сумата да бъде форматирана до втория знак след десетичната запетая.
*/
import java.util.Scanner;
public class NewHouse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nameFlower = scanner.nextLine();
		double lastSum;
		int numberFlowers = Integer.parseInt(scanner.nextLine());		
		if (9<numberFlowers && numberFlowers<1001) {
			int moneyForFlowers = Integer.parseInt(scanner.nextLine());
			if (49<moneyForFlowers && moneyForFlowers<2501) {	
				double sumDiscountRoses = numberFlowers*(5.00-(5.00*0.1)); 		    
				double sumDiscountDahlias = numberFlowers*(3.80-(3.80*0.15));       
				double sumDiscountTulips = numberFlowers*(2.80-(2.80*0.15));        
				double sumNotDiscountNarcissus = numberFlowers*(3.00+(3.00*0.15));  
				double sumNotDiscountGladiolus = numberFlowers*(2.50+(2.50*0.20));  
				double sumRoses = 5.00 * numberFlowers;
				double sumDahlias = 3.80 * numberFlowers;
				double sumTulips = 2.80 * numberFlowers;
				double sumNarcissus = 3.00 * numberFlowers;
				double sumGladiolus = 2.50 * numberFlowers;
				switch (nameFlower) {
				case "Roses":
					if (numberFlowers>80 && sumDiscountRoses<moneyForFlowers) {
							lastSum = moneyForFlowers-sumDiscountRoses;
							System.out.printf("Hey, you have a great garden with "+ numberFlowers +
									" Roses and %.2f leva left.", lastSum );
					}
					if (numberFlowers>80 && sumDiscountRoses==moneyForFlowers) {
						lastSum = moneyForFlowers-sumDiscountRoses;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Roses and %.2f leva left.", lastSum );
					}				
					if (numberFlowers>80 && sumDiscountRoses>moneyForFlowers) {
						lastSum = sumDiscountRoses - moneyForFlowers;
						System.out.printf("Not enough money, you need %.2f leva more.", lastSum );
					}
					if (numberFlowers<=80 && sumRoses<moneyForFlowers) {
							lastSum = moneyForFlowers-sumRoses;
							System.out.printf("Hey, you have a great garden with "+ numberFlowers +
									" Roses and %.2f leva left.", lastSum );
					}
					if (numberFlowers<=80 && sumRoses==moneyForFlowers) {
						lastSum = moneyForFlowers-sumRoses;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Roses and %.2f leva left.", lastSum );
					}
					if (numberFlowers<=80 && sumRoses>moneyForFlowers) {
							lastSum = sumRoses-moneyForFlowers;
							System.out.printf("Not enough money, you need %.2f leva more.", lastSum );
					}				
				break;
				case "Dahlias":
					if (numberFlowers>90 && sumDiscountDahlias<moneyForFlowers ) {
						lastSum = moneyForFlowers-sumDiscountDahlias;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Dahlias and %.2f leva left.", lastSum );
					}
					if (numberFlowers>90 && sumDiscountDahlias==moneyForFlowers ) {
						lastSum = moneyForFlowers-sumDiscountDahlias;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Dahlias and %.2f leva left.", lastSum );
					}
					if (numberFlowers>90 && sumDiscountDahlias>moneyForFlowers) {
					lastSum = sumDiscountDahlias - moneyForFlowers;
					System.out.printf("Not enough money, you need %.2f leva more.", lastSum );
					}
					if (numberFlowers<=90 && sumDahlias<moneyForFlowers) {
						lastSum = moneyForFlowers-sumDahlias;
						System.out.printf("Hey, you have a great garden with "
						+ numberFlowers +" Dahlias and %.2f leva left.", lastSum );
					}
					if (numberFlowers<=90 && sumDahlias==moneyForFlowers) {
						lastSum = moneyForFlowers-sumDahlias;
						System.out.printf("Hey, you have a great garden with "
						+ numberFlowers +" Dahlias and %.2f leva left.", lastSum );
					}
					if (numberFlowers<=90 && sumDahlias>moneyForFlowers) {
						lastSum = sumDahlias-moneyForFlowers;
						System.out.printf("Not enough money, you need %.2f leva more.", lastSum );
					}		
					break;					
					case "Tulips":
						if (numberFlowers>80 && sumDiscountTulips<moneyForFlowers) {
						lastSum = moneyForFlowers-sumDiscountTulips;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Tulips and %.2f leva left.", lastSum );
					}
						if (numberFlowers>80 && sumDiscountTulips==moneyForFlowers) {
						lastSum = moneyForFlowers-sumDiscountTulips;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Tulips and %.2f leva left.", lastSum );
					}						
					if (numberFlowers>80 && sumDiscountTulips>moneyForFlowers) {
					lastSum = sumDiscountTulips - moneyForFlowers;
					System.out.printf("Not enough money, you need %.2f leva more.", lastSum );
					}
					if (numberFlowers<=80 && sumTulips<moneyForFlowers) {
						lastSum = moneyForFlowers-sumTulips;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Tulips and %.2f leva left.", lastSum );
					}
					if (numberFlowers<=80 && sumTulips==moneyForFlowers) {
						lastSum = moneyForFlowers-sumTulips;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Tulips and %.2f leva left.", lastSum );
					}	
					if (numberFlowers<=80 && sumTulips>moneyForFlowers) {
						lastSum = sumTulips-moneyForFlowers;
						System.out.printf("Not enough money, you need %.2f leva more.", lastSum );
					}		
					break;
					case "Narcissus":
						if (numberFlowers>=120 && sumNarcissus<moneyForFlowers) {
						lastSum = moneyForFlowers-sumNarcissus;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Narcissus and %.2f leva left.", lastSum );
					}
						if (numberFlowers>=120 && sumNarcissus==moneyForFlowers) {
							lastSum = moneyForFlowers-sumNarcissus;
							System.out.printf("Hey, you have a great garden with "+ numberFlowers +
									" Narcissus and %.2f leva left.", lastSum );
						}				
					if (numberFlowers>=120 && sumNarcissus>moneyForFlowers) {
					lastSum = sumNarcissus - moneyForFlowers;
					System.out.printf("Not enough money, you need %.2f leva more.", lastSum );
					}
					if (numberFlowers<120 && sumNotDiscountNarcissus<moneyForFlowers) {
						lastSum = moneyForFlowers-sumNotDiscountNarcissus;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Narcissus and %.2f leva left.", lastSum );
					}
					if (numberFlowers<120 && sumNotDiscountNarcissus==moneyForFlowers) {
						lastSum = moneyForFlowers-sumNotDiscountNarcissus;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Narcissus and %.2f leva left.", lastSum );
					}			
					if (numberFlowers<120 && sumNotDiscountNarcissus>moneyForFlowers) {
						lastSum = sumNotDiscountNarcissus-moneyForFlowers;
						System.out.printf("Not enough money, you need %.2f leva more.", lastSum );
					}		
					break;
					case "Gladiolus":
						if (numberFlowers>=80 && sumGladiolus<moneyForFlowers) {
						lastSum = moneyForFlowers-sumGladiolus;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Gladiolus and %.2f leva left.", lastSum );
					}
						if (numberFlowers>=80 && sumGladiolus==moneyForFlowers) {
						lastSum = moneyForFlowers-sumGladiolus;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Gladiolus and %.2f leva left.", lastSum );
					}						
					if (numberFlowers>79 && sumGladiolus>moneyForFlowers) {
					lastSum = sumGladiolus - moneyForFlowers;
					System.out.printf("Not enough money, you need %.2f leva more.", lastSum );
					}
					if (numberFlowers<80 && sumNotDiscountGladiolus<moneyForFlowers) {
						lastSum = moneyForFlowers-sumNotDiscountGladiolus;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Gladiolus and %.2f leva left.", lastSum );
					}
					if (numberFlowers<80 && sumNotDiscountGladiolus==moneyForFlowers) {
						lastSum = moneyForFlowers-sumNotDiscountGladiolus;
						System.out.printf("Hey, you have a great garden with "+ numberFlowers +
								" Gladiolus and %.2f leva left.", lastSum );
					}					
					if (numberFlowers<80 && sumNotDiscountGladiolus>moneyForFlowers) {
						lastSum = sumNotDiscountGladiolus-moneyForFlowers;
						System.out.printf("Not enough money, you need %.2f leva more.", lastSum );
					}			
					break;	
					}				
			} else {
				System.out.printf("Invalid parameter! Please insert from 50 to 2500!");
				   }			
			} else {
				System.out.printf("Invalid parameter! Please insert from 10 to 1000!");
				   }
	}
}


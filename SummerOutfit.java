
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
	public class SummerOutfit {
		public static void main(String[] args) {
	        Scanner scanner = new  Scanner(System.in);
	        int degree = Integer.parseInt(scanner.nextLine());
	        String dayOfPart = scanner.nextLine();
	        if (10<=degree && degree<=18) {       	
			  if ("Morning".equals(dayOfPart)) {
				  System.out.printf("It's " + degree +" degrees, get your Sweatshirt and Sneakers.");			
			}
			  if ("Afternoon".equals(dayOfPart)) {
				  System.out.printf("It's " + degree +" degrees, get your Shirt and Moccasins.");
			}
			  if ("Evening".equals(dayOfPart)) {
				  System.out.printf("It's " + degree +" degrees, get your Shirt and Moccasins.");
			}
	        }
	        if (18<degree && degree<=24) {
	        	
	        	  if ("Morning".equals(dayOfPart)) {
	        		  System.out.printf("It's " + degree +" degrees, get your Shirt and Moccasins.");
	  			}
	  			  if ("Afternoon".equals(dayOfPart)) {
	  				 System.out.printf("It's " + degree +" degrees, get your T-Shirt and Sandals.");
	  			}
	  			  if ("Evening".equals(dayOfPart)) {
	  				 System.out.printf("It's " + degree +" degrees, get your Shirt and Moccasins.");	
	  			}
			}
	        if (degree>=25 && degree<=42) {
	        	  if ("Morning".equals(dayOfPart)) {
	        		  System.out.printf("It's " + degree +" degrees, get your T-Shirt and Sandals.");
		  			}
		  			  if ("Afternoon".equals(dayOfPart)) {
		  				 System.out.printf("It's " + degree +" degrees, get your Swim Suit and Barefoot.");
		  			}
		  			  if ("Evening".equals(dayOfPart)) {
		  				 System.out.printf("It's " + degree +" degrees, get your Shirt and Moccasins.");	
		  			}
	        }
	        
	    }
	}

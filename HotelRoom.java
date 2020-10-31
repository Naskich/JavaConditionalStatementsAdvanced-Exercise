
/*7.	Хотелска стая
Хотел предлага 2 вида стаи: студио и апартамент. Напишете програма, която изчислява цената за целия престой за студио и апартамент. Цените зависят от месеца на престоя:
Май и октомври	Юни и септември	Юли и август
Студио – 50 лв./нощувка	Студио – 75.20 лв./нощувка	Студио – 76 лв./нощувка
Апартамент – 65 лв./нощувка	Апартамент – 68.70 лв./нощувка	Апартамент – 77 лв./нощувка
Предлагат се и следните отстъпки:
•	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
•	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
•	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
•	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
Вход
Входът се чете от конзолата и съдържа точно 2 реда, въведени от потребителя:
•	На първия ред е месецът – May, June, July, August, September или October
•	На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
Изход
Да се отпечатат на конзолата 2 реда:
•	На първия ред: “Apartment: {цена за целият престой} lv.”
•	На втория ред: “Studio: {цена за целият престой} lv.“
Цената за целия престой форматирана с точност до два знака след десетичната запетая.
 * */
import java.util.Scanner;
public class HotelRoom {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String montsOfYear =  scanner.nextLine();
		int overnightHotel = Integer.parseInt(scanner.nextLine());
		double priceStudio;
		double priceApartment;
		double sumHotelStudio;
		double sumHotelApartment;
		double midleSum = 0.00;
		if (overnightHotel>-1 && overnightHotel<201) {					
		switch (montsOfYear) {		
		case "May":
			priceStudio = 50.00;
			priceApartment=65.00;
			midleSum = midleSum+overnightHotel;
			if (overnightHotel>7 && overnightHotel<15) {	
				sumHotelStudio= midleSum*(priceStudio-(priceStudio*0.05));
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);
				
			} 
			if (overnightHotel<=7) {
				sumHotelStudio= midleSum*priceStudio;
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);
			}
			if (overnightHotel>14) {
				sumHotelStudio= midleSum*(priceStudio-(priceStudio*0.30));
				sumHotelApartment= midleSum*(priceApartment-(priceApartment*0.1));
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio); 
			}			
			break;			
		case "June":
			priceStudio = 75.20;
			priceApartment=68.70;
			midleSum = midleSum+overnightHotel;
			if (overnightHotel>7 && overnightHotel<15) {	
				sumHotelStudio= midleSum*priceStudio;
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);
				
			} if (overnightHotel<=7) {
				sumHotelStudio= midleSum*priceStudio;
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);
			}
			if (overnightHotel>14) {
				sumHotelStudio= midleSum*(priceStudio-(priceStudio*0.20));
				sumHotelApartment= midleSum*(priceApartment-(priceApartment*0.1));
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio); 
			}				
			break;
		case "July":
			priceStudio = 76.00;
			priceApartment=77.00;
			midleSum = midleSum+overnightHotel;
			if (overnightHotel>7 && overnightHotel<=14) {	
				sumHotelStudio= midleSum*priceStudio;
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);				
			}
			if (overnightHotel<=7) {
				sumHotelStudio = midleSum*priceStudio;
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);
			}
			if (overnightHotel>14) {
				sumHotelStudio= midleSum*priceStudio;
				sumHotelApartment= midleSum*(priceApartment-(priceApartment*0.1));
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio); 
			}			
			break;
		case "August":
			priceStudio = 76.00;
			priceApartment=77.00;
			midleSum = midleSum+overnightHotel;
			if (overnightHotel>7 && overnightHotel<=14) {					
				sumHotelStudio= midleSum*priceStudio;
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);				
			}
			if (overnightHotel<=7) {
				sumHotelStudio = midleSum*priceStudio;
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);
			}
			if (overnightHotel>14) {
				sumHotelStudio= midleSum*priceStudio;
				sumHotelApartment= midleSum*(priceApartment-(priceApartment*0.1));
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio); 
			}	
			break;				
		case "September":
			priceStudio = 75.20;
			priceApartment=68.70;
			midleSum = midleSum+overnightHotel;
			if (overnightHotel>7 && overnightHotel<15) {	
				sumHotelStudio= midleSum*priceStudio;
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);				
			} 
			if (overnightHotel<=7) {
				sumHotelStudio = midleSum*priceStudio;
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);
			}
			if (overnightHotel>14) {
				sumHotelStudio= midleSum*(priceStudio-(priceStudio*0.20));
				sumHotelApartment= midleSum*(priceApartment-(priceApartment*0.1));
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio); 
			}	
			break;				
		case "October":
			priceStudio = 50.00;
			priceApartment=65.00;
			midleSum = midleSum+overnightHotel;
			if (overnightHotel>7 && overnightHotel<15) {			
				sumHotelStudio= midleSum*(priceStudio-(priceStudio*0.05));
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);				
			} 
			if (overnightHotel<=7) {
				sumHotelStudio = midleSum*priceStudio;
				sumHotelApartment = midleSum*priceApartment;
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio);
			}
			if (overnightHotel>14) {
				sumHotelStudio= midleSum*(priceStudio-(priceStudio*0.30));
				sumHotelApartment= midleSum*(priceApartment-(priceApartment*0.1));
				System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",sumHotelApartment,sumHotelStudio); 
			}	
			break;			
		default:
			System.out.print("Invalid monts!");
			break;
			}
		} else {
			System.out.print("Invalid parameter!");
		}
	}
}

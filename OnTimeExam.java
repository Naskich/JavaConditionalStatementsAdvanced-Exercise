
/*8.	Навреме за изпит
Студент трябва да отиде на изпит в определен час. Той идва в изпитната зала в даден час на пристигане. Счита се, че студентът е дошъл навреме, ако е пристигнал в часа на изпита или до половин час преди това. Ако е пристигнал по-рано повече от 30 минути, той е подранил. Ако е дошъл след часа на изпита, той е закъснял. Напишете програма, която прочита време на изпит и време на пристигане и отпечатва дали студентът е дошъл навреме, дали е подранил или е закъснял и с колко часа или минути е подранил или закъснял.

Вход
От конзолата се четат 4 цели числа (по едно на ред), въведени от потребителя:
•	Първият ред съдържа час на изпита – цяло число от 0 до 23.
•	Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
•	Третият ред съдържа час на пристигане – цяло число от 0 до 23.
•	Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.
Изход
На първият ред отпечатайте:
•	“Late”, ако студентът пристига по-късно от часа на изпита.
•	“On time”, ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
•	“Early”, ако студентът пристига повече от 30 минути преди часа на изпита.
Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:
•	“mm minutes before the start” за идване по-рано с по-малко от час.
•	“hh:mm hours before the start” за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например “1:05”.
•	 “mm minutes after the start” за закъснение под час.
•	“hh:mm hours after the start” за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например “1:03”.
Примерен вход и изход
Вход	Изход		Вход	Изход		Вход	Изход
9
30
9
50	Late
20 minutes after the start		9
00
10
30	Late
1:30 hours after the start		10
00
10
00	On time
9
00
8
30	On time
30 minutes before the start		14
00
13
55	On time
5 minutes before the start		11
30
10
55	Early
35 minutes before the start
16
00
15
00	Early
1:00 hours before the start		11
30
8
12	Early
3:18 hours before the start		11
30
12
29	Late
59 minutes after the start
 * */
import java.util.Scanner;
public class OnTimeExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hourExmap = Integer.parseInt(scanner.nextLine());
		if (hourExmap>=0 && hourExmap<=23) {
			int minuteExamp = Integer.parseInt(scanner.nextLine());
			if (minuteExamp>=0 && minuteExamp<=59) {
				int hourArrive = Integer.parseInt(scanner.nextLine());
				if (hourArrive>=0 && hourArrive<=23) {
					int minuteArrive = Integer.parseInt(scanner.nextLine());
					if (minuteArrive>=0 && minuteArrive<=59) {
						int timeHour=0;
						int timeMinute=0;
						//-------------------Early--On-Time---------------------
					if (hourExmap>hourArrive) {
						timeHour=hourExmap-hourArrive;
						if (timeHour<1) {
							if (minuteExamp>minuteArrive) {
								timeMinute=minuteExamp-minuteArrive;				
								    if (timeMinute>30) {
										System.out.println("Early "+timeMinute+" minutes before the start");
								} else {
									System.out.println("On time "+timeMinute+" minutes before the start");
								}
							} else if (minuteExamp==minuteArrive) {
								timeMinute=minuteExamp-minuteArrive;
								System.out.println("Early "+timeMinute+" hours before the start");
							}				
						} else {
							if (minuteExamp>minuteArrive) {
								timeMinute=minuteExamp-minuteArrive;
								    if (timeMinute>30) {
										System.out.println("Early "+timeHour+":"+timeMinute+" hours before the start");
								} else {
									System.out.println("Early "+timeHour+":"+timeMinute+" hours before the start");
								}
							} else if (minuteArrive==minuteExamp) {
								timeHour=hourExmap-hourArrive;
								timeMinute=minuteExamp-minuteArrive;
								System.out.println("Early "+timeHour+":"+timeMinute+"0 hours before the start");			
							} else if (minuteArrive>minuteExamp) {
							 hourExmap=hourExmap-hourArrive;
							 timeHour = (hourExmap*60)+minuteExamp;
							timeMinute=timeHour-minuteArrive;
							if (timeMinute<=30) {
								System.out.println("On time "+timeMinute+" minutes before the start");
							} else {
								System.out.println("Early "+timeMinute+" minutes before the start");
							}												
							}	
						}					
					}
					//-------------------On Time------------------------
					if (hourExmap==hourArrive) {
						if (minuteExamp==minuteArrive) {
							System.out.println("On time");
						}
						if (minuteExamp>minuteArrive) {
							timeMinute=minuteExamp-minuteArrive;
							    if (timeMinute>30) {
									System.out.println("Early "+timeMinute+" minutes before the start");
							} else {
								System.out.println("On Time "+timeMinute+" minutes before the start");
							}
						}
						if (minuteArrive>minuteExamp) {
							timeMinute=minuteArrive-minuteExamp;
							System.out.println("Late "+timeMinute+" minutes after the start");
						}
					}
					//-------------------Late------------------------
					if (hourExmap<hourArrive) {
						 hourArrive=hourArrive-hourExmap;	
						if (minuteExamp<minuteArrive) {
							timeMinute=minuteArrive-minuteExamp;
							System.out.println("Late "+hourArrive+":"+timeMinute+" hours after the start");
						} else if (minuteExamp>minuteArrive) {
							if (hourArrive>1) {
								if (minuteArrive<1) {
									timeHour=hourArrive-hourExmap;
									timeMinute=(minuteArrive+60)-minuteExamp;
									System.out.println("Late "+timeHour+":"+timeMinute+" hours after the start");						
								}					
							} else {
							       timeHour = (hourArrive*60)+minuteArrive;
									timeMinute=timeHour-minuteExamp;
									System.out.println("Late "+timeMinute+" minutes after the start");	
							}
						} else if (minuteExamp==minuteArrive) {
							minuteExamp=minuteExamp-minuteArrive;
							System.out.println("Late "+hourArrive+":"+minuteExamp+"0 minutes after the start");						
						} 
					}
					} else {
						System.out.println("Invalid minute!");
					}
				} else {
					System.out.println("Invalid hour!");
				}
			} else {
				System.out.println("Invalid minute!");
			}
		} else {
			System.out.println("Invalid hour!");
		}
	}
}

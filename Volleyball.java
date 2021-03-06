
/*9.	*Волейбол - 60 point from 100
Влади е студент, живее в София и си ходи от време на време до родния град. Той е много запален
 по волейбола, но е зает през работните дни и играе волейбол само през уикендите и в празничните
  дни. Влади играе в София всяка събота, когато не е на работа и не си пътува до родния град,
   както и в 2/3 от празничните дни. Той пътува до родния си град h пъти в годината, където играе
    волейбол със старите си приятели в неделя. Влади не е на работа 3/4 от уикендите, в които е в
     София. Отделно, през високосните години Влади играе с 15% повече волейбол от нормалното.
      Приемаме, че годината има точно 48 уикенда, подходящи за волейбол.
Напишете програма, която изчислява колко пъти Влади е играл волейбол през годината. Закръглете
резултата надолу до най-близкото цяло число (например 2.15  2; 9.95  9).
Входните данни се въвеждат от потребителя, в следния вид: 
•	Първият ред съдържа думата "leap" (високосна година) или "normal" (невисокосна).
•	Вторият ред съдържа цялото число p – брой празници в годината (които не са събота и неделя).
•	Третият ред съдържа цялото число h – брой уикенди, в които Влади си пътува до родния град.
Примерен вход и изход
вход	изход	Коментари
leap
5
2	45	48 уикенда в годината, разделени по следния начин:
•	46 уикенда в София  46 * 3 / 4  34.5 съботни игри в София
•	2 уикенда в родния си град  2 недели  2 игри в неделя в родния град
5 празника:
•	5 * 2/3  3.333 игри в София в празничен ден
Общо игри през уикенди и празници в София и в родния град: 34.5 + 2 + 3.333  39.833
Годината е високосна:
•	Влади играе допълнителни 15% * 39.833  5.975 игри волейбол
Общо игри през цялата година:
•	39.833 + 5.975 = 45.808 игри
•	Резултатът е 45 (закръгля се надолу)

вход	изход		вход	изход		вход	изход		вход	изход		вход	изход
normal
3
2	38		leap
2
3	43		normal
11
6	44		leap
0
1	41		normal
6
13	43

Насоки
•	Пресметнете уикендите в София (48 минус уикендите в родния град). Пресметнете броя игри
 в уикендите в София: умножете уикендите в София с (3.0 / 4). Обърнете внимание, че трябва да
  се използва дробно деление (3.0 / 4), а не целочислено (3 / 4).
•	Пресметнете броя игри в родния град. Те са точно колкото са пътуванията до родния град.
•	Пресметнете броя игри в празничен ден. Те са броя празници умножени по (2.0 / 3).
•	Сумирайте броя на всички игри. Той е дробно число. Не бързайте да закръгляте още.
•	Ако годината е високосна, добавете 15% към общия брой игри.
•	Накрая закръглете надолу до най-близкото цяло число.

 * */
import java.util.Scanner;
public class Volleyball {
	public static void main(String[] args) {
	 Scanner scanner =  new Scanner(System.in);
	 String tipeYear = scanner.nextLine();
	 int p = Integer.parseInt(scanner.nextLine());
	 int h = Integer.parseInt(scanner.nextLine());
	 int weekendSofia=0;
	 double weekendCapital=0;
	 double playWeekend =0;
	 double allPlayWekends=0;
	 double extraPLay = 0;
	 if (tipeYear.equals("leap")|| tipeYear.equals("normal")) {
		 if (p<360||h<360) {
			 if (tipeYear.equals("leap")) {
			weekendSofia = 48-h;
			weekendCapital=(weekendSofia*3.0)/4;
			playWeekend = p*2/3;
			allPlayWekends = playWeekend + h + weekendCapital;
			extraPLay = allPlayWekends+(0.15*allPlayWekends);
			System.out.printf("%.0f",extraPLay);
			}			 
			 if ( tipeYear.equals("normal")) {
					weekendSofia = 40-h;
					weekendCapital=(weekendSofia*3.0)/4;
					playWeekend = p*2/3;
					allPlayWekends = playWeekend + h + weekendCapital;
					extraPLay = allPlayWekends+(0.15*allPlayWekends);
					System.out.printf("%.0f",extraPLay);
					}	 
		} else {
			System.out.println("Ivalid parameter!");
		}	 
	 	} else {
			System.out.println("Invalid string! Pleas leap or normal!");
		} 
	}
}

import java.util.Scanner;
public class OperationsBetweenNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double N1 = Double.parseDouble(scanner.nextLine());
		if (N1>=0 && N1<40000) {
			double N2 = Double.parseDouble(scanner.nextLine());
			if (N2>=0 && N2<40000) {
				String simbolOperation = scanner.nextLine();
				double sumNumber;
				switch (simbolOperation) {
				case "+":
					sumNumber = N1 + N2;
					if (sumNumber%2==0) {
						System.out.printf("%.0f + %.0f = %.0f - even",N1,N2,sumNumber);
					} else {
						System.out.printf("%.0f + %.0f = %.0f - odd",N1,N2,sumNumber);
					}	
					break;
				case "-":
					sumNumber = N1 - N2;
					if (sumNumber%2==0) {
						System.out.printf(" %.0f - %.0f = %.0f - even",N1,N2,sumNumber);
					} else {
						System.out.printf(" %.0f - %.0f = %.0f - odd",N1,N2,sumNumber);
					}						
					break;
				case "*":
					sumNumber = N1 * N2;
					if (sumNumber%2==0) {
						System.out.printf(" %.0f * %.0f = %.0f - even",N1,N2,sumNumber);
					} else {
						System.out.printf(" %.0f * %.0f = %.0f - odd",N1,N2,sumNumber);
					}		
					break;
				case "/":
					sumNumber = N1/N2;
					if (N1==0 || N2==0) {
						if (N1==0) {
							System.out.printf("Cannot divide %.0f by zero",N2);
						} else {
							System.out.printf("Cannot divide %.0f by zero",N1);
						}
					} else {
						System.out.printf(" %.0f / %.0f = %.2f ",N1,N2,sumNumber);
					}
					break;					
				case "%":				
					sumNumber = N1 % N2;
					if (N1==0 || N2==0) {
						if (N1==0) {
							System.out.printf("Cannot divide %.0f by zero ",N2);
						} else {
							System.out.printf("Cannot divide %.0f by zero ",N1);
						}
					} else {
						int value1 = (int)N1;
						int value2 = (int)N2;
						int sumLastValue;
						sumLastValue = value1 % value2;
						System.out.println(value1+" % "+value2 + " = "+ sumLastValue);
					}					
					break;		
				}
			}	
		}		
	}
}


/* 4.	Лодка за риболов
Тони и приятели много обичали да ходят за риба, те са толкова
 запалени по риболова, че решават да отидат на риболов с кораб.
  Цената за наема на кораба зависи от сезона и броя рибари.
Цената зависи от сезона:
•	Цената за наем на кораба през пролетта е  3000 лв.
•	Цената за наем на кораба през лятото и есента е  4200 лв.
•	Цената за наем на кораба през зимата е  2600 лв.
В зависимост от броя си групата ползва отстъпка:
•	Ако групата е до 6 човека включително  –  отстъпка от 10%.
•	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
•	Ако групата е от 12 нагоре  –  отстъпка от 25%. 
Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - 
тогава нямат допълнителна отстъпка. 
Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари. 
Вход
От конзолата се четат точно три реда.
•	Бюджет на групата – цяло число в интервала [1…8000]
•	Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
•	Брой рибари – цяло число в интервала [4…18]
Изход
Да се отпечата на конзолата един ред:
•	Ако бюджетът е достатъчен:
"Yes! You have {останалите пари} leva left."
•	Ако бюджетът НЕ Е достатъчен:
"Not enough money! You need {сумата, която не достига} leva."
Сумите трябва да са форматирани с точност до два знака след десетичната запетая.

 * */
import java.util.Scanner;
public abstract class FishingBoat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int budgetOfGroupe = Integer.parseInt(scanner.nextLine());
		 String seаsonOfYear = scanner.nextLine();
		int numberFisherman = Integer.parseInt(scanner.nextLine());
		double priceShip;
		double discountShip;
		double sumAll;
		if (budgetOfGroupe>0 && budgetOfGroupe<8001) {
			if (numberFisherman>3 && numberFisherman<19) {
			switch (seаsonOfYear) {
			case "Spring":
				priceShip=3000;
				if (numberFisherman<=6) {
					if (numberFisherman%2==0) {
				discountShip=(priceShip-(0.1*priceShip))-((priceShip-(0.1*priceShip))*0.05);
					if (discountShip<budgetOfGroupe|| discountShip==budgetOfGroupe) {
						sumAll=budgetOfGroupe-discountShip;
						System.out.printf("Yes! You have %.2f leva left.",sumAll);
					} else {
						sumAll = discountShip-budgetOfGroupe;
						System.out.printf("Not enough money! You need %.2f leva.",sumAll);
					}	
					} else {
						discountShip=priceShip-(0.1*priceShip);
						if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
							sumAll=budgetOfGroupe-discountShip;
						System.out.printf("Yes! You have %.2f leva left.",sumAll);
						} else {
						 sumAll = discountShip-budgetOfGroupe;
						 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
						}						
					}
				}
				if (numberFisherman>6 && numberFisherman<=11) {
					if (numberFisherman%2==0) {
						discountShip=(priceShip-(0.15*priceShip))-((priceShip-(0.15*priceShip))*0.05);
							if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
								sumAll=budgetOfGroupe-discountShip;
								System.out.printf("Yes! You have %.2f leva left.",sumAll);
							} else {
								sumAll = discountShip-budgetOfGroupe;
								System.out.printf("Not enough money! You need %.2f leva.",sumAll);
							}	
							} else {
								discountShip=priceShip-(0.15*priceShip);
								if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
									sumAll=budgetOfGroupe-discountShip;
								System.out.printf("Yes! You have %.2f leva left.",sumAll);
								} else {
								 sumAll = discountShip-budgetOfGroupe;
								 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
								}						
							}
						}
				if (numberFisherman>11) {
					if (numberFisherman%2==0) {
						discountShip=(priceShip-(0.25*priceShip))-((priceShip-(0.25*priceShip))*0.05);
							if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
								sumAll=budgetOfGroupe-discountShip;
								System.out.printf("Yes! You have %.2f leva left.",sumAll);
							} else {
								sumAll = discountShip-budgetOfGroupe;
								System.out.printf("Not enough money! You need %.2f leva.",sumAll);
							}	
							} else {
								discountShip=priceShip-(0.25*priceShip);
								if (discountShip<budgetOfGroupe) {
									sumAll=budgetOfGroupe-discountShip;
								System.out.printf("Yes! You have %.2f leva left.",sumAll);
								} else {
								 sumAll = discountShip-budgetOfGroupe;
								 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
								}						
							}
						}
						break;	
							case "Summer":
								priceShip=4200;
								if (numberFisherman<=6) {
									if (numberFisherman%2==0) {
								discountShip=(priceShip-(0.1*priceShip))-((priceShip-(0.1*priceShip))*0.05);
									if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe ) {
										sumAll=budgetOfGroupe-discountShip;
										System.out.printf("Yes! You have %.2f leva left.",sumAll);
									} else {
										sumAll = discountShip-budgetOfGroupe;
										System.out.printf("Not enough money! You need %.2f leva.",sumAll);
									}	
									} else {
										discountShip=priceShip-(0.1*priceShip);
										if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
											sumAll=budgetOfGroupe-discountShip;
										System.out.printf("Yes! You have %.2f leva left.",sumAll);
										} else {
										 sumAll = discountShip-budgetOfGroupe;
										 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
										}						
									}
								}
								if (numberFisherman>6 && numberFisherman<=11 ) {
									if (numberFisherman%2==0) {
										discountShip=(priceShip-(0.15*priceShip))-((priceShip-(0.15*priceShip))*0.05);
											if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe ) {
												sumAll=budgetOfGroupe-discountShip;
												System.out.printf("Yes! You have %.2f leva left.",sumAll);
											} else {
												sumAll = discountShip-budgetOfGroupe;
												System.out.printf("Not enough money! You need %.2f leva.",sumAll);
											}	
											} else {
												discountShip=priceShip-(0.15*priceShip);
												if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
													sumAll=budgetOfGroupe-discountShip;
												System.out.printf("Yes! You have %.2f leva left.",sumAll);
												} else {
												 sumAll = discountShip-budgetOfGroupe;
												 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
												}						
											}
										}
								if (numberFisherman>11) {
									if (numberFisherman%2==0) {
										discountShip=(priceShip-(0.25*priceShip))-((priceShip-(0.25*priceShip))*0.05);
											if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
												sumAll=budgetOfGroupe-discountShip;
												System.out.printf("Yes! You have %.2f leva left.",sumAll);
											} else {
												sumAll = discountShip-budgetOfGroupe;
												System.out.printf("Not enough money! You need %.2f leva.",sumAll);
											}	
											} else {
												discountShip=priceShip-(0.25*priceShip);
												if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
													sumAll=budgetOfGroupe-discountShip;
												System.out.printf("Yes! You have %.2f leva left.",sumAll);
												} else {
												 sumAll = discountShip-budgetOfGroupe;
												 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
												}						
											}
										}
								  break;			
								      case "Autumn":
							    	  priceShip=4200;
											if (numberFisherman<=6) {
													discountShip=priceShip-(0.1*priceShip);
													if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
														sumAll=budgetOfGroupe-discountShip;
													System.out.printf("Yes! You have %.2f leva left.",sumAll);
													} else {
													 sumAll = discountShip-budgetOfGroupe;
													 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
													}						
											}
											if (numberFisherman>6 && numberFisherman<=11) {
															discountShip=priceShip-(0.15*priceShip);
															if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
																sumAll=budgetOfGroupe-discountShip;
															System.out.printf("Yes! You have %.2f leva left.",sumAll);
															} else {
															 sumAll = discountShip-budgetOfGroupe;
															 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
															}						
													}
											if (numberFisherman>11) {
															discountShip=priceShip-(0.25*priceShip);
															if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
																sumAll=budgetOfGroupe-discountShip;
															System.out.printf("Yes! You have %.2f leva left.",sumAll);
															} else {
															 sumAll = discountShip-budgetOfGroupe;
															 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
															}						
														}	  
												break;							
								      case "Winter":
								    	  priceShip=2600;
											if (numberFisherman<=6) {
												if (numberFisherman%2==0) {
											discountShip=(priceShip-(0.1*priceShip))-((priceShip-(0.1*priceShip))*0.05);
												if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
													sumAll=budgetOfGroupe-discountShip;
													System.out.printf("Yes! You have %.2f leva left.",sumAll);
												} else {
													sumAll = discountShip-budgetOfGroupe;
													System.out.printf("Not enough money! You need %.2f leva.",sumAll);
												}	
												} else {
													discountShip=priceShip-(0.1*priceShip);
													if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
														sumAll=budgetOfGroupe-discountShip;
													System.out.printf("Yes! You have %.2f leva left.",sumAll);
													} else {
													 sumAll = discountShip-budgetOfGroupe;
													 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
													}						
												}
											}
											if (numberFisherman>6 && numberFisherman<=11 ) {
												if (numberFisherman%2==0) {
													discountShip=(priceShip-(0.15*priceShip))-((priceShip-(0.15*priceShip))*0.05);
														if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
															sumAll=budgetOfGroupe-discountShip;
															System.out.printf("Yes! You have %.2f leva left.",sumAll);
														} else {
															sumAll = discountShip-budgetOfGroupe;
															System.out.printf("Not enough money! You need %.2f leva.",sumAll);
														}	
														} else {
															discountShip=priceShip-(0.15*priceShip);
															if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
																sumAll=budgetOfGroupe-discountShip;
															System.out.printf("Yes! You have %.2f leva left.",sumAll);
															} else {
															 sumAll = discountShip-budgetOfGroupe;
															 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
															}						
														}
													}
											if (numberFisherman>11) {
												if (numberFisherman%2==0) {
													discountShip=(priceShip-(0.25*priceShip))-((priceShip-(0.25*priceShip))*0.05);
														if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
															sumAll=budgetOfGroupe-discountShip;
															System.out.printf("Yes! You have %.2f leva left.",sumAll);
														} else {
															sumAll = discountShip-budgetOfGroupe;
															System.out.printf("Not enough money! You need %.2f leva.",sumAll);
														}	
														} else {
															discountShip=priceShip-(0.25*priceShip);
															if (discountShip<budgetOfGroupe || discountShip==budgetOfGroupe) {
																sumAll=budgetOfGroupe-discountShip;
															System.out.printf("Yes! You have %.2f leva left.",sumAll);
															} else {
															 sumAll = discountShip-budgetOfGroupe;
															 System.out.printf("Not enough money! You need %.2f leva.",sumAll);
															}						
														}
													}	  
								    break;
				}
			}
		}
	}

}

package me.wky.Application;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual é o seu nome?");
		String heroName = scanner.next();

		int heroAge = 1;
		do {
			System.out.println("Qual sua idade?");
			heroAge = scanner.nextInt();
		} while (heroAge < 1);

		int heroType = 0;
		do {
			System.out.println("""
				Que tipo de herói você é?
				1 - Guerreiro
				2 - Mago
				3 - Monge
				4 - Ninja""");
			heroType = scanner.nextInt();
		} while (heroType != 1 && heroType != 2 && heroType != 3 && heroType != 4);

		Hero hero = new Hero(heroName, heroAge, heroType);
		hero.attack();
	}
}

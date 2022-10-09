//You are given an array A consisting of N positive integers. Each integer represents the number of players from a country, for a total of N countries. Find the maximum number of teams that can be formed by forming teams of size K such that each player in the team is from a different country.

package com.gl.lab;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of countries:");
		int country = sc.nextInt();
		System.out.println("Enter number of players in each country:");
		int[] players = new int[country];
		for (int i = 0; i < country; i++) {
			players[i] = sc.nextInt();
		}
		System.out.println("Enter the size of each team:");
		int teamSize = sc.nextInt();
		sc.close();

		Arrays.sort(players);
		int i = 0, noTeams = 0;

		System.out.println(Arrays.toString(players) + " : 0");
		System.out.println();

		while (players[country - teamSize] > 0) {

			while (players[i] > 0) {
				int temp = i + teamSize;
				for (int j = i; j < temp; j++) {
					players[j] -= 1;
				}
				noTeams++;
				System.out.println(Arrays.toString(players) + " : " + noTeams);
			}
			i++;
		}

		System.out.println("Total Number teams: " + noTeams);

	}

}

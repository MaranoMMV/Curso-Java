package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Eleicao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<Eleicao, Integer> eleicao = new HashMap<>();
			String line = br.readLine();
			while (line != null) {
				System.out.println(eleicao.containsKey(eleicao));
			}
			System.out.println("Total users: " + eleicao.size());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

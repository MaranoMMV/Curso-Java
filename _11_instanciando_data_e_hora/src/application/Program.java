package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022");
		
		System.out.println("D01 = "+ d01.toString());
		System.out.println("D02 = " + d02.toString());
		System.out.println("D03 = " +d03.toString());
		System.out.println("D04 = " + d04.toString());
		System.out.println("D05 = " + d05.toString());
		System.out.println("D06 = " + d06.toString());
		System.out.println("D07 = " + d07.toString());
		System.out.println("D08 = " + d08.toString());
	}

}

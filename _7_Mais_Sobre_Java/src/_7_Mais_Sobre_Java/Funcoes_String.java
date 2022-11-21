package _7_Mais_Sobre_Java;

public class Funcoes_String {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace('abc', 'xy');
		
		System.out.println("Original: -" + original + " - ");
		System.out.println("To Lower Case: -" + s01 + " - ");
		System.out.println("To Upper Case: -" + s02 + " - ");
		System.out.println("To Trim: -" + s03 + "-");
		System.out.println("Substring(2): -" +s04 + "-");
		System.out.println("Substrings(2, 9): -" +s05 + "-");
		System.out.println("Replace('a', 'x'): -" +s06 + "-");
		System.out.println("Replace('abc', 'xy'): -" +s07 + "-");
	}

}

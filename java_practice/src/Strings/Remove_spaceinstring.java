package Strings;

public class Remove_spaceinstring {
		public static void main(String[] args) {
			String s = "hi   hello    how are     you";
			System.out.println(s);
			System.out.print(s.replaceAll(" +"," "));
		}

	}


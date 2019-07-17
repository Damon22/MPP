package Lab8_4;

import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(final String[] args) {
		Good good = new Good();

		System.out.println(String.format("Friends with names that start"
				+ " with 'N': "+ good.findStartsWithLetter(Folks.friends, "N")));

		System.out.println(String.format("Editors with names that start"
				+ " with 'N'", good.findStartsWithLetter(Folks.editors, "N")));
		
		System.out.println(String.format("Friends with names that has"
				+ " with 'a' does not has 't' count: "+ good.countWords(Folks.friends, 'a', 't', 4)));

		System.out.println(String.format("Editors with names that has"
				+ " with 'J' does not has 'i' count: "+ good.countWords(Folks.editors, 'J', 'i', 4)));
	}

	public List<String> findStartsWithLetter(List<String> list, String letter) {
		return 
				list.stream()   //convert list to stream
				.filter(name -> name.startsWith(letter)) //returns filtered stream, lexical scoping
				.map(name -> name.toUpperCase())  //maps each string to upper case string
				.collect(Collectors.toList()); //organizes into a list		
	}


	public int countWords(List<String> words, char c, char d, int len) {
		return
				words.stream()
				.filter(str -> str.length() == len)
				.filter(str -> str.contains(String.valueOf(c)))
				.filter(str -> !str.contains(String.valueOf(d)))
				.collect(Collectors.toList()).size();
	}
}

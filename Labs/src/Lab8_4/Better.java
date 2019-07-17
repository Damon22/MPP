package Lab8_4;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Even more functional approach -- count number of elements 
//using a pure expression -- no auxiliary function calls
//All assignments are atomic.
public class Better {
	final Function<String, Predicate<String>> startsWithLetter 
    	= letter -> name -> name.startsWith(letter);
    	
    final Function<String, Predicate<String>> containsLetter 
    	= letter -> str -> str.contains(String.valueOf(letter)); 
    	
    final Function<String, Predicate<String>> notContainsLetter 
    	= letter -> str -> !str.contains(String.valueOf(letter)); 

    final Integer countFriendsWords = Folks.friends.stream()
    		.filter(str->str.length() == 4)
    		.filter(str -> str.contains(String.valueOf("a")))
    		.filter(str -> !str.contains(String.valueOf("t")))
    		.collect(Collectors.toList()).size();
    		
    	
	final List<String> friendsStartN = Folks.friends.stream()
			.filter(startsWithLetter.apply("N"))
			.map(friend -> friend.toUpperCase())
			.collect(Collectors.toList());
	
	final List<String>  friendsStartB = Folks.friends.stream()
			.filter(startsWithLetter.apply("B"))
			.map(friend -> friend.toUpperCase())
			.collect(Collectors.toList());
	
	public static void main(String[] args) {
		Better b = new Better();

		System.out.println("Friends with names that start"
				+ " with 'N': " + b.friendsStartN);
		System.out.println("Friends with names that start"
				+ " with 'B': " + b.friendsStartB);
		System.out.println(String.format("Friends with names that has"
				+ " with 'a' does not has 't' count: "+ b.countFriendsWords));

	}
}

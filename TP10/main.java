    
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		var list = List.of("hello", "world", "hello", "lambda");
		System.out.println(count(list, "hello"));  // 2
		System.out.println(count2(list, "hello"));  // 2
		System.out.println(countV3(list, "hello"));  // 2
		System.out.println(upperCase(list));
		System.out.println(upperCase4(list));
	}
	
	static private long count(List<String> l, String s) {
		long cpt = 0;
		for (String string : l) {
			if (string.equals(s)) {
				cpt++;
			}
		}
		return cpt;
	}
	
	static private long count2(List<String> l, String s) {
	    return l.stream().filter(str -> s.equals(str)).count();
	}
	
	static private List<String> upperCase(List<String> l) {
		List<String> newList = new ArrayList<String>();
		for (String string : l) {
			newList.add(string.toUpperCase());
		}
		return newList;
	}
	
	static private List<String> upperCase4(List<String> l) {
		return l.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
	}

	static private long countV3(List<String> l, String s) {
	    return l.stream().filter(str -> s.equals(str)).mapToLong(str -> 1).count();
	}

}


/*
Exercice 1 : 
1. fait sur le code.
2. on obtient un stream à partir d'un objet de type list en ajoutant .stream (selon la doc de java)
la méthode filter et la méthode count

Exercice 2 : 
1. fait sur le code.
2. fait sur le code.
3. fait sur le code.
4. fait sur le code.

Exercice 3:
1. on utilise la méthode mapToLong() pour qu'elle nous retourne un LongStream.
2. fait sur le code.

Exercice 4:
1.
 */
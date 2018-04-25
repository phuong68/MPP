package Lesson9II_5;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<String> intSt = Stream.of("1","2","3","4","5","6","7","8","9");
		
		 Main.streamSection(intSt, 3, 6).forEach(System.out::println);

	}
	
	public static Stream<String> streamSection(Stream<String> stream, int m, int n){
		return 	stream.limit(n).skip(m-1);
		
	}

}

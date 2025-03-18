package week4;

public class StringManupulation {
	   	public static void main (String[] args) {
		      String college = new String("Leeds Beckett University"); // Given

		      String town = "Anytown, UK"; // part (a)

		      int stringLength = college.length(); // part (b)

		      System.out.println(college + " contains " + stringLength + " characters.");

		      String change1 = college.toUpperCase(); // part (c)

		      String change2 = change1.replace('E', '*'); // part (d)

		      String change3 = college.concat(" " + town); // part (e) (Added space for clarity)

		      System.out.println("Uppercase version: " + change1);
		      System.out.println("Replaced 'E' with '*': " + change2);
		      System.out.println("Concatenated string: " + change3);
		}
}

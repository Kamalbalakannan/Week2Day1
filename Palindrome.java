package Secondweek.day1;

public class Palindrome {

	public static void main(String[] args) {
		String name = "level", reverse = "";
		System.out.println("Given name : "+name);

		for (int i = name.length()-1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println("Reversed String : "+reverse);
		
		if(name.equals(reverse)) {
			System.out.println("This name is Palindrome");
		}else {
			System.out.println("This name is not Palindrome");

}
}
}

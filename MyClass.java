import java.util.Scanner;

public class MyClass{
  public static void main(String[] Args){
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    char max='u';
    for(int i=0;i<input.length();i++){
      if(input.charAt(i)<max){
        if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o'){
        max=input.charAt(i);
      	}
      }
    }
    System.out.println(max);
  }
}

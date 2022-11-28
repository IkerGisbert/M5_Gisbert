/*Donats dos números enters, dir si estan ordenats*/
import java.util.Scanner;
public class GisbertOrdenats {
 public static void main(String[] args) {
     Scanner num = new Scanner(System.in);
 
     int num1 = num.nextInt();
     int num2 = num.nextInt();
    
     if(num1<=num2){
       System.out.println(true);
     }
 
     else{
       System.out.println(false);
     }
 }
}
 
https://www.freecodecamp.org/espanol/news/como-hacer-tu-primer-pull-request-en-github/
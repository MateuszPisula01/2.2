import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     int liczba = 0;
 System.out.print("Liczby nieparzyste do 100: ");
 for(int i = 1;i<=100;i++)
 {
 if(liczba%2==1){
 System.out.print(liczba+", ");
}
 liczba++;
  }
}
}
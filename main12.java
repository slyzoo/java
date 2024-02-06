public class main12 {
     public static void main(String[] args) {

//          logical operators are used to connect two or more expressions
//
//          AND sign (both conditions must be true) = &&
//          OR sign (either condition must be true) = ||
//          NOT sign (reverses the boo condition) = !

         int temp = 25;

         if(temp > 30) {
            System.out.println("it is hot outside");
         }
         else if (temp >= 20 && temp <= 30){
             System.out.println("it is warm out");
         }
         else {
             System.out.println("it is cold outside");
         }

     }
}

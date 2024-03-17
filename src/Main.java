import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int math , eng;
//
//        System.out.println("enter math mark");
//         math = scanner.nextInt();
//
//        System.out.println("enter eng mark");
//         eng = scanner.nextInt();
//
//        if( math >= 40 && eng >= 40 ){
//            System.out.println("pass");
//        }else{
//            System.out.println("fail");
//        }
        String str = "hello";

//       if(str.equals("hello")){
//           System.out.println(str);
//       }

//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <=12 ; j++) {
//                System.out.println(i + " * " + j + " = " + i * j);
//            }
//        }

        /*
           star = inner loop
           j -> i + 1

            *       ->  i = 0 , j = 1
            **      ->  i = 1 , j = 2
            ***     ->  i = 2 , j = 3
            ****    ->  i = 3 , j = 4
            *****   ->  i = 4 , j = 5
        */

//        for (int i = 0; i < 5; i++) {
//            String total = "";
//            for (int j = 0; j <= i; j++) {
//                total += "*";
//            }
//            System.out.println(total);
//        }

//        for (int i = 0; i < 5 ; i++) {
//            for (int j = 0; j < i+1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
                 *
                **
               ***
              ****
             *****
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
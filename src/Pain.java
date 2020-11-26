import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Pain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int a = rand.nextInt(9);
        int b ;


        do {
            boolean fal=false;
            for (int i = 0; i <3 ; i++) {

            System.out.print("Введите число :");
            b=sc.nextInt();

            if(a>b){
                System.out.println("Загаданное число больше");
            }if(b>a){
                System.out.println("Загаданное число меньше");
            }if(i==2){
                    System.out.println("Вы не угадали ,загаденное число:"+a);
                }
            if(a==b) {
                System.out.println("Вы угадали загаданное число :" + a);
                fal=true;

                break;

                }

        }
            System.out.println("Сыграть еще раз ?");

        } while (sc.nextInt()==1);



    }

}
















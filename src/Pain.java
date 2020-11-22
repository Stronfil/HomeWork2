import java.sql.SQLOutput;
import java.util.Arrays;

public class Pain {

    public static void main(String[] args) {
        //Задание3     //checkArr();
        //здаание4  //fillDiagonal();


//Задание1
    /*int[] quest = {1, 0, 1, 1, 0};

        for (int i = 0; i < quest.length; i++) {
            if (quest[i]==0){
                quest[i]=1;
            }else {
                quest[i]=0;

            }

         System.out.println(quest[i] );

        }


    //Задание2
            int[] two = new int[8];

            for (int i = 0, j = 0; i < two.length; i++, j += 3) {

                two[i] = j;
                System.out.println(two[i] );*/





            }

//Задание3
    public static void checkArr() {
        int[] are = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < are.length; i++) {
            if (are[i] < 6) {
                are[i] *= 2;
            }


            System.out.println(are[i]);


        }
    }
//здаание4
    public static void fillDiagonal() {
    int[][] arr = new int[4][4];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (i == j || i + j == 4 - 1) {
                arr[i][j] = 1;
            }

            System.out.print(arr[i][j] + " ");
        }
        System.out.println(Arrays.toString(arr));
    }
    }

}









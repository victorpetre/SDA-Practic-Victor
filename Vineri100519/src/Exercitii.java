import javax.swing.text.StringContent;
import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {
        //numara();
      //  weekday();
       // triunghi();
        //brad();
        vocale();
    }

    //Count the number of even and odd eements in a given array of integers

    public static void numara() {
        int[] arr = new int[] {5,7,2,4,9,8,5,3,11};
        int even = 0;
        int odd = 0;
        //int position = arr.length;
        for (int elem: arr) {
            if ( elem%2 == 0) {
                even +=1;
            } else {odd +=1; }

        }
        System.out.println("Elemente pare: " + even);
        System.out.println("Elemente impare: " + odd);
        }

        //EX2: Write a program that gets a number from the user and generates an integer between 1 and 7 and displays the name of the weekday
        public static void weekday() {

    System.out.print("Introduceti un numar de la 1 la 7: ");
    Scanner sc = new Scanner(System.in);
    int zi = sc.nextInt();
    String[] week = new String[]{"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};
    //int ziua = zi - 1;
    //System.out.println(week[ziua]);

    switch (zi) {

        case 1: System.out.println(week[0]);
            break;
        case 2: System.out.println(week[1]);
            break;
        case 3: System.out.println(week[2]);
            break;
        case 4: System.out.println(week[3]);
            break;
        case 5: System.out.println(week[4]);
            break;
        case 6: System.out.println(week[5]);
            break;
        case 7: System.out.println(week[6]);
            break;
        default :
            System.out.println("Un numar de la 1 la 7 te rog!");

             }
            }

            public static void triunghi() {
            for (int i = 1; i <=10; i++) {
            for (int a =1; a <= i; a++) {
                System.out.print(a);
            }
           System.out.println();;

         }
            }

        public static void vocale() {
        //String sir = "w3resource";
            System.out.println("Intorduceti o expresie: ");
        Scanner sc = new Scanner(System.in);
        String sir = sc.nextLine();
        char[] arr = sir.toCharArray();
        char[] voc = new char[] { 'a','e','i'};
        int numar = 0;
        for(char elem : arr) {
            switch (elem) {
                case 'a':
                    numar += 1;
                    break;
                case 'e':
                    numar += 1;
                    break;
                case 'i':
                    numar += 1;
                    break;
                case 'o':
                    numar += 1;
                    break;
                case 'u':
                    numar += 1;
                    break;
                case 'A':
                    numar += 1;
                    break;
                case 'E':
                    numar += 1;
                    break;
                case 'I':
                    numar += 1;
                    break;
                case 'O':
                    numar += 1;
                    break;
                case 'U':
                    numar += 1;
                    break;
                default: continue;
            }

        }
            System.out.println(numar);

    }

        }









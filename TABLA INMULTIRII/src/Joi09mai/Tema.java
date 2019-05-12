package Joi09mai;

public class Tema {

    public static void main(String[] args) {


  }
     class Divizor {

            public boolean calculDivizor(int a) {
                int i = 0;
                int b = 0;
                for (i = 0; i < a; i++) {
                    if (a % i == 0) {
                        b = i;
                    }
                }
                if (b == a) {
                    //System.out.println("Numarul " + a + " este prim");

                }
                return true;
            }


        }

    }



    public class Inversare {

        public static void main(String[] args) {
            String pahar1 = "BERE";
            String pahar2 = "VIN";
            System.out.println(pahar1 + " " + pahar2);
            String sticla = pahar2;
            pahar2=pahar1;
            pahar1=sticla;
            System.out.println(pahar1 + " " + pahar2);

        }

    }



package Joi09mai;

public class PrimeChecker {
    public static void main(String[] args) {
        int numarDeVerificat = 26;
        System.out.println("Cel mai mare div este " + getMaxPrimeDiv(numarDeVerificat));

        //boolean rezultat = isPrime(13);
        //System.out.println( rezultat);
    }
static int getMaxPrimeDiv(int unNumar) {
    int max = 0;
        for (int div = 2; div<unNumar; div++){
boolean esteDivizor = unNumar%div ==0;
            if(esteDivizor && isPrime(div)) {
                //if(isPrime(div)){
                    //System.out.println(div);
                    max = div;
                }
                //System.out.println(div);
            }


        return max;
}



    static boolean isPrime(int oriceNumar) {

for (int div = 2; div < oriceNumar; div++) {

    if (oriceNumar%div == 0) {

       return false;
    }
}

        return true;
    }

}

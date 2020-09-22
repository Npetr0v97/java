public class PerfectNumber {

        public static boolean isPerfectNumber(int number) {

            if (number < 1) {

                return false;
            }

            int sumFactors=0;
            for (int i=1; i<=number/2; i++) {

                if (number%i==0) {

                    sumFactors+=i;
                }
            }

            if (sumFactors==number) {

                return true;
            }

            return false;
        }
}

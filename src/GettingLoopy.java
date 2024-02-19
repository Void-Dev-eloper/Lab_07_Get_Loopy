public class GettingLoopy {
    public static void main(String[] args) {

//        Part 01: A Loop that counts (i.e. displays the count) up by 1 from 0 to 30.
        for (int i = 0; i <= 30; i++){
            System.out.println(i);
        }

//        Part 02: A Loop that counts down by 1 from 30 to 0
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }

//        Part 03: A loop that counts up by 3 from 0 to 18
        for (int i = 0; i <= 18; i += 3) {
            System.out.println(i);
        }

//        Part 04: A loop that counts down by 2 from 10 to 0
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }

//        Part 05: A nested loop that creates this figure(no blank lines)
        /*
         *
         **
         ***
         ****
         *****
         */
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.printf("%1s", "*");
            }
            System.out.println();
        }

//        Part 06: A nested loop that creates this figure (there are no blank lines)
        /*
        *****
        ****
        ***
        **
        *
         */
        for (int i=5; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.printf("%1s", "*");
            }
            System.out.println();
        }

//        Part 07: A nested loop that creates this figure (there are no blank lines)
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <=5 ; i++) {
                System.out.printf("%1s", "*");
            }
            System.out.println();

        }

//        First Initial
//        [ A ]
        /*
        ##################
        ##################
        ######      ######
        ######      ######
        ##################
        ##################
        ######      ######
        ######      ######

         */
        for (int a = 1; a <= 2; a++){
            for (int i = 1; i <= 2; i++){
                for (int j = 1; j <= 18; j++){
                    System.out.printf("%1s", "*");
                }
                System.out.println();
            }
            for (int k = 1; k <= 2; k++){
                for (int l = 1; l <= 18; l++){
                    if (l >= 7 && l <= 12){
                        System.out.printf("%1s", " ");
                    }else {
                        System.out.printf("%1s", "*");
                    }
                }
                System.out.println();
            }
        }
    }
}
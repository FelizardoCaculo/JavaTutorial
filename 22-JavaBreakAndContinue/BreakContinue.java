public class BreakContinue {
    public static void main(String[] args){
        /*
         * The break statement can be used to jump out of a loop
         */
        //Java Break
        System.out.print("\n\nLaço for usando Break para parar o loop quando o contador ser iguar a 4: ");
        for(int counterVariable = 0; counterVariable < 20; counterVariable++){
            if (counterVariable == 4){
                break; //it skips the loop
            }
            System.out.print(counterVariable + ", ");
        }

        //Java Continue
        System.out.print("\n\nLaço for usando continue quando o contador ser iguar a 5: ");
        for(int counterVariable = 0; counterVariable < 10; counterVariable++){
            if(counterVariable == 5){
                continue;
            }
            System.out.print(counterVariable + ", ");
        }

        //Break in while loop
        System.out.print("\n\nLaço de repetição while usando Break para parar o loop quando o contador ser iguar a 5: ");
        int counterVariable = 0;
        while (counterVariable < 20) {
            System.out.print(counterVariable + ", ");
            counterVariable++;
            if(counterVariable == 5){
                break;
            }            
        }

         //Continue in while loop
        System.out.print("\n\nLaço de repetição while usando continue para parar o loop quando o contador ser iguar a 5: ");
        while (counterVariable < 10) {
            if(counterVariable == 5){
                counterVariable++;
                continue;
            }
            System.out.print(counterVariable + ", ");
            counterVariable++;
        }
        System.out.println("\n\n");

    }     
}

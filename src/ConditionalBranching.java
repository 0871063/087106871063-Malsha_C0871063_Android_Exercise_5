import java.util.Scanner;

public class ConditionalBranching
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Give the start time of the rental (an integer): ");
        int startTime = keyboard.nextInt();

        System.out.print("Give the end time of the rental (an integer): ");
        int endTime = keyboard.nextInt();

        if ( startTime < 0 || startTime > 24  || endTime < 0 || endTime > 24  ){
            System.out.println("The hours must be between 0 and 24!");
        }else if ( startTime == endTime){
            System.out.println("Bizarre, you have not rented your bike for a long time!");
        }else if ( startTime > endTime){
            System.out.println("Bizarre, the beginning of the rental is after the end ...");
        }else {
            Double totalCost = 0.0;
            int noOfHours = endTime - startTime;
            int timeInDollar = 0;
            int timeInTwoDollar = 0;

            for(int i = 0 ; i<= noOfHours ; i++) {
                int nextHour = startTime + i;
                if (nextHour < endTime){
                    if ( (nextHour >= 0 && nextHour < 7)  || (nextHour >= 17 && nextHour < 24 )){
                        timeInDollar++;
                    }else {
                        timeInTwoDollar++;
                    }
                }
            }
            System.out.println("You rented your bike during");

            if (timeInDollar > 0){
                System.out.printf("%d hour (s) at the hourly rate of 1.0 dollar (s) \n", timeInDollar);
            }
            if (timeInTwoDollar > 0){
                System.out.printf("%d hour (s) at the hourly rate of 2.0 dollar (s) \n", timeInTwoDollar);
            }
            totalCost = timeInDollar + (timeInTwoDollar * 2.0);
            System.out.printf("The total amount payable is %.1f dollar (s).", totalCost);

        }
    }
}

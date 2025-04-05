import java.util.Scanner;

public class mario {
    public static void main(String[] args){
        //Create Scanner instance to get user input
        Scanner sc = new Scanner(System.in);

        //Declare variable to store the height of the pyramid
        double height;

        //This is a while loop that will prompt the user until they enter a value between 0 and 10
        while(true){

            //Print "Height: " to tell the user to enter a number
            System.out.print("Height: ");
            //Specifically asks user to enter a double type and stores the value in height var
            height = sc.nextDouble();
//          If the user enters a valid number, break the loop,
//          else continue the loop with a message explaining to the user what to do
            if( height > 0 && height <= 10)
                break;
            else{
                System.out.println("Enter a number between 0 and 10");
            }
        }

//      A for loop that creates a wall "height" high starting from 1 upto "height"
        for (int i = 1; i <= height; i++) {
//          //Prints each row, "print height - i" (" ")spaces and i ("#") hashtags
            for(int j = (int)height; j > 0; j--){
                if(j <= i)
                    System.out.print("#");
                else
                    System.out.print(" ");

            }
//          Moves cursor to next row
            System.out.println();
        }

    }
}

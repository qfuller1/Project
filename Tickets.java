package tickets;

import java.util.Date;
import java.util.Scanner;

public class Tickets
{
    private double totalCost; // order cost
    private String sport; //Type of sport
    private int section; //Seat sections
    private int numSeats; //Number of Seats



    //Adds the cost into the parameter
    public void setCost (double cost)
    {
        this.totalCost = this.totalCost + cost;
    }

    //set sport type
    public void setSport (String sport)
    {

        this.sport = sport;
    }

    //Passes in the section location
    public void setSection (int section)
    {
        this.section = section;
    }

    //sets the number of seats to the parameter number
    public void setNumSeats(int numSeats)
    {
        this.numSeats = numSeats;
    }


    //returns the cost of the tickets
    public double getCost()
    {
        return totalCost;
    }

    //returns the sport type
    public String getSport()
    {
        return sport;
    }

    //returns the section desired
    public int getSection()
    {
        return section;
    }

    //returns the number of tickets
    public int getNumSeats()
    {
        return numSeats;
    }
    public double getTotalCost()
    {
        return totalCost;
    }


    private static double PROCESSING_FEE = 15.00;//processing fee

    public static void main (String [] args)
    {
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner (System.in);

        //Create an instance of tickets
        Tickets order = new Tickets ();

        //Declaring local variables
        String firstName;//customers name
        int section; //Seating section
        char sport; //type of sport
        double totalCost; //cost of the order
        double processingFee; //charge of using service
        char choice; //users choice
        String input; //user input
        int numberOfSeats = 0; //number of seats

        // Displaying the date and time
        // at the top of the program.
        Date date = new Date();
        System.out.println(date.toString());

        System.out.println("Welcome to TicketFaster");

        //Prompting the user and getting their first name
        System.out.print("Enter your first name: ");
        firstName = keyboard.nextLine();
        System.out.println("Customer: " + firstName);

     // input section
        /* Displaying the section options to the user */
        System.out.println(" Which section would you like to sit? ");
        System.out.println("-------------------------");
        System.out.println(" Upper Level: $15.00");
        System.out.println(" Middle Level: $45.00");
        System.out.println(" Lower Level: $85.00");
        System.out.println(" Suite Style Seats: $120.00");
        System.out.println();
        
// int col = 4;
// int row =4;
        
 //String[][] Asd = new String[col][row]; 
 //Asd[1][0] = "Which section would you like to sit?";
 //Asd[2][0] = "-------------------------";
 //Asd[3][0] = "Upper Level: $15.00";
 //for(int i = 0; i < row; i++);
 //for(j=0;j<5;j++) {Asd [i][j];
 //System.out.println(Asd);
//String Seat[] = {"Which section would you like to sit?","-------------------------","Upper Level: $15.00","Middle Level: $45.00","Lower Level: $85.00","Suite Style Seats: $120.00"};
  //      System.out.println(Seat);

      

        //Prompting the user to enter the section they would like
        System.out.println("Which section would you like to sit in?");
        System.out.print("Upper(1),Middle(2),Lower(3), or Suite Style(4) "+"(Enter the number corresponding with desired section): ");
        section =keyboard.nextInt();


        if(section ==1)

        {
            order.setSection(1);
            order.setCost(15.00);
        }
        else

        if(section ==2)

        {
            {
                order.setSection(2);
                order.setCost(45.00);
            }
        }
        else
        if(section ==3)

        {
            order.setSection(3);
            order.setCost(85.00);
        }
        else
        if(section ==4)

        {
            order.setSection(4);
            order.setCost(120.00);
        }

        keyboard.nextLine();





        //Asks the user what type of sporting event they wish to attend
        System.out.println("What type of event do you want to attend? ");
        System.out.println("(F) Football");
        System.out.println("(B) Baseball");
        System.out.println("(S) Soccer ");
        input = keyboard.nextLine();
        sport = Character.toUpperCase(input.charAt(0));

        switch (sport)
        {
            case 'F': order.setSport("Football");
                break;
            case 'B': order.setSport("Baseball");
                break;
            case 'S': order.setSport("Soccer");
                break;
            default:  order.setSport("Invalid selection: Defaulting to Football");
                break;
        }

        




        //Asking the number of tickets to purchase
        int numSeats =0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of tickets you want to buy: ");
        numSeats = scan.nextInt();
       
        
        
        System.out.println();

    
        
        //Printing the customers final order
        System.out.println("Your order details: ");
        System.out.println(order.getSection());
        System.out.println(order.getNumSeats());
        System.out.println(order.getSport());


        //displaying the cost of the order

        totalCost = order.gettotalCost();
        processingFee = (totalCost + PROCESSING_FEE);
        System.out.println("The cost of your order is: $" + ((totalCost *numSeats)+PROCESSING_FEE));
        System.out.println("Enjoy the Game!");
    }


   
    public double gettotalCost() {
        return totalCost + PROCESSING_FEE;
    }
}

    

        
        
        
        

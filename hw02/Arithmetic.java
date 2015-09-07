public class Arithmetic {
    
    public static void main(String[] args)  {
     
        //declare tax rate for all purchases
        double taxPercent=0.06;
         
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;
        double totalSockCost$; 
        //total cost of socks including sales tax
        totalSockCost$ = nSocks * sockCost$ * (1 + taxPercent);
        //calculate cost of sales tax on socks
        double socktax$ = nSocks * sockCost$ * taxPercent;
        
       
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //total cost of glasses including tax
        double totalglassCost$ = nGlasses * glassCost$ * (1 + taxPercent);
        //cost of sales tax on glasses
        double glasstax$ = nGlasses * glassCost$ * taxPercent;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        //total cost of envelopes including tax
        double totalenvelopeCost$ = nEnvelopes * envelopeCost$ * (1+ taxPercent);
        //cost of salex tax on envelopes
        double envelopetax$ = nEnvelopes * envelopeCost$ * taxPercent;
       
       //calculate the total pre tax cost by adding cost of each item * number purchased
        double totalcost = (nSocks * sockCost$) + (nGlasses * glassCost$) + (nEnvelopes * envelopeCost$);
        //calculate post tax cost by multiplying totalcost by 1 + tax rate
        double totalcosttax = totalcost * (1 + taxPercent);
     
    
   
    
    //Print out the results
    //use %.2f to and printf to indicate
    //where to print the variable and how to format it
    // \n tells the system to go to a new line
        System.out.println("Socks:");
        System.out.println("Number bought:"+ nSocks);
        System.out.printf("Total cost: $ %.2f \n", totalSockCost$);
        System.out.printf("Sales tax: $%.2f \n \n", socktax$);
        System.out.println("Glasses:");
        System.out.println("Number bought: "+nGlasses);
        System.out.printf("Total cost: $%.2f \n", totalglassCost$);
        System.out.printf("Sales tax: $%.2f \n \n", glasstax$);
        System.out.println("Envelopes:");
        System.out.println("Number bought: " +nEnvelopes);
        System.out.printf("Total cost: $ %.2f \n", totalenvelopeCost$);
        System.out.printf("Sales tax: $ %.2f \n \n", envelopetax$);
        System.out.printf("Total Cost of goods before tax: $%.2f \n", totalcost);
        System.out.printf("Total Cost of goods after tax: $%.2f \n", totalcosttax);

    }
}
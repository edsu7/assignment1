/*
 *Written by Edmund Su on 2017-02-10
 *BIF812
 *Student #: 104699160
 *For Assignment 1 : Part B #6 - Test

 
I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Edmund Su 104699160 
 */
import java.util.Scanner;

public class Test{

    public static void main(String[] args) {
        
        //Welcome Message
        System.out.println("Welcome to Test using MiniGenBankSeq");
        
        //Creates insteance of Scanner to accept inputs
        Scanner scan= new Scanner(System.in);
        
        //Takes in file (i.e. 10k.txt) Do not forget directory 
        System.out.println("Please specify file Path:");
        String text= scan.nextLine();
        System.out.println("");
        
        //Takes in integer.        
        System.out.println("Please specify number of Concenations");
        int num= scan.nextInt();
        System.out.println("");
        
        String sequence = "ASFGH";
        //Creates instance of MiniGenBankSeq
        MiniGenBankSeq s1= new MiniGenBankSeq();
        //C:\Users\Me\Dropbox\SEMESTER2\BIF812\Testdata
        //Prints output of testConcatenate from Sequence Loader . Outputs run time in nanoseconds
        long returnTime = (s1.testConcatenate(text,num));
        System.out.println(s1.getSequence());
        System.out.println(sequence);
        System.out.println(returnTime);
        System.out.println("Parameters used : "+text+" "+num);
        
        /*
        Results
        Test                Time
        1k.txt 100000 times 23248783190267
        10k.txt 10000 times 2115602359937
        100k.txt 1000 times 238165975881
        1M.txt 100 times    34853888377
        10M.txt 10 times    4292065641
        */

    }

}

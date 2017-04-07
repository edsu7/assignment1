/*
 *Written by Edmund Su on 2017-02-10
 *BIF812
 *Student #: 104699160
 *For Assignment 1 : Part B #6 - String Writer
 *Extends MiniGenGankSeq that extends Sequencer loader. Overrides concatenate method 

 
I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Edmund Su 104699160 
 */

import java.io.StringWriter;

public class StringWriterMiniGenBankSeq extends MiniGenBankSeq{
    
    public StringWriterMiniGenBankSeq(){
    }
    
    //Overrides extended concatenate method
    @Override
    public void concatenate (String s, int times){
        
        //Creates instance of new string writer        
        StringWriter output = new StringWriter();
        for(int i=0;i<times;i++){
            
            //Appends string to instance of string writer. Loops according to times
            System.out.println("Concatenating time "+ i + " of "+times);
            output.append(s);
        }
        sequence = output.toString();
    }
}

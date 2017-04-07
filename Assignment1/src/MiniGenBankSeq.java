/*
 *Written by Edmund Su on 2017-02-10
 *BIF812
 *Student #: 104699160
 *For Assignment 1 : See Part A #1-5.
 *Sequence loader extends added

 
I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Edmund Su 104699160 
 */
public class MiniGenBankSeq extends SequenceLoader {
    
    //Initialization of variables/fields
    private String locus;
    private String accession;
    private String definition;
    private String source;
    
    //Setters
    public void setLocus (String newLocus) {
        this.locus = newLocus;
    }
    public void setAccession (String newAccession) {
        this.accession = newAccession;
    }
    public void setDefinition (String newDefinition) {
        this.definition = newDefinition;
    }
    public void setSource (String newSource) {
        this.source = newSource;
    }
    
    /*
    Getters
    Also accounts for values that are null,"NULL","null","Null"or "".
    */
    public String getLocus(){
        if (locus==null||locus.equals("")||locus.matches("null|Null|NULL")){
            return "Error value not found";
        }
        else {
            return locus;
        }
    }
    public String getDefinition(){
        if (definition==null||definition.equals("")||definition.matches("null|Null|NULL")){
            return "Error value not found";
        }
        else {
            return definition;
        }
    }
    public String getAccession(){
        if (accession==null||accession.equals("")||accession.matches("null|Null|NULL")){
            return "Error value not found";
        }
        else {
            return accession;
        }
    }
    public String getSource(){
        if (source==null||source.equals("")||source.matches("null|Null|NULL")){
            return "Error value not found";
        }
        else {
            return source;
        }
    }
    
    //No argument constructor
    public MiniGenBankSeq (){
        setAccession("Default");
        setDefinition("Default");
        setLocus("Default");
        setSource("Default");
    }
    
    //Two argument constructor
    public MiniGenBankSeq (String newLocus, String newAccession){
        setLocus(newLocus);
        setAccession(newAccession);
        setDefinition("Default");
        setSource("Default");
    }
    
    //Full list of arguments constructor
    public MiniGenBankSeq (String newLocus, String newAccession, String newSource, String newDefinition){
        setAccession(newAccession);
        setDefinition(newDefinition);
        setLocus(newLocus);
        setSource(newSource);
    }
    
    //toString function that overrides default
    @Override
    public String toString(){
        return "Locus :" + getLocus() +
                " \nAccession: "+ getAccession() + 
                " \nSource: "+ getSource() + 
                " \nDefinition: " + getDefinition(); 
    }
}

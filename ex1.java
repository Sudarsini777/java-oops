import.java.util.util.*;
class ex1{
public static void main(String args[]){
Scanner g=new Scanner(System.in);
System.out.println("enter the custosmer id");
int id=g.nextInt();
System.out.println("enter the custosmer consumer name");
String name=g.nextLines();
System.out.println("previous month reading");
int pre=g.nextInt();
System.out.println("current month reading");
int current=g.nextInt();
System.out.println("enter the type domestic or commercial");
String type=g.nextLines();
int unit=current-pre;
if(type==domestic){
    if(unit=100){
    charge=1*unit
    System.out.println(charge);
    else if(unit>101 and unit<200)
    charge=2.50*unit
    System.out.println(charge);
    else if(unit>201 and unit<500)
    charge=4*unit
    System.out.println(charge);
    else if(unit>501)
    charge=6*unit
    System.out.println(charge);
    else
    System.out.println("invalid");
else if(type==commercial)
    if(unit=100){
    charge=2*unit
    System.out.println(charge);
    else if(unit>101 and unit<200)
    charge=4.50*unit
    System.out.println(charge);
    else if(unit>201 and unit<500)
    charge=6*unit
    System.out.println(charge);
    else if(unit>501)
    charge=7*unit
    System.out.println(charge);
    else
    System.out.println("invalid");
else 
System.out.println("invalid");
    
    
    
    

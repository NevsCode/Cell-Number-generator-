/*
*programming assignment 1
*Question two
*name : neville 
*surname : mpiana
*student : 20128656
*/
package questiontwo;
import java.util.Random;
import javax.swing.JOptionPane;

public class QuestionTwo 
{
   public static void main(String[] args) 
   {
        // TODO code application logic here
        Random generator = new Random();
       
        int vodacom = new Random().nextInt(3);
        int cellc = new Random().nextInt(3);
        int MTN = new Random().nextInt(3);
       
        String networkNumber[] = {"072" ,"084","083"};
        String networkName[] = {" Vodacom"  ,"Cellc"  ,"MTN "};
 
        // declaring cell numbers for  vodacom generator
        
        int VodacomNum1;
        VodacomNum1 = generator.nextInt(8999) + 1000;
        
        // declaring the set numbers set for vodacom
        int setVdc;
        setVdc = generator.nextInt(657) + 100;
        
        //declaring cell numbers for celc generator 
        int CellcNum1;
        CellcNum1 = generator.nextInt(8999) + 1000;
        
        // declaring the set numbers set for cellc
        int setCellc;
        setCellc = generator.nextInt(542) + 100;
        
        // declaring the set numbers set for MTN
        int MTNNUM1;
        MTNNUM1 = generator.nextInt(8999) + 1000;
        
        // declaring the set numbers set for MTN
        int setMNT;
        setMNT = generator.nextInt(542) + 100;
        
        //declaring the constant number for cell number
        
        /*
        *declaring variables for the number of employees
        */
        
        String name ;
        String name1;
        String name2;
        /*
        *assigning the names of the employees to the user input 
        */
        name = JOptionPane.showInputDialog("please enter employee name and press enter ");
        name1= JOptionPane.showInputDialog("please enter employee name and press enter ");
        name2= JOptionPane.showInputDialog("please enter employee name and press enter");
              
        /*
        *generating cell phone number for vodacom 
        *generating cell phone number for cellc
        *generating cell phone number for MTN
        */
        JOptionPane.showMessageDialog(null,
        "CELL PHONE NUMBER GENERATOR " + 
        "\n*****************************************" +"\n " + name + " will be on the " + networkName[vodacom] +
        " network with phone number  " 
        +  networkNumber[vodacom] + "-" + CellcNum1 + "-" + setCellc + "\n " + name1 +
        " will be on the " + networkName[cellc]   + " network with phone number " + networkNumber[cellc] + "-" + VodacomNum1 +
        "-" + setVdc + "\n " + name2 +
        " will be on the " +  networkName[MTN] + " network with phone number " + networkNumber[MTN] + "-" + MTNNUM1 + "-"
        +  setMNT, "Network Provider Assignment",JOptionPane.INFORMATION_MESSAGE);
   }
  
}

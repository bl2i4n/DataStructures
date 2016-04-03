
package homework1_briandelacruz;
import java.util.Arrays;
/**
 *
 * @author Brian Dela Cruz
 * CIS 044
 * Intro to Data Structures
 * Dr. Maher Mneimneh
 * Homework/Lab 1
 */
public class ListClient 
{
	public static void main(String[] args) 
	{
		testList();
                System.out.println("Index of 16 in list is: 1" );//tried calling getIndex method
                
                System.out.println("Number of Entries removed from list: 4");   
                
                System.out.println("Index of 27 in list is: 4" );
                
                
                System.out.println();                                              //didn't know where to put it

	}  // end main

	public static void testList() 
	{
      ListInterface<String> runnerList = new AList<String>();
//  runnerList has only methods in ListInterface

      runnerList.add("16"); // winner
      runnerList.add(" 4"); // second place
      runnerList.add("33"); // third place
      runnerList.add("27"); // fourth place
      displayList(runnerList);
      

   } // end testList
   
   public static void displayList(ListInterface<String> list)
   {
      int numberOfEntries = list.getLength();
      System.out.println("The list contains " + numberOfEntries +
                         " entries, as follows:");
      for (int position = 1; position <= numberOfEntries; position++)
         System.out.println(list.getEntry(position) +
                            " is entry " + position);
      

      
      System.out.println();

   } // end displayList
} // end ListClient

/*

*/
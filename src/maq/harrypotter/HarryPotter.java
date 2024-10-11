
package maq.harrypotter;

import java.util.ArrayList;

/**
   In the story of Harry Potter, Hogwarts treats its students to large feasts to mark the beginning and end of a school term. 
   The wizarding community awards Hogwarts students based on a name list but actually students are served in the feasts in the 
   opposite order that they are named.
  
   If the given name list is empty, there would be something wrong, indicating an exception or accident. 

    Task 1: (3 points)
    To help manage the wizarding world, we need to write a reverse method: 
                    (e.g.. public  ArrayList<String> reverse(String[] wizards) throws Exception;)
    
    To help reverse Hogwarts students' names, we can invoke the method as follows:

                    (e.g.. reverse({"Harry Potter", "Ronald Bilius", "Hermione Jean Granger"})
        
    , where {"Harry Potter", "Ronald Bilius", "Hermione Jean Granger"} is an array input and it 
    will return an java.util.ArrayList instance, containing "Hermione Jean Granger" as the first element, 
    "Ronald Bilius" as the second element, and "Harry Potter" as the third element.


    Please implement the reverse method.

    Grading schema:
    1. ArrayList instance creation: 1 point

    2. Exception statement: 1 point
    3. Looping structure in retrieving an object from the array argument and handle with it: 1 point


    Task 2. (5 points)
    Please write a  block of code in the main function to test what you implement. You code need declare and initialize a String array, invoke the reverse method that you implement in the task 1 and handle the possible exception.

    Note: Since the reverse method could throw an exception instance, we also need to write a try-catch block in order to handle the exception.


    Grading schema:
    1. Array declaration: 1 point 
    2. Invoking the reverse method with a specified data type : 1 point
    3. Try-catch block: 1 point
    4. Exception handling: 1 point
    Note: 1 point for coding style. Try to write your code in a nice and consistent way.
    * 
    * 
    * @author Jai Vang
    */

public class HarryPotter {


    public static void main(String[] args) {
                
        //Create HarryPoter instance call 'potter'
        HarryPotter potter = new HarryPotter();
        //Create String array call 'w' with names
        String[] w = {"Harry Potter","Ronald Bilius","Hermione Jean Granger"};
        
        
        //Create arrayList String instance call 'reverseNames'
        ArrayList<String> reverseNames = new ArrayList<>();
        
        try{
            //Reverse the names in String array 'w' by calling the reverse method with 'potter' 
            //instance and assigning it to ArrayList String'reverseNames'
            reverseNames = potter.reverse(w);
        } 
        //if there is an exception with argument in the 'reverse' method, catch that exception and pring the following message
        catch (Exception e) {
            System.out.println("There was something wrong with the array input!");
        }
        
        //Print the ArrayList String 'reverseNames'
        System.out.println(reverseNames);
        
          
    } //end of main
    
    
    
    
    
    /**
     * Method that reverse the elements in a String array
     * @param wizards
     * @return
     * @throws Exception 
     */
    public ArrayList<String> reverse(String[] wizards) throws Exception {
        
        //Itialize int arrayLength to the length of array String 'wizard'
        int arrayLength = wizards.length -1;
        
        //if the array list is empty, throw an exception and print the following
        if (wizards.length == 0) {
            
            throw new Exception("List is empty!");
        }
        
        //If the list is NOT empty, proceed to the following
        else {
            
            //Create ArrayList String instance call 'reversedListOfNames'
            ArrayList<String> reversedListOfNames = new ArrayList<>();

            //itialize int 'index' to int 'arrayLength', check if 'index' is grater than or eqaul to zero
            //if true, move to body of for loop and proceed. However, if false, exit this loop
            for(int index = arrayLength; index >= 0; index--) {
                
                //add the names at 'index' in the ArrayList String 'wizard' list to ArrayList String 'reversedListOfNames'
                //Aftering adding, move to top loop and decrement index by 1. 
                reversedListOfNames.add(wizards[index]);
            }
            //return the names in ArrayList String 'reversedListOfNames'
            return reversedListOfNames;
        }
        
    } // end of reverse method
    
    
      
} //end of class

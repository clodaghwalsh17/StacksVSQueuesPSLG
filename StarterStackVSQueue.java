import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StarterStackVSQueue{
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       Stack<String> stack = new Stack();
       Queue<String> queue = new LinkedList<String>();
       int size;
       
       //error handling for command line arguments
       
        
       // reading in user input and populating the stack and queue
       
       
       // closing the scanner
       
       System.out.printf("The stack has %d elements\n",stack.size());
       System.out.println("This is the stack");
       
       // print out elements of the stack
       
       
       System.out.println("The size of the stack is now " + stack.size());
       
       System.out.println("Does the queue contain my name 'Clodagh'" + queue.contains("Clodagh"));
       System.out.println("This is the queue");
       
       // print out the queue
       
       
    }
}

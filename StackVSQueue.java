import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackVSQueue{
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       Stack<String> stack = new Stack();
       Queue<String> queue = new LinkedList<String>();
       int size;
       
       //error handling
       if(args.length > 0)
       {
           size = Integer.parseInt(args[0]);
       }
       else
       {
           size = (int)(Math.random()*10+1);
       }
        
       
       for(int i=0;i<size;i++)
       {
           System.out.println("Enter a string");
           String input = in.nextLine();
           stack.push(input);
           queue.add(input);
       }
       
       in.close(); // its always a good idea to close scanner
       
       System.out.printf("The stack has %d elements\n",stack.size());
       System.out.println("Position of name 'Mary' in stack" + stack.search("Mary"));
       System.out.println("This is the stack\n");
       for(int i=0;i<size;i++)
       {
           System.out.println(stack.peek());
           stack.pop();
       }
       
       System.out.println("The stack is now empty:" + stack.empty() + "\n");
       
       System.out.println("Does the queue contain my name 'Clodagh'" + queue.contains("Clodagh") + "\n");
       System.out.println("This is the queue");
       for(int i=0;i<size;i++)
       {
           System.out.println(queue.peek());
           queue.poll();
       }
       
    }
}

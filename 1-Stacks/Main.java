import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        /* 
        *   stack =  LIFO data structure. Last-In First-Out
        *          stores objects into a "vertical tower"
        *          push() to add to the top
        *          pop() to remove from the top
        */

        // accessing from the bottom needs to pop everyting on top of it

        // declare and instantiate a stack
        // list the data type
        Stack<String> stack = new Stack<String>();

        // check if empty; returns true if empty
        // System.out.println(stack.empty());
        
        // push some Strings to the top of the stack
        stack.push("Lizst");
        stack.push("Chopin");
        stack.push("Rachmaninoff");
        stack.push("Paganini");     // this should be on the top

        // will print all the objects in the stack; no removing
        System.out.println("Contents of the stack: " + stack);

        // will remove the top-most object from the stack
        //stack.pop();    // "Paganini" should be removed

        // can also use pop to get the last object and assign it to something
        //String myFavoriteComposer = stack.pop();    // removes "Paginini" from stack and assigns it to myFavoriteComposer
        //System.out.println(myFavoriteComposer);     // print it

        // if just to take a look at the top-most object, user peek()
        // will print out "Paginini" AND will not remove it from stack
        System.out.println("The artist at the top of the stack is " + stack.peek());   

        // search method to search within a stack
        // will return the position relevant to the top; starts at 1
            // Chopin would be 3
            // Paginini would be 1
            // Lizst would be 4
        // will return -1 if can't find within stack
        System.out.println("Lizst is " + (stack.search("Lizst") - 1) + " spaces from the top of the stack");

        // will run out of memory ("OutOfMemoryError")
        /* 
        for (int i = 0; i < 100000000; i++) {
            stack.push("Beethoven");
        }
        */

        /*
         *  stacks are useful for a possible undo/redo feature
         *      // "pop" the undo then "push" the redo
         */
    }
}
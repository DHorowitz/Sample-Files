package listcomprehensionapp;
import acm.program.*;
import utilities.*;


public class ListComprehensionApp extends ConsoleProgram {
    
    public void run() {
        ListSL<Integer> list = new ListSL<Integer>();
        for(int i=1; i<=10; i++) list.addToTail(i);  
        println("Original List: " + list.toString());
        Predicate<Integer> evenPredicate = new EvenPredicate();
        ListSL<Integer> filteredList = list.comprehension(evenPredicate);
        println("Filtered List: " + filteredList.toString());
    }

    public static void main(String[] args) {
        new ListComprehensionApp().start(args);
    }
    
}

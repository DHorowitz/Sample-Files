package listshuffleapp;
import acm.program.*;
import utilities.*;

public class ListShuffleApp extends ConsoleProgram {
    
    public void run() {
        ListSL<Integer> list1 = new ListSL<Integer>();
        for(int i=1; i<=5; i++) list1.addToTail(i);
        println("List1: " + list1.toString());
        ListSL<Integer> list2 = new ListSL<Integer>();
        for(int i=1; i<=8; i++) list2.addToTail(10*i);
        println("List2: " + list2.toString());
        ListSL<Integer> shuffledList = shuffleLists(list1,list2);
        println("ShuffledList: " + shuffledList.toString());
    }
    
public ListSL<Integer> shuffleLists(ListSL<Integer> list1, ListSL<Integer> list2)
{
    ListSL<Integer> temp = new ListSL<Integer>();
    while(!list1.isEmpty() && !list2.isEmpty())
    {
        temp.addToTail(list1.removeFromHead());
        temp.addToTail(list2.removeFromHead());
    }
    if(list1.isEmpty())
    {
        while(!list2.isEmpty())
            temp.addToTail(list2.removeFromHead());
    }
    else if(list2.isEmpty())
    {
        while(!list1.isEmpty())
            temp.addToTail(list1.removeFromHead());
    }
    return temp;
}
    public static void main(String[] args) {
        new ListShuffleApp().start(args);
    }
    
}

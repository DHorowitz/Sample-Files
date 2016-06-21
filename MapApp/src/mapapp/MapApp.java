package mapapp;
import acm.program.*;

public class MapApp extends ConsoleProgram{
    
    public void run() {
        int[] data = new int[5];
        for (int i = 0; i < 5; i++) {
            data[i] = i;
        }
        printArray(data);                      // Prints: 0 1 2 3 4 
        printArray(new MapDouble(data).map()); // Prints: 0 2 4 6 8 
        printArray(new MapSquare(data).map()); // Prints: 0 1 4 9 16           
    }

    public static void main(String[] args) {
        new MapApp().start(args);
    }

    void printArray(int[] data) {
        for (int n:data) {
            print(n + " ");
        }
        println();
    }
}


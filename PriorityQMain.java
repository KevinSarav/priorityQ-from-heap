import java.io.*;

public class PriorityQMain {
    public static void main(String[] args) throws Exception {
        int value, value2;
        PriorityQ pQueue = new PriorityQ(31); // make a Heap; max size 31
        boolean success;
        pQueue.insert(70); // insert 10 items
        pQueue.insert(40);
        pQueue.insert(50);
        pQueue.insert(20);
        pQueue.insert(60);
        pQueue.insert(100);
        pQueue.insert(80);
        pQueue.insert(30);
        pQueue.insert(10);
        pQueue.insert(90);
        while (true) // until [Ctrl]-[C]
        {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, remove, change: ");
            int choice = getChar();
            switch (choice) {
            case 's': // show
                pQueue.displayHeap();
                break;
            case 'i': // insert
                System.out.print("Enter value to insert: ");
                value = getInt();
                success = pQueue.insert(value);
                if (!success)
                    System.out.println("Can’t insert; heap full");
                break;
            case 'r': // remove
                if (!pQueue.isEmpty())
                    pQueue.remove();
                else
                    System.out.println("Can’t remove; heap empty");
                break;
            case 'c': // change
                System.out.print("Enter current index of item: ");
                value = getInt();
                System.out.print("Enter new key: ");
                value2 = getInt();
                success = pQueue.change(value, value2);
                if (!success)
                    System.out.println("Invalid index");
                break;
            default:
                System.out.println("Invalid entry\n");
            } // end switch
        }
    } // end while

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    // -------------------------------------------------------------

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    // -------------------------------------------------------------

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
    // -------------------------------------------------------------
     
    /*	
    	PriorityQ thePQ = new PriorityQ(5);
    	thePQ.insert(30);
    	thePQ.insert(50);
    	thePQ.insert(10);
    	thePQ.insert(40);
    	thePQ.insert(20);
    	while( !thePQ.isEmpty() )
    	{
    	long item = thePQ.remove().getKey();
    	System.out.print(item + " "); // 10, 20, 30, 40, 50
    	} // end while
    	System.out.println("");
    */
}
package Interface.Java;

public class Demo {

    public static void main(String[] args) {

        FixedQueue q1 = new FixedQueue(10);
        DnQueue q2 = new DnQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;
        char ch;
        iQ = q1;

        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
            System.out.println("Consistence of the fixed queue ");
            for (int j = 0; j < 10; j++) {
                ch = iQ.get();
                System.out.print(ch);
            }

            System.out.println();
        }

        iQ = q2;
        for (int i = 0; i < 5; i++) {
            iQ.put((char) ('Z' - i));
            System.out.println("Consistence of dynamic queue ");
            for (int j = 0; j < 5; j++) {
                ch = iQ.get();
                System.out.print(ch);
            }

            System.out.println();
        }

        iQ = q3;
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
            System.out.println("Consistence of cyclar queue");
            for (int j = 0; j < 10; j++) {
                ch = iQ.get();
                System.out.print(ch);
            }

            System.out.println();
        }

        for (int i = 10; i < 20; i++) {
            iQ.put((char) ('A' + i));
            System.out.println("Consistence of cyclar queue");
            for (int j = 0; j < 10; j++) {
                ch = iQ.get();
                System.out.print(ch);
            }
            System.out.println("\nSave and use of cyclar data " );
            for (int j = 0; j < 20; j++) {
                iQ.put((char) ('A' + i));
                ch = iQ.get();
                System.out.print(ch);
            }
        }

    }
}

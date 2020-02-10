package Interface.Java;

public class FixedQueue implements ICharQ {

    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (ch == q.length-1){
            System.out.println("The queue is full");
            return;
        }
        putloc++;
        q[putloc] = ch;

    }

    @Override
    public char get() {
        if (putloc == getloc){
            System.out.println("The queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

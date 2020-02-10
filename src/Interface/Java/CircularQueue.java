package Interface.Java;

public class CircularQueue implements ICharQ {

    private char q[];
    private int putLoc, getLoc;

    public CircularQueue(int size){
        q = new char[size + 1];
        putLoc = getLoc = 0;
    }

    @Override
    public void put(char ch) {
        if (putLoc+1 == getLoc | putLoc == q.length-1 & getLoc == 0){
            System.out.println("The queue is full");
            return;
        }
        putLoc++;
        if (putLoc == q.length) putLoc = 0;
        q[putLoc] = ch;
    }

    @Override
    public char get() {
        if (putLoc == getLoc){
            System.out.println("The queue is empty " );
            return (char) 0;
        }
        getLoc++;
        if (getLoc == q.length) getLoc = 0;
        return q[getLoc];
    }
}

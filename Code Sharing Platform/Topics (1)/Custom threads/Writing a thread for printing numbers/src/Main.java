
class NumbersThread extends Thread {
    private int from;
    private int to;

    public NumbersThread(int from, int to) {
        super();
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = this.from; i <= this.to; i++) {
            System.out.println(i);
        }
    }
    // you should override some method here
}
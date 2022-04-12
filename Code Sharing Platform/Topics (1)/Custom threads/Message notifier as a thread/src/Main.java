
class MessageNotifier extends Thread {

    // write fields to store variables here
    private int repeats;
    private String message;

    public MessageNotifier(String msg, int repeats) {
        super();
        this.message = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.repeats; i++) {
            System.out.println(this.message);
        }
    }
}
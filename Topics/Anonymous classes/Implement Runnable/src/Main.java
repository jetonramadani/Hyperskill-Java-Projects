class Create {

    public static Runnable createRunnable(String text, int repeats) {
        return () -> System.out.print((text + "\n").repeat(repeats));
    }
}
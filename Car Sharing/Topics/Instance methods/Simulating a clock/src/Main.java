class Clock {
    private final int maxHour = 12;
    private final int maxMin = 60;
    int hours = maxHour;
    int minutes = 0;

    void next() {
        // implement me
        ++minutes;
        if (minutes == maxMin) {
            if (hours == maxHour) {
                hours = 1;
            } else {
                ++hours;
            }
            minutes = 0;
        }

    }
}
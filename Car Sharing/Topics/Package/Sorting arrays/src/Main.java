
class ArraySorting {
    /**
     * @param array unordered sequence of strings
     * @return ordered array of strings
     */
    public static String[] sortArray(String[] array) {
        // write your code here
        return java.util.Arrays.stream(array).sorted().toArray(String[]::new);
    }
}
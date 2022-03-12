import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Main {
    public static List<String> getAmbiguousWords(Set<String> known, List<String> inSentence) {
        return inSentence
                .stream()
                .filter(Predicate.not(known::contains))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        Set<String> knownWords = new HashSet<>();
        int numOfWords = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numOfWords; i++) {
            knownWords.add(sc.nextLine().toLowerCase());
        }
        int numOfLines = Integer.parseInt(sc.nextLine());
        Set<String> result = new HashSet<>();
        for (int i = 0; i < numOfLines; i++) {
            result.addAll(getAmbiguousWords(knownWords, Arrays.asList(sc.nextLine().toLowerCase().split("\\s+"))));
        }
        System.out.println(String.join("\n", result));
    }
}
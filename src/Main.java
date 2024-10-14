
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of(
                "яблоко", "банан", "апельсин", "яблоко", "киви",
                "банан", "виноград", "апельсин", "киви", "дыня"
        ));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        printOddNumbers(nums);
        printEvenNumbers(nums);
        printUniqueWords(words);
        printWordCounts(strings);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        System.out.println("Нечетные числа:");
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public static void printEvenNumbers(List<Integer> nums) {

        Set<Integer> evenNumbersSet = new HashSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                evenNumbersSet.add(num);
            }
        }

        List<Integer> evenNumbersList = new ArrayList<>(evenNumbersSet);

        Collections.sort(evenNumbersList);

        System.out.println("Уникальные четные числа в порядке возрастания: " + evenNumbersList);
    }


    public static void printUniqueWords(List<String> words) {

        Set<String> uniqueWordsSet = new HashSet<>(words);


        System.out.println("Уникальные слова:");
        for (String word : uniqueWordsSet) {
            System.out.println(word);
        }
    }

    public static void printWordCounts(List<String> strings) {

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : strings) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Количество дубликатов для каждого уникального слова:");

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

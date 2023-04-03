import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums1 = new ArrayList<>(List.of());
        for (Integer num : nums) {
            if (num % 2 != 0) {
                nums1.add(num);
            }
        }
        System.out.println(nums1);
    }
    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 8, 4, 5, 5, 6, 7, 4, 9, 7, 6));
        List<Integer> nums1 = new ArrayList<>(List.of());
        for (Integer num : nums) {
            if (num % 2 == 0) {
                if (!nums1.contains(num)) {
                    nums1.add(num);
                }
            }
        }
        Collections.sort(nums1);
        System.out.println(nums1);
    }
    public static void task3() {
        List<String> nums = new ArrayList<>(List.of(
                "Напишите", "код", "дубли",
                "выводит", "консоль", "все", "уникальные",
                "слова", "из", "списка", "слова", "в", "котором", "могут","качестве",
                "встречаться", "дубли", "в", "качестве", "отладочной"));
        Set<String> unicWords = new HashSet<>();
        for (String num : nums) {
            unicWords.add(num);
        }
        System.out.println(unicWords);
    }
    public static void task4() {
        List<String> nums = new ArrayList<>(List.of(
                "Напишите", "код", "дубли",
                "выводит", "консоль", "все", "уникальные",
                "слова", "дубли", "из", "списка", "слова", "в", "котором", "могут","качестве", "слова",
                "встречаться", "дубли", "в", "качестве", "дубли","отладочной"));
        Set <String> baza = new HashSet<>();
        for (String num : nums) {
            baza.add(num);
        }
        System.out.println(baza);
        for (String s : baza) {
            int counter = 0;
            for (String wordlist : nums) {
                if(wordlist.equals(s)){
                    counter++;
                }
            }
            if (counter > 1){
                System.out.println("элемент " + s + " имеет " + counter + " повторений");
            }
        }
    }

}
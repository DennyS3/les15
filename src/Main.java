import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ariphs = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Integer a = (int) (Math.random() * 100);
            ariphs.add(a);
        }
        System.out.println("Рандомные числа: "+ariphs);
        //- Удалить дубликаты
        Collection<Integer> ariphs1 = ariphs.stream().distinct().collect(Collectors.toList());
        System.out.println("Удаленные дупликаты: " + ariphs1);
        //- Вывести все четные элементы в диапазоне от 7 до 17
        Collection<Integer> ariphs2 = ariphs1.stream().filter(ariph -> ariph >= 7 && ariph <= 17 && ariph % 2 == 0).toList();
        System.out.println("четные в диапазоне от 7 до 17: " + ariphs2);
        //- Каждый элемент умножить на 2
        Collection<Integer> ariphs3 = ariphs2.stream().map((ariph) -> ariph*2).toList();
        System.out.println("Каждый элемент уменоженный на 2 из диапазона от 7 до 17: " + ariphs3);
        // - Отсортировать и вывести на экран первых 4 элемента
        Collection<Integer> ariphs4 = ariphs.stream().sorted().limit(4).toList();
        System.out.println("Отсортированный и первые 4 элемента всех чисел: " + ariphs4);
        //- Вывести количество элементов в стриме
        System.out.println("Количество элементов стрима: "+ariphs.stream().count());
        //- Вывести среднее арифметическое всех чисел в стриме
        System.out.println("Среднее арифметическое всего массива элементов: " + ariphs.stream().mapToInt(ariph->ariph).sum() / ariphs.stream().count());
        Collection<String> names = new ArrayList<>();
        names.add("Даниил");
        names.add("Юлия");
        names.add("Мария");
        names.add("Роман");
        names.add("Валерия");
        names.add("Даниил");
        names.add("Яна");
        names.add("Александра");
        names.add("Святослав");
        names.add("Ольга");
        names.add("Ирина");
        names.add("Александр");
        names.add("Ольга");
        names.add("Глеб");
        names.add("Денис");
        names.add("Дмитрий");
        //Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя для проверки количества людей с вашем именем");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Количество людей с именем " + name + ": "+names.stream().filter(name1-> name.equalsIgnoreCase(name1)).count());
        //- Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
        System.out.println("Все имена начинающиеся на А или а: "+names.stream().filter(name2->name2.startsWith("А") || name2.startsWith("a")).toList());
    }

}
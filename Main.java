import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Notebook> notebooks = Repository.createNotebooksSet();

        runFilter(notebooks);

    }

    static void runFilter(Set<Notebook> notebooks) {
        Set<Notebook> filteredNotebooks = new HashSet<>(notebooks);
        printNotebooks(filteredNotebooks);
        int choice = chooseMainOptions();
        while (choice != 9) {
            switch (choice) {
                case 1:
                    System.out.println("filter set by processor");
                    filterByProcessor(filteredNotebooks);
                    break;
                case 2:
                    System.out.println("filter set by ram");
                    filterByRAM(filteredNotebooks);
                    break;
                case 3:
                    System.out.println("filter set by hard drive");
                    filterByHardDrive(filteredNotebooks);
                    break;
                case 4:
                    System.out.println("filter set by gpu");
                    filterByGPU(filteredNotebooks);
                    break;
                case 5:
                    System.out.println("filter set by display");
                    filterByDisplaySize(filteredNotebooks);
                    break;
                case 6:
                    System.out.println("filter set by price");
                    filterByPrice(filteredNotebooks);
                    break;
                case 7:
                    filteredNotebooks.addAll(notebooks);
                    break;
                default:
                    System.out.println("Некорректный аргумент");

            }
            printNotebooks(filteredNotebooks);
            choice = chooseMainOptions();
        }
    }

    private static void printNotebooks(Set<Notebook> filteredNotebooks) {
        int i = 0;
        for (Notebook fn : filteredNotebooks) {
            System.out.println(i++ + ". " + fn);
        }
    }

    static int chooseMainOptions() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Критерии отбора: \n" +
                "1. Processor\n" +
                "2. RAM (Random Access Memory)\n" +
                "3. Hard drive (or SSD)\n" +
                "4. Graphics processor (GPU)\n" +
                "5. Display size\n" +
                "6. Price\n" +
                "7. Сброс\n" +
                "9. Выход\n" +
                "Введите номера критерия: "
        );

        return sc.nextInt();
    }

    static void filterByProcessor(Set<Notebook> notebooks) {
        Set<String> options = new TreeSet<>();
        for (Notebook n : notebooks) {
            options.add(n.getProcessor());
        }
        filterOptions(options);
        notebooks.removeIf(n -> !options.contains(n.getProcessor()));
    }

    static void filterByRAM(Set<Notebook> notebooks) {
        Set<String> options = new LinkedHashSet<>();
        for (Notebook n : notebooks) {
            options.add(n.getRandomAccessMemory());
        }
        filterOptions(options);
        notebooks.removeIf(n -> !options.contains(n.getRandomAccessMemory()));
    }

    static void filterByHardDrive(Set<Notebook> notebooks) {
        Set<String> options = new LinkedHashSet<>();
        for (Notebook n : notebooks) {
            options.add(n.getHardDrive());
        }
        filterOptions(options);
        notebooks.removeIf(n -> !options.contains(n.getHardDrive()));
    }

    static void filterByGPU(Set<Notebook> notebooks) {
        Set<String> options = new TreeSet<>();
        for (Notebook n : notebooks) {
            options.add(n.getGraphicsProcessor());
        }
        filterOptions(options);
        notebooks.removeIf(n -> !options.contains(n.getGraphicsProcessor()));
    }

    static void filterByDisplaySize(Set<Notebook> notebooks) {
        Set<String> options = new LinkedHashSet<>();
        for (Notebook n : notebooks) {
            options.add(n.getDisplaySize());
        }
        filterOptions(options);
        notebooks.removeIf(n -> !options.contains(n.getDisplaySize()));
    }

    static void filterByPrice(Set<Notebook> notebooks) {
        Set<Integer> prices = new TreeSet<>();
        for (Notebook n : notebooks) {
            prices.add(n.getPrice());
        }
        System.out.println(
                "Выбрать значения в пределах от " + Collections.min(prices) + " до " + Collections.max(prices)
        );
        Scanner sc = new Scanner(System.in);
        Set<Integer> priceRange = new TreeSet<>();
        while (priceRange.size() < 2) {
            priceRange.add(sc.nextInt());
            System.out.println("Значения диапазона цен: " + priceRange);
        }
        notebooks.removeIf(n ->
                (n.getPrice() < Collections.min(priceRange)) ||
                        (n.getPrice() > Collections.max(priceRange))
        );
    }

    private static void filterOptions(Set<String> options) {
        List<String> optionsList = new ArrayList<>(options);
        System.out.println("Выбрать опции по номеру:");
        System.out.println(optionsList.size() + " Выход в главное меню");
        for (int i = 0; i < optionsList.size(); i++) {
            System.out.println(i + ". " + optionsList.get(i));
        }

        Set<Integer> optionsNumbs = getOptionsSet(optionsList.size());
        options.clear();
        for (int n : optionsNumbs) {
            options.add(optionsList.get(n));
        }
    }

    private static Set<Integer> getOptionsSet(int size) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbs = new TreeSet<>();
        int choice = sc.nextInt();
        while (choice != size) {
            numbs.add(choice);
            System.out.println("Выбраны опции: " + numbs);
            choice = sc.nextInt();
        }
        return numbs;
    }

}

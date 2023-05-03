public class Main {
    public static void main(String[] args) {
        int eaters = 5; // сколько людей будут есть

        int water = 3000; // миллилитров воды
        int potatoes = 5; // картофелин
        int chiken = 6; // куриных бёдер
        int spices = 10; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eaters) + " миллилитров воды");
        System.out.println((potatoes / eaters) + " картофелина");
        System.out.println((chiken / eaters) + " куриное бёдро");
        System.out.println((spices / eaters) + " ложки специй");
    }
}


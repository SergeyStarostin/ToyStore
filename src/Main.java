import java.util.Scanner;

import view.ToyStoreView;

/**
 * Класс ToyStoreProgram - главная программа для работы с магазином игрушек.
 */
public class Main {
    /**
     * Главный метод для работы с магазином игрушек.
     * 
     * @param addNewToy - добавление новых игрушек.
     * @param updateToyFrequency - изменение частоты выпадения игрушек.
     * @param organizeGiveaway - организация розыгрыша игрушек.
     * @param getPrizeToy - получение приза.
     * @param writePrizeToysToFile - запись в файл информации о выигрыше.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToyStoreView view = new ToyStoreView();

        System.out.println("Добавление новых игрушек: ");
        view.addNewToy(1, "Паровозик", 25);
        System.out.println("Паровозик");

        view.addNewToy(2, "Кукла", 10);
        System.out.println("Кукла");

        view.addNewToy(3, "Шахматы", 20);
        System.out.println("Шахматы");

        view.addNewToy(4, "Конструктор", 50);
        System.out.println("Конструктор");

        view.addNewToy(5, "Мяч", 15);
        System.out.println("Мяч" + "\n");

        System.out.println("Изменение частоты выпадения игрушек: ");
        view.updateToyFrequency(1, 40);
        System.out.println("Частота выпадения игрушки 'Паровозик' установлена на 40");

        view.updateToyFrequency(2, 5);
        System.out.println("Частота выпадения игрушки 'Кукла' установлена на 5");

        view.updateToyFrequency(3, 50);
        System.out.println("Частота выпадения игрушки 'Шахматы' установлена на 50");

        view.updateToyFrequency(4, 15);
        System.out.println("Частота выпадения игрушки 'Конструктор' установлена на 15");

        view.updateToyFrequency(5, 10);
        System.out.println("Частота выпадения игрушки 'Мяч' установлена на 10" + "\n");

        view.organizeWin();
        System.out.println("Розыгрыш призовых игрушек организован! Вы получили: " + view.getPrizeToy().getName());

        view.writeWinToysToFile("gift_toys.txt");
        System.out.println("Призовые игрушки записаны в файл");
    }
}
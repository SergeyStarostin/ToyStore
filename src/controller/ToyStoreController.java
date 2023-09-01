package controller;

import model.Toy;
import model.ToyStore;

/**
 * Класс ToyStoreController для управления магазином игрушек.
 */
public class ToyStoreController {
    private ToyStore toyStore;

    /**
     * Конструктор класса ToyStoreController.
     */
    public ToyStoreController() {
        toyStore = new ToyStore();
    }

    /**
     * Метод для добавления игрушки в магазин.
     *
     * @param toy - добавленная в магазин игрушка.
     */
    public void addToy(Toy toy) {
        toyStore.addToy(toy);
    }

    /**
     * updateFrequency - метод для обновления частоты выпадения игрушки по ее
     * идентификатору.
     *
     * @param toyId     - идентификатор игрушки.
     * @param frequency - частота выпадения игрушки.
     */
    public void updateFrequency(int toyId, int frequency) {
        toyStore.updateFrequency(toyId, frequency);
    }

    /**
     * organizeWin - метод для организации розыгрыша игрушек.
     */
    public void organizeWin() {
        toyStore.organizeWin();
    }

    /**
     * getPrizeToy - метод для получения призовой игрушки.
     *
     * @return призовая игрушка.
     */
    public Toy getPrizeToy() {
        return toyStore.getPrizeToy();
    }

    /**
     * writeWinToysToFile - метод для записи призовых игрушек в файл.
     *
     * @param filename - имя файла для записи.
     */
    public void writeWinToysToFile(String filename) {
        toyStore.writeWinToysToFile(filename);
    }
}
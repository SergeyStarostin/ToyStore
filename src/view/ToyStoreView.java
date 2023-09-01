package view;

import controller.ToyStoreController;
import model.Toy;

/**
 * ToyStoreView - класс визуализации розыгрыша в магазине игрушек.
 */
public class ToyStoreView {
    private ToyStoreController controller;

    /**
     * Конструктор класса ToyStoreView.
     */
    public ToyStoreView() {
        controller = new ToyStoreController();
    }

    /**
     * Метод для добавления новой игрушки в магазин.
     *
     * @param id        - идентификатор новой игрушки.
     * @param name      - название новой игрушки.
     * @param frequency - частота выпадения новой игрушки.
     */
    public void addNewToy(int id, String name, int frequency) {
        Toy toy = new Toy(id, name, frequency);
        controller.addToy(toy);
    }

    /**
     * updateToyFrequency - метод для обновления частоты игрушки по ее ID.
     *
     * @param toyId     - ID игрушки, частоту которой нужно обновить.
     * @param frequency - новая частота игрушки.
     */
    public void updateToyFrequency(int toyId, int frequency) {
        controller.updateFrequency(toyId, frequency);
    }

    /**
     * organizeWin - метод для розыгрыша призовых игрушек, с учетом их частоты
     * выпадения.
     */
    public void organizeWin() {
        controller.organizeWin();
    }

    /**
     * getPrizeToy - метод для получения призовой игрушки.
     *
     * @return призовая игрушка.
     */
    public Toy getPrizeToy() {
        return controller.getPrizeToy();
    }

    /**
     * writeWinToysToFile - метод для записи призовых игрушек в файл.
     *
     * @param filename - имя файла, в который записываются призовые игрушки.
     */
    public void writeWinToysToFile(String filename) {
        controller.writeWinToysToFile(filename);
    }
}
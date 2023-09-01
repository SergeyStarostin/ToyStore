package model;

/**
 * Toy - класс, описывающий игрушки в магазине.
 */
public class Toy {
    private int id;
    private String name;
    private int frequency;

    /**
     * Конструктор класса Toy.
     *
     * @param id        - идентификатор игрушки.
     * @param name      - название игрушки.
     * @param frequency - частота появления игрушки в розыгрыше.
     */
    public Toy(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    /**
     * getId - метод для получения ID игрушки.
     *
     * @return ID игрушки.
     */
    public int getId() {
        return id;
    }

    /**
     * Метод для получения названия игрушки.
     *
     * @return getName - название игрушки.
     */
    public String getName() {
        return name;
    }

    /**
     * getFrequency - метод для получения частоты появления игрушки в розыгрыше.
     *
     * @return частота появления игрушки в розыгрыше.
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * setFrequency - метод для обновления частоты появления игрушки в розыгрыше.
     *
     * @param frequency - новая частота появления игрушки в розыгрыше.
     */
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
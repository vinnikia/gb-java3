package lesson1;

import java.util.*;

public class Task1 {

    //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public <T> List<T> exchangeIndexes(List<T> array, int i1, int i2) {
        List<T> a2 = new LinkedList<>(array);
        a2.set(i1, array.get(i2));
        a2.set(i2, array.get(i1));
        return a2;
    }

}

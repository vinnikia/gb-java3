package lesson1;

import java.util.*;

//Написать метод, который преобразует массив в ArrayList;

public class Task2 {
    public <T> ArrayList<T> arrayToArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}

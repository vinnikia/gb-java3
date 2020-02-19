package lesson1;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Task1 t1 = new Task1();

        List<String> animals = new LinkedList<>();
        animals.add("beaver");
        animals.add("platypus");
        System.out.println(animals);
        animals = t1.exchangeIndexes(animals, 0, 1);
        System.out.println(animals);

        List<Integer> ages = new LinkedList<>();
        ages.add(12);
        ages.add(63);
        System.out.println(ages);
        ages = t1.exchangeIndexes(ages, 0, 1);
        System.out.println(ages);


        Task2 t2 = new Task2();
        String[] arrayOfStrings = {"String1", "String2", "String3"};
        ArrayList<String> arrayListOfStrings = t2.arrayToArrayList(arrayOfStrings);
        System.out.println(arrayListOfStrings);

        //First box with 3 apples
        Box<Apple> b1 = new Box<>();
        b1.addFruit(new Apple());
        b1.addFruit(new Apple());
        b1.addFruit(new Apple());

        //Second box with 4 apples
        Box<Apple> b2 = new Box<>();
        b2.addFruit(new Apple());
        b2.addFruit(new Apple());
        b2.addFruit(new Apple());
        b2.addFruit(new Apple());

        //Third box with 2 oranges
        Box<Orange> b3 = new Box<>();
        b3.addFruit(new Orange());
        b3.addFruit(new Orange());

        //Fourth empty Orange Box
        Box<Orange> b4 = new Box<>();

        System.out.println("Compare First and Second boxes");
        System.out.println(b1.compare(b2));

        System.out.println("Compare First and Third boxes (Orange and Apple)");
        System.out.println(b1.compare(b3));

        System.out.println("Fill from Third to Fourth box");
        b3.fillOtherBox(b4);
        //b1.fillOtherBox(b4); - mistake, can't fill orange box with apples
        System.out.println("Fourth box weight now:");
        System.out.println(b4.getWeight());
        System.out.println("And Third box should be empty:");
        System.out.println(b3.getWeight());

    }
}

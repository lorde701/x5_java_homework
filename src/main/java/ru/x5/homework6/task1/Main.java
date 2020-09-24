package ru.x5.homework6.task1;

public class Main {
    public static void main(String[] args) {
        CustomList<String> stringList = new CustomArrayList<>();
        stringList.add("qwe31");
        stringList.add("qwe2");
        stringList.add("qwe1");
        stringList.add("qwe6");
        stringList.printElements();
        System.out.println("размер: " + stringList.size());
        stringList.remove(0);
        stringList.printElements();
        System.out.println("размер: " + stringList.size());
        stringList.add("sasd");
        stringList.printElements();
        System.out.println("размер: " + stringList.size());
        stringList.remove("qwe1");
        stringList.printElements();
        System.out.println("размер: " + stringList.size());
        System.out.println(stringList.get(1));
        stringList.clear();
        stringList.printElements();
        System.out.println("размер: " + stringList.size());
        stringList.add("sassdad");
        stringList.printElements();
        System.out.println("размер: " + stringList.size());
        stringList.remove("werwefw");
        stringList.printElements();
        System.out.println("размер: " + stringList.size());
    }
}

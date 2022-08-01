package com.cnt;

public class Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        Class<? extends Car> aClass1 = car1.getClass();
        System.out.println(aClass1.hashCode());

        ClassLoader classLoader = aClass1.getClassLoader();
        System.out.println(classLoader); //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(classLoader.getParent()); //sun.misc.Launcher$ExtClassLoader@1540e19d
        System.out.println(classLoader.getParent().getParent()); //null

    }
}

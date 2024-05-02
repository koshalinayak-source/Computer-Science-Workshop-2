package GenericsAndCollectionPart2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Car implements Comparable<Car>{
    private int ModelNo;
    private String name;
    private int stock;

    public Car(int modelNo, String name, int stock) {
        ModelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    public int getModelNo() {
        return ModelNo;
    }

    public void setModelNo(int modelNo) {
        ModelNo = modelNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int compareTo(Car car){
        return Integer.compare(this.stock,car.stock);
    }


}

public class Q3 {
    public static void main(String[] args) {
        /*
        Write a Java code snippet that comprises of a Car class
        and a CarApp class. The Car class should define private
        fields for ModalNo(int), name(string) and stock(int).
        Define a parameterised constructor and override the
        compareTo method as public int compareTo(Car car) to
        sort the car on basis of the total number of stock.
        Create an ArrayList of Car objects and print the updated the sorted list.
        For example the list of sorted Car Objects
         2013 creta 10
         2020 MG 13
         2018 Kia 20
         2017 Audi 45
         2015 BMW 55
         */

        ArrayList<Car> arr = new ArrayList<>();
        arr.add(new Car(2013,"creta",10));
        arr.add(new Car(2020,"MG",13));
        arr.add(new Car(2018,"Kia",20));
        arr.add(new Car(2017,"Audi",45));
        arr.add(new Car(2015,"BMW",55));
        Collections.sort(arr);
        System.out.println("print the sorted list");

        for (Car c : arr){
            System.out.println(c.getModelNo()+" "+c.getName()+" "+c.getStock());
        }

    }
}

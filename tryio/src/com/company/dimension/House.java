package com.company.dimension;

public class House implements Comparable<House>{

    int number;

    public House(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                '}';
    }

    public int compareTo(House anotherHouse) {
        if (this.number==anotherHouse.number){
            return 0;
        } else if (this.number>anotherHouse.number){
            return 1;
        } else return -1;
    }
}

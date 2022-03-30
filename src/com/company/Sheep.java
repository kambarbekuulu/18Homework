package com.company;

public class Sheep extends  Animal{
    @Override
    public String toString() {
        return "Sheep " + super.toString();
    }

    public Sheep(int weight, int age, String nickName, String gender) {
        super(weight, age, nickName, gender);

    }
}

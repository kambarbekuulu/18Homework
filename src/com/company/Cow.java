package com.company;

public class Cow extends Animal{
    @Override
    public String toString() {
        return "Cow " + super.toString();
    }

    public Cow(int weight, int age, String nickName, String gender) {
        super(weight, age, nickName, gender);
    }
}

package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        ;

       Cow cow1 = new Cow(109,4,"ala","erkek");
       Cow cow2 = new Cow(123,3,"mala","erkek");
       Cow cow3 = new Cow(231,6,"kashka","erkek");
       Cow cow4 =new Cow(150,5,"chon muiuz","erkek");
       Cow cow = new Cow(121,1,"tokol","erkek");

       Horse horse1 =new Horse(178,7,"kara kashka","colt","black");
       Horse horse2= new Horse(165,8,"Boika","stallion","grey");
       Horse horse3 = new Horse(145,7,"Shtorym","gelding","jerde kashka");

       Sheep sheep1 = new Sheep(32 ,3,"aianbash","Samest");
       Sheep sheep2 = new Sheep(32,2,"kashka","Chuiski");
       Sheep sheep3 = new Sheep(34, 1,"kichine","Mitiz");



        Farm farm1 = new Farm("Kara-koi",new Cow[]{cow4,cow,cow1,cow2,cow3},
                new Horse[]{horse1,horse2,horse3},new Sheep[]{sheep1,sheep2,sheep3},"Said");
        Farm farm2 = new Farm("Nookat",new Cow[]{cow1},new Horse[]{horse1},new Sheep[]{sheep1},"Myrza");

        System.out.println("Farm1"+farm1);
        System.out.println("Farm2"+farm2);
    }
}




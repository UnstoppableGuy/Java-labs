package com.company;


public class SweetFactory {
    public  static NutritionalValue getInstance(FoodType foodType, int weight)
    {
            switch (foodType)
            {
                case BAR:
                    return new Bar(1000, 1150,1250,weight,"black", (byte)60);
                case CRACKER:
                    return  new Cracker(300, 400,500,weight,true,false);
                case LOLLIPOP:
                    return new Lollipop(700, 800,200,weight,"yellow",true);
                default:
                    return null;
            }
    }
}

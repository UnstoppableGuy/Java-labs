package com.company;


import java.util.ArrayList;

public class GiftBox{
    private ArrayList<NutritionalValue> giftbox;
    public GiftBox()
    {
        giftbox = new ArrayList<>();
    }
    public void addToGift(NutritionalValue nutritionalValue){
        giftbox.add(nutritionalValue);
    }

    public ArrayList<NutritionalValue> getGiftbox() {
        return giftbox;
    }
    public int getSummaryWeight(){
        int weitght = 0 ;
        for (NutritionalValue nutritionalValue : giftbox){
            weitght+=nutritionalValue.getWeight();
        }
        return  weitght;
    }
    public float getSummaryProteins(){
        float proteints = 0;
        for (NutritionalValue nutritionalValue : giftbox){
            proteints+=(nutritionalValue.getWeight()/100 * nutritionalValue.getProteins());
            //System.out.println(proteints);
        }
        return  proteints;
    }
    public float getSummaryCarbohydrates(){
        float carbohydrates = 0;
        for (NutritionalValue nutritionalValue : giftbox){
            carbohydrates+=(nutritionalValue.getWeight()/100 * nutritionalValue.getCarbohydrates());
            //System.out.println(carbohydrates);
        }
        return  carbohydrates;
    }
    public float getSummaryFats(){
        float fats = 0;
        for (NutritionalValue nutritionalValue : giftbox){
            fats+=(nutritionalValue.getWeight()/100 * nutritionalValue.getFats());
            //System.out.println(fats);
        }
        return  fats;
    }
}

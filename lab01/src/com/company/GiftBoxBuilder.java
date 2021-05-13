package com.company;

public class GiftBoxBuilder {

    private GiftBox giftBox;
    public GiftBoxBuilder(){giftBox = new GiftBox();}
    public GiftBox getGiftBox(){return giftBox;}

    public void setGiftBox(FoodType foodType, int weight) {
        giftBox.addToGift(SweetFactory.getInstance(foodType,weight));
    }

    public static void main(String[] args) {
        GiftBoxBuilder builder = new GiftBoxBuilder();
        builder.setGiftBox(FoodType.BAR,120);
        builder.setGiftBox(FoodType.CRACKER,1450);
        builder.setGiftBox(FoodType.LOLLIPOP,250);

        GiftBox box = builder.getGiftBox();

        System.out.printf("Суммарный вес подарка составил: %d грамм\n",box.getSummaryWeight());
        System.out.println("Энергетическая ценность данного подарка составила:");
        System.out.printf("Протеинов: %.2f Дж\n",box.getSummaryProteins());
        System.out.printf("Углеводов: %.2f Дж\n",box.getSummaryCarbohydrates());
        System.out.printf("Жиров: %.2f Дж\n ",box.getSummaryFats());
    }
}

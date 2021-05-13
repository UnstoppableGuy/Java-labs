package com.company;

abstract class Chocolate extends NutritionalValue
{
    private String _filling;
    private byte _content;

    public void setFilling(String filling){
        _filling = filling;
    }

    public void setContent(byte content){
        if (content<=100 && content >= 0)
            _content = content;
        else
            _content = 0;
    }

    public String getFilling(){
        return _filling;
    }

    public byte getContent(){
        return _content;
    }

    Chocolate(int proteins, int fats, int carbohydrates, int weight, String color, byte content) {
        super(proteins, fats, carbohydrates, weight);
        setFilling(color);
        setContent(content);
    }
}
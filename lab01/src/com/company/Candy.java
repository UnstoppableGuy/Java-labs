package com.company;

abstract class Candy extends  NutritionalValue
{
    private String _color;
    private boolean _shell;

    public void setColor(String color){
        _color = color;
    }

    public void setShell(boolean shell)
    {
        _shell = shell;
    }

    public String getColor(){
        return _color;
    }

    public boolean getShell(){
        return _shell;
    }

    Candy(int proteins, int fats, int carbohydrates, int weight,String color, boolean shell) {
        super(proteins, fats, carbohydrates, weight);
        setColor(color);
        setShell(shell);
    }
}

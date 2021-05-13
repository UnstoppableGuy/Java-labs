package com.company;

abstract class Biscuit extends NutritionalValue
{
    private boolean _sweet;
    private boolean _shell;

    public void setShell(boolean shell){
        _shell=shell;
    }

    public void setSweet(boolean sweet){
        _sweet = sweet;
    }

    public boolean getShell(){
        return _shell;
    }

    public boolean getSweet(){
        return _sweet;
    }

    Biscuit(int proteins, int fats, int carbohydrates, int weight, boolean sweet, boolean shell) {
        super(proteins, fats, carbohydrates, weight);
        setShell(shell);
        setSweet(sweet);
    }
}

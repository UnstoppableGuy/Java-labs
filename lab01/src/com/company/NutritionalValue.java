package com.company;

abstract class NutritionalValue {
    private int _proteins;
    private int _fats;
    private int _carbohydrates;
    private int _weight;

    public void setProteins(int proteins) {
        if (proteins > 0 && proteins < 1500)
            _proteins = proteins;
        else
            _proteins = 0;
    }

    public void setFats(int fats) {
        if (fats > 0 && fats < 1500)
            _fats = fats;
        else
            _fats = 0;
    }

    public void setCarbohydrates(int carbohydrates) {
        if (carbohydrates > 0 && carbohydrates < 1500)
            _carbohydrates = carbohydrates;
        else
            _carbohydrates = 0;
    }

    public void setWeight(int weight) {
        if (weight > 0)
            _weight = weight;
        else
            _weight = 0;
    }

    public int getProteins() {
        return _proteins;
    }

    public int getCarbohydrates() {
        return _carbohydrates;
    }

    public int getFats() {
        return _fats;
    }

    public int getWeight() {
        return _weight;
    }

    NutritionalValue(int proteins, int fats, int carbohydrates, int weight) {
        setProteins(proteins);
        setFats(fats);
        setCarbohydrates(carbohydrates);
        setWeight(weight);
    }
}

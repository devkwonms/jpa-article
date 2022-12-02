package com.jpa.jparticle.ioc;

public class IngredientFactory {
    public Ingredient get(String menu) {
        switch (menu){
            case "돈가스":
                return new Pork("한돈 등심");
            case "스테이크":
                return new Beef("한우 꽃등심");
            default:
                return null;
        }
    }
}

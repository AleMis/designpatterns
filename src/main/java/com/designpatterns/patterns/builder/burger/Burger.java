package com.designpatterns.patterns.builder.burger;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    private static final String ROLL_WITH_SESAME = "Roll with sesame";
    private static final String PLAIN_ROLL = "Plain roll";

    private static final String SAUCE_STANDARD = "Standard sauce";
    private static final String SAUCE_1000 = "1000 islands sauce";
    private static final String SAUCE_BARBECUE = "Barbecue sauce";

    private static final String SALAT = "Salat";
    private static final String ONION = "Onion";
    private static final String BECON = "Becon";
    private static final String CUCUMBER = "Cucumber";
    private static final String CHILI = "Chili pepper";
    private static final String MUSHROOMS = "Mushrooms";
    private static final String SHRIMP = "Shrimp";
    private static final String CHEESE = "Cheese";

    private String roll;
    private int burgers;
    private String sauce;
    private List<String> ingredients;

    public Burger(String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BurgerBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BurgerBuilder roll(String roll) {
            if(roll.equals(ROLL_WITH_SESAME) || roll.equals(PLAIN_ROLL)) {
                this.roll = roll;
            }else {
                throw new IllegalStateException("You can choose only: " + ROLL_WITH_SESAME + " or " + PLAIN_ROLL);
            }
            return this;
        }

        public BurgerBuilder burgers(int burgers) {
            if(burgers < 0) {
                throw new IllegalStateException("Your burger should have meat!");
            }else {
                this.burgers = burgers;
            }
            return this;
        }

        public BurgerBuilder sauce(String sauce) {
            if(sauce.equals(SAUCE_STANDARD) || sauce.equals(SAUCE_1000) || sauce.equals(SAUCE_BARBECUE)) {
                this.sauce = sauce;
            }else {
                throw new IllegalStateException("You can choose only: " + SAUCE_STANDARD + ", " + SAUCE_BARBECUE + " or" + SAUCE_1000);
            }
            return this;
        }

        public BurgerBuilder ingredients(String ingredient) {
            if(checkIngredients(ingredient)) {
                ingredients.add(ingredient);
            }else {
                throw new IllegalStateException("Incorrect choice! Available ingredients are: Salat, Onion, Becon, Cucumber, Chili pepper, Mushrooms, Shrimp and Cheese");
            }
            return this;
        }

        public Burger build() {
            return new Burger(roll, burgers,sauce,ingredients);
        }

        private boolean checkIngredients(String ingredient) {
            boolean check = false;
            List<String> availableIngredients = availableIngredients();
            for(String ing : availableIngredients) {
                if(ing.contains(ingredient)) {
                    check = true;
                }
            }
            return check;
        }

        private List<String> availableIngredients() {
            List<String> ingredientsList = new ArrayList<>();
            ingredientsList.add(SALAT);
            ingredientsList.add(ONION);
            ingredientsList.add(BECON);
            ingredientsList.add(CUCUMBER);
            ingredientsList.add(CHILI);
            ingredientsList.add(MUSHROOMS);
            ingredientsList.add(SHRIMP);
            ingredientsList.add(CHEESE);
            return ingredientsList;
        }
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Burger [");
        sb.append(" Roll: ");
        sb.append(roll);
        sb.append("; Burgers: x");
        sb.append(burgers);
        sb.append("; Sauce: ");
        sb.append(sauce);
        sb.append("; Ingredients: ");
        sb.append(ingredients + " ");
        sb.append(" ]");
        return sb.toString();
    }
}

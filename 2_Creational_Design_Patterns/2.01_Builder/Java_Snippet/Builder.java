
// Create a Pizza maker and allow options to choose Base, Sauce and Topping
import java.util.*;

class PizzaMaker {
        private String base;
        private String sauce;
        private List<String> toppings;

        public PizzaMaker(boolean isThinCrust, boolean isPanCrust,
                        boolean hasTomatoSauce, boolean hasBbqSauce,
                        boolean hasTomato, boolean hasPepper, boolean hasMushrooms) {
                this.toppings = new ArrayList<String>();
                if (isThinCrust)
                        this.base = "thin crust";
                if (isPanCrust)
                        this.base = "pan crust";
                if (hasTomatoSauce)
                        this.sauce = "tomato";
                if (hasBbqSauce)
                        this.sauce = "bbq";
                if (hasTomato)
                        this.toppings.add("tomato");
                if (hasPepper)
                        this.toppings.add("pepper");
                if (hasMushrooms)
                        this.toppings.add("mushroom");
        }

        @java.lang.Override
        public java.lang.String toString() {
                return String.format("Pizza with %s base, %s sauce and %s toppings", base, sauce,
                                String.join(", ", toppings));
        }

        public static void main(String[] args) {
                PizzaMaker pizzaMaker = new PizzaMaker(true, false, true, false, true, true, false);
                System.out.println(pizzaMaker);
        }
}

// with to add more toppings the number of parameters will increase
// we use builder to solve this
class Pizza {

        private final String base;
        private final String sauce;
        private final List<String> toppings;

        private Pizza(String base, String sauce, List<String> toppings) {
                this.base = base;
                this.sauce = sauce;
                this.toppings = toppings;
        }

        @Override
        public String toString() {
                return String.format("Pizza with %s base, %s sauce and %s toppings", base, sauce,
                                String.join(", ", toppings));
        }

        public static class PizzaBuilder {

                private String base;
                private String sauce;
                private final List<String> toppings = new ArrayList<>();

                public PizzaBuilder setBase(String base) {
                        this.base = base;
                        return this;
                }

                public PizzaBuilder setSauce(String sauce) {
                        this.sauce = sauce;
                        return this;
                }

                public PizzaBuilder addTopping(String topping) {
                        toppings.add(topping);
                        return this;
                }

                public Pizza build() {
                        if (base == null || sauce == null) {
                                throw new IllegalArgumentException("Pizza must have base and sauce!");
                        }
                        return new Pizza(base, sauce, toppings);
                }
        }

        public static void main(String[] args) {
                PizzaBuilder pizzaBuilder = new PizzaBuilder();
                Pizza vegPizza = pizzaBuilder.setBase("Thin Crust")
                                .setSauce("Tomato")
                                .addTopping("Olive")
                                .addTopping("Tomato")
                                .addTopping("Cheese")
                                .addTopping("Pepper")
                                .build();

                System.out.println(vegPizza);
        }
}
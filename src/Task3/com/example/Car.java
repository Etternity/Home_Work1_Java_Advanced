package Task3.com.example;

    public class Car implements Comparable<Car> {
        int speed;
        int price;
        String model;
        String color;

        Car(int speed, int price, String model, String color) {
            this.speed = speed;
            this.price = price;
            this.model = model;
            this.color = color;
        }

        public String toString() {
            return this.model + " " + this.color + " " + this.speed + " " + this.price;
        }

        public int compareTo(Car other) {
            int speedComparison = Integer.compare(this.speed, other.speed);
            if (speedComparison != 0) {
                return speedComparison;
            }

            int priceComparison = Integer.compare(this.price, other.price);
            if (priceComparison != 0) {
                return priceComparison;
            }

            int modelComparison = this.model.compareTo(other.model);
            if (modelComparison != 0) {
                return modelComparison;
            }

            return this.color.compareTo(other.color);
        }
    }


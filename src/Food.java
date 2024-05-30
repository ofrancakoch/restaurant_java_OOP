public class Food {
    public String nameFood;
    public double value;

    public Food(double value, String nameFood) {
        this.value = value;
        this.nameFood = nameFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

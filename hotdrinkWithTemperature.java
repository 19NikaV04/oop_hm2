public class hotdrinkWithTemperature extends hotdrink {
    
    private int temperature;

    public hotdrinkWithTemperature(String name, int valume, int temperature) {
        super(name, valume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
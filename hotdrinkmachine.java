public class hotdrinkmachine implements vendingMachine {
    
    @Override

    public void getProduct() {
        // Логика получения продукта
    }

    public hotdrinkWithTemperature getProduct(String name, int valume, int temperature) {
        return new hotdrinkWithTemperature(name, valume, temperature);
    }
}

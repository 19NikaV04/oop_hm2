public class main {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        hotdrinkWithTemperature hotdrink1 = new hotdrinkWithTemperature("Горячий шоколад", 250, 80);
        hotdrinkWithTemperature hotdrink2 = new hotdrinkWithTemperature("Кофе", 150, 70);
        hotdrinkWithTemperature hotdrink3 = new hotdrinkWithTemperature("Чай", 200, 60);
    
        hotdrinkmachine hotdrinkmachine = new hotdrinkmachine();
        hotdrinkWithTemperature product1 = hotdrinkmachine.getProduct("Горячий шоколад", 250, 80);
        hotdrinkWithTemperature product2 = hotdrinkmachine.getProduct("Кофе", 150, 70);
        hotdrinkWithTemperature product3 = hotdrinkmachine.getProduct("Чай", 200, 60);
    }
}

package Day06;

public class Americano extends Coffee {
    private String name;

    public Americano(String size, int price) {
        super(size, price);
        this.name = "아메리카노";
    }

    public String getName() {
        return name;
    }
}

public class Product {
    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public void reducePrice(int amount) {
        int totalCents = price.getWholePart() * 100 + price.getFractionalPart();
        totalCents -= amount;
        price.setWholePart(totalCents / 100);
        price.setFractionalPart(totalCents % 100);
    }

    public void increasePrice(int amount) {
        int totalCents = price.getWholePart() * 100 + price.getFractionalPart();
        totalCents += amount;
        price.setWholePart(totalCents / 100);
        price.setFractionalPart(totalCents % 100);
    }

    public void display() {
        System.out.print("Product: " + name + ", ");
        price.display();
    }
}

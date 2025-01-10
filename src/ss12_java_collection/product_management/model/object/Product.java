package ss12_java_collection.product_management.model.object;

public class Product {
    private int id;
    private String name;
    private double price;
    private String address;

    public Product() {
    }

    public Product(int id, String name, double price, String address) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

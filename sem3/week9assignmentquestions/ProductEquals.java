
// Topic 2: equals() vs ==
// File: ProductEquals.java

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product other = (Product) obj;
        return productId.equals(other.productId);
    }

    public String toString() {
        return productId + " - " + productName;
    }
}

public class ProductEquals {
    public static void main(String[] args) {
        Product p1 = new Product("P101", "Laptop");
        Product p2 = new Product("P101", "Gaming Laptop");

        System.out.println("Using == : " + (p1 == p2));
        System.out.println("Using equals() : " + p1.equals(p2));
    }
}

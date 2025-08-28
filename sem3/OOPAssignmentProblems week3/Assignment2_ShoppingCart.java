class Product {
    private static int counter=0,totalProducts=0;
    String productId,productName,category; double price; int stockQuantity;
    public Product(String name,double price,String cat,int qty){
        this.productId="P"+(++counter); this.productName=name; this.price=price; this.category=cat; this.stockQuantity=qty; totalProducts++;
    }
}

class ShoppingCart {
    String cartId,customerName; Product[] products; int[] quantities; double cartTotal; int count=0;
    public ShoppingCart(String id,String name){ this.cartId=id; this.customerName=name; products=new Product[20]; quantities=new int[20]; }
    public void addProduct(Product p,int q){ products[count]=p; quantities[count]=q; cartTotal+=p.price*q; count++; }
    public void displayCart(){ for(int i=0;i<count;i++){ System.out.println(products[i].productName+" x"+quantities[i]); } System.out.println("Total:"+cartTotal); }
}

public class Assignment2_ShoppingCart {
    public static void main(String[] args){
        Product p1=new Product("Laptop",50000,"Electronics",10);
        Product p2=new Product("Book",500,"Stationery",50);
        ShoppingCart cart=new ShoppingCart("C1","John");
        cart.addProduct(p1,1); cart.addProduct(p2,2);
        cart.displayCart();
    }
}
package concepts.oop.principles.getsetters.product;

public class Product {
    private String name;
    private String description;
    private Double price;
    private boolean inStock;

    @Override
    public String toString(){
        return "Name: " + name + "\nDescription: " + description + "\nPrice: " + price + "\nInStock: " + inStock;
    }

    //Setters

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            System.out.println("Name Not Specified");
        }
        this.name = name;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        validatePrice(price);
        this.price = price;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public Product(String name, String description, Double price, boolean inStock) {
        setName(name);
        this.description = description;
        setPrice(price);
        this.inStock = inStock;
    }
    private void validatePrice(Double price){
        if(price < 0.0){
            throw new  IllegalArgumentException("Invalid Price");
        }
    }
}
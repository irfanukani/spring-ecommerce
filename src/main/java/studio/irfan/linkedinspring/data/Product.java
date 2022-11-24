package studio.irfan.linkedinspring.data;

import javax.persistence.*;

@Table
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private Long Product_Id;
    @Column(name = "NAME")
    private String Name;
    @Column(name = "PRICE")
    private float Price;
    @Column(name = "DESCRIPTION")
    private String Description;
    @Column(name = "QUANTITY")
    private int Quantity;

    public Product() {
    }

    public Product(Long product_Id, String name, float price, String description, int QUANTITY) {
        Product_Id = product_Id;
        Name = name;
        Price = price;
        Description = description;
        this.Quantity = QUANTITY;
    }

    public Long getProduct_Id() {
        return Product_Id;
    }

    public void setProduct_Id(Long product_Id) {
        Product_Id = product_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getQUANTITY() {
        return Quantity;
    }

    public void setQUANTITY(int Quantity) {
        this.Quantity = Quantity;
    }
}

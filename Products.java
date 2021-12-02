package com.company.Thursday2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Products {
    int serialno;
    String name;
    int quantity;
    double price;
    static Scanner sc=new Scanner(System.in);
   static List<Products> products=new ArrayList<>();
   static Products product;

    public Products(int serialno, String name, int quantity, double price) {
        this.serialno = serialno;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getSerialno() {
        return serialno;
    }

    public void setSerialno(int serialno) {
        this.serialno = serialno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "serialno=" + serialno +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
    public static void main(String[] args)
    {
        int choice=0;
        do{
        System.out.println("Enter your choice\n1.Addproducts\n2.Searchproducts\n3.Editproducts\n4.Removeproducts\n5.exit");
        choice=sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Add products");
                    addProducts();
                    break;
                }
                case 2: {
                    System.out.println("Search whether product is their");
                    searchProduct(products);
                    break;
                }
                case 3:
                {
                    editProduct(products);
                    break;
                }
                case 4:
                {
                    removeProduct(products);
                    break;
                }
                case 5:System.out.println("Exiting.....");

            }
        }while(choice!=5);


    }

    private static void removeProduct(List<Products> products) {
        System.out.println("Enter the product to be removed");
        String name=sc.next();
        for(int i=0;i< products.size();i++)
        {
            product=products.get(i);
            if(product.getName().equals(name))
            {
                products.remove(product);
                System.out.println("Removed succesfully");
                System.out.println(products);
            }
        }

    }

    private static void editProduct(List<Products> products) {
        System.out.println("Enter the product name to be edited");
        String name=sc.next();
        for(int i=0;i< products.size();i++)
        {
            product=products.get(i);
            if(product.getName().equals(name))
            {
                System.out.println("Enter price to be edited");
                int price=sc.nextInt();
                product.setPrice(price);
                System.out.println(product);
            }

        }
    }

    private static void searchProduct(List<Products> products) {
        System.out.println("Enter the name of the product to be searched");
        String name=sc.next();
        for(int i=0;i<products.size();i++)
        {
            product=products.get(i);
            if(product.getName().equals(name))
            {
                System.out.println(product);
            }
        }
    }


    private static void addProducts() {
        System.out.println("Enter the serial number");
        int serialno=sc.nextInt();
        System.out.println("Enter product name");
        String name=sc.next();
        System.out.println("Enter quantity");
        int quantity=sc.nextInt();
        System.out.println("Enter price of product");
        double price=sc.nextDouble();
        product=new Products(serialno,name,quantity,price);
        products.add(product);
        System.out.println("Added succesfully");

    }
}


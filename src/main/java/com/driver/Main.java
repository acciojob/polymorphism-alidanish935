package com.driver;

public class Main {
    
    public static void main(String[] args) {
        Product p = new Product();
        p.Product(5, 4);
        p.Product(5, 3, 2);
        p.Product(5, 7);

    }
    public static class Product{
        public int Product(int x,int y){
            return x*y;
        }
        public int Product(int x,int y,int z){
            return x*y*z;
        }
        public double Product(double x,double y){
            return x*y;
        }
    }
}
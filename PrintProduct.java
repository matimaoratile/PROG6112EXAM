/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progexam;

import java.text.DecimalFormat;

/**
 *
 * @author Student
 */


//CODE ASSISTED BY META AI//

public class PrintProduct {
     
    private final Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    public void printHeader() {
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("*****************************************");
    }

    public void printTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void printAverageProductSales() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("AVERAGE PRODUCT SALES: " + df.format(product.GetAverageProductSold()));
    }

    public void printMostPopularProductSale() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct()
                + " (" + product.GetMostPopularProductTotal() + ")");
    }
}
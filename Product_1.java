/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
package com.mycompany.progexam;
//CODE ASSISTED BY THE HELP OF GROK AI//
public class Product implements IProduct {

    private final String[] productNames;   // single-dimensional array
    private final int[][] monthlySales;    // two-dimensional array [product][month]

    public Product(String[] productNames, int[][] monthlySales) {
        this.productNames = productNames;
        this.monthlySales = monthlySales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int p = 0; p < monthlySales.length; p++) {
            for (int m = 0; m < monthlySales[p].length; m++) {
                total += monthlySales[p][m];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int count = 0;
        for (int p = 0; p < monthlySales.length; p++) {
            count += monthlySales[p].length;
        }
        if (count == 0) {
            return 0;
        }
        return (double) GetTotalProductsSold() / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int bestIndex = 0;
        int bestTotal = -1;
        for (int p = 0; p < monthlySales.length; p++) {
            int productTotal = GetProductTotal(p);
            if (productTotal > bestTotal) {
                bestTotal = productTotal;
                bestIndex = p;
            }
        }
        return productNames[bestIndex];
    }

    public int GetMostPopularProductTotal() {
        int best = 0;
        for (int p = 0; p < monthlySales.length; p++) {
            int productTotal = GetProductTotal(p);
            if (productTotal > best) {
                best = productTotal;
            }
        }
        return best;
    }

    private int GetProductTotal(int productIndex) {
        int sum = 0;
        for (int m = 0; m < monthlySales[productIndex].length; m++) {
            sum += monthlySales[productIndex][m];
        }
        return sum;
    }
}

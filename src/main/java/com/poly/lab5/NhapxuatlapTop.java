/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab5;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author TUONG VY
 */
public class NhapxuatlapTop {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Laptop> list = new ArrayList<>();

        String tiepTuc;

        do {
            Laptop laptop = new Laptop();
            laptop.input();
            list.add(laptop);

            System.out.print("Tiep tuc nhap? (y/n): ");
            tiepTuc = sc.nextLine();

        } while (tiepTuc.equalsIgnoreCase("y"));

        System.out.println("\nDANH SACH LAPTOP (" + list.size() + " may)");

        for (int i = 0; i < list.size(); i++) {
        list.get(i).output();
}
    }
}

    
    
    

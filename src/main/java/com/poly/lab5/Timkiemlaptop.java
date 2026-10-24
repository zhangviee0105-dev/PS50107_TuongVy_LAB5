/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TUONG VY
 */
public class Timkiemlaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();
        double min, max;
        String keyword;
        boolean timThay = false;
        
        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));
        
        System.out.print("Nhap gia min: ");
        min = sc.nextDouble();
        System.out.print("Nhap gia max: ");
        max = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap keyword: ");
        keyword = sc.nextLine();
        
        if (min > max) {
            System.out.println("Khoang gia khong hop le");
        }
        else {
            System.out.printf(" LAPTOP GIA TU %.1f DEN %.1f \n", min, max);
            for (Laptop laptop : list) {
                if (laptop.getPrice() >= min && laptop.getPrice() <= max) {
                    laptop.output();
                    timThay = true;
                }
            }
            if (!timThay)
                System.out.println("Khong tim thay laptop nao");
        }
        System.out.printf("=== KET QUA TIM KIEM \"%s\" ===\n", keyword);
        timThay = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() >= min
                && list.get(i).getPrice() <= max) {
            list.get(i).output();
        timThay = true;
                    }
}
        if (!timThay)
                System.out.println("Khong tim thay laptop nao");
    }
}
    


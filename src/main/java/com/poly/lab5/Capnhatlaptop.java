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
public class Capnhatlaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();

        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));

        System.out.print("Nhap id can sua: ");
        String id = sc.nextLine();

        System.out.print("Nhap ten moi: ");
        String tenMoi = sc.nextLine();

        boolean timThay = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(id)) {
                list.get(i).setName(tenMoi);
                System.out.println("Da cap nhat laptop " + id);
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay laptop co ID " + id);
        }

        int soLuongXoa = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).getQuantity() == 0) {
                list.remove(i);
                soLuongXoa++;
            }
        }

        System.out.println("Da xoa " + soLuongXoa + " laptop het hang");

        System.out.println("=== DANH SACH SAU CAP NHAT ("
                + list.size() + " may) ===");

        for (int i = 0; i < list.size(); i++) {
            list.get(i).output();
        }
    }
}

    

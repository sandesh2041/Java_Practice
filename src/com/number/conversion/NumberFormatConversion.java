package com.number.conversion;

import java.util.Scanner;

public class NumberFormatConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for conversion:");
        int OriginalNumber = sc.nextInt();

        DecimalToOthers dto = new DecimalToOthers();
        System.out.println("Binary: " + dto.decimalToBinary(OriginalNumber));
        System.out.println("Hexadecimal: " + dto.decimalToHex(OriginalNumber));

    }
}

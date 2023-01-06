package com.Himraj;

import java.util.Scanner;

public class DepreciationOfValue {
    // formula:-  depreciation = (asset cost - salvage value) / service life   ( straight line method )
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter asset cost: ");
        float assetCost = input.nextFloat();
        System.out.print("Enter salvage value: ");
        float salvageValue = input.nextFloat();
        System.out.print("Enter service life: ");
        float serviceLife = input.nextFloat();
        System.out.print("Depreciated value likely to be: ");
        System.out.println(depreciateValue(assetCost, salvageValue, serviceLife));
    }

    static float depreciateValue(float assetCost, float salvageValue, float serviceLife) {
        return (assetCost - salvageValue) / serviceLife;
    }
}

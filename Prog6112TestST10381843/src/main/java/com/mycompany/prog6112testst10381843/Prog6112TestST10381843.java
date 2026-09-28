package com.mycompany.prog6112testst10381843;

public class Prog6112TestST10381843 {

    public static void main(String[] args) {
        
        //Question 1
        
        //Single dimensional arrays
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        //Two dimensional array
        int[][] sales = {
            {1000, 2000, 3000}, //Cape Town
            {2000, 3000, 4000}, //Port Elizabeth
            {1500, 1100, 1200} //Pretoria
        };
        
        int[] cityTotals = new int[cities.length];
        
        //This will calculate the totals for each city
        for(int i = 0; i < sales.length; i++){
            for(int x = 0; x < sales[i].length; x++){
                cityTotals[i] += sales[i][x];
            }
        };
        
        int maxNum = 0;
        for(int a = 0; a < cityTotals.length; a++){
            if(cityTotals[a] > cityTotals[maxNum]){
                maxNum = a;
            }
        };
        
        
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------------------");
        
        System.out.printf("%-18s" ,"");
        for(String console : consoles){
            System.out.printf("%-8s" ,console);
        }
        
        System.out.println();
        
        for(int z = 0; z < cities.length; z++){
            System.out.printf("%-18s" ,cities[z]);
            for(int m = 0; m < consoles.length; m++){
                System.out.printf("%-8d" ,sales[z][m]);
            }
            System.out.println();
        };
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------------------------");
        
        for(int j = 0; j < cities.length; j++){
            System.out.println(cities[j]+ "        " + cityTotals[j] + "        ");
        };
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxNum]);
        System.out.println("----------------------------------------------------------------");
    }
    
    
}

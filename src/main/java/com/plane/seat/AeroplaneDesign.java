package com.plane.seat;


import java.util.Scanner;

public class AeroplaneDesign {
    public static void main(String[] args) {
        //  inputs from user

        // how many seats in your aeroplane
        Scanner sc = new Scanner(System.in);
//        System.out.println("how many seats in your aeroplane ?");
//        Integer seatCountInput= sc.nextInt();
        //  enter seat pair in your aeroplane
        System.out.println(" enter how many sections are their in your aeroplane ?");
        Integer section= sc.nextInt();
        Integer seatPair;
        Integer [][][] arrayMain = new Integer[section][][];
        Integer seatCount =0;
        for(Integer i=0;i<arrayMain.length;i++) {
            System.out.println("enter how many rows in your section "+ i);
            Integer row= sc.nextInt();
            System.out.println("enter how many columns in your section "+ i);
            Integer column = sc.nextInt();
            arrayMain[i] = new  Integer[row][column];

        }
        System.out.println("");
        // Aisle Seat
        for (Integer j=0;j<arrayMain.length;j++){
            for (Integer i =0;i<arrayMain[j].length;i++) {
                for (Integer k=0;k<arrayMain[j][i].length;k++) {
                    Integer startval = 0;
                    Integer arrMainEndVal = arrayMain[j].length -1;
                    Integer endval = arrayMain[j][i].length;
                    if(j==0) {
                        if(k == endval-1 ){
                            seatCount =  ++seatCount;
                            arrayMain[j][i][k] = seatCount;
                        }
                    } else if( j==arrMainEndVal) {
                        if(k == 0 ){
                            seatCount =  ++seatCount;
                            arrayMain[j][i][k] = seatCount;
                        }
                    } else if(k == 0 || k == endval-1 ){
                        seatCount =  ++seatCount;
                        arrayMain[j][i][k] = seatCount;
                    }
                }

            }
        }
        // windows Seats
        for (Integer j=0;j<arrayMain.length;j++){
            for (Integer i =0;i<arrayMain[j].length;i++) {
                for (Integer k=0;k<arrayMain[j][i].length;k++) {
                    Integer startval = 0;
                    Integer arrMainEndVal = arrayMain[j].length - 1;
                    Integer endval = arrayMain[j][i].length;
                    if (j == 0) {
                        if (k == 0) {
                            seatCount = ++seatCount;
                            arrayMain[j][i][k] = seatCount;
                        }
                    } else if (j == arrMainEndVal) {
                        if (k == endval - 1) {
                            seatCount = ++seatCount;
                            arrayMain[j][i][k] = seatCount;
                        }
                    }
                }
            }
        }
      //centre seats
        for (Integer j=0;j<arrayMain.length;j++){
            for (Integer i =0;i<arrayMain[j].length;i++) {
                for (Integer k=0;k<arrayMain[j][i].length;k++) {
                    Integer startval = 0;
                    Integer arrMainEndVal = arrayMain[j].length -1;
                    Integer endval = arrayMain[j][i].length;
                    if(null == arrayMain[j][i][k]) {
                            seatCount =  ++seatCount;
                            arrayMain[j][i][k] = seatCount;

                    }
                }
            }
        }

        for (Integer i=0;i<arrayMain.length;i++){

            for (Integer j =0;j<arrayMain[i].length;j++) {
                for (Integer k=0;k<arrayMain[i][j].length;k++) {
                    System.out.print(arrayMain[i][j][k]+"\t");
                }
                System.out.println();
            }
            System.out.println("-----------");
        }



    }






}

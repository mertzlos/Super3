package com.example.antreasmertzelos.super3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by antreasmertzelos on 17/07/16.
 */
public class GenerateNum {
    private int[] row1 = new int[]{1,4,7};
    private int[] row2 = new int[]{2,5,8};
    private int[] row3 = new int[]{3,6,9};
    private Random random = new Random();
    //private int draws;
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public GenerateNum(){

    }

    public int genRnd(){
        int rnd = random.nextInt(3);
        return rnd;
    }

    public ArrayList<Integer> getDraws(){

        for(int i = 0;i<3;i++){
            int rnd = random.nextInt(3);
            switch (rnd){
                case 0:arrayList.add(row1[genRnd()]);
                    break;
                case 1:arrayList.add(row2[genRnd()]);
                    break;
                case 2:arrayList.add(row3[genRnd()]);
                    break;

            }
        }
        return arrayList;
    }

}

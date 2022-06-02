package com.company;

public class SortingNumbers {

    public static void main(String[] args) {
        int size = 10;
        int[] sort = new int[size];
        for (int i = 0; i < sort.length; i++) {
            sort[i] = (int) Math.round((Math.random() * 50000));
            System.out.println(sort[i]);
        }
        int i, s, j;
        for(i=0; i<size; i++){
            for(j=0;j<size-i-1;j++){
                if(sort[j]>sort[j+1]){
                    s=sort[j+1];
                    sort[j+1]=sort[j];
                    sort[j]=s;}
            }
        }
        String text = null;
        for(i=0;i<size;i++){
            text+=sort[i]+" ";
        }
        System.out.println(text);
    }
}

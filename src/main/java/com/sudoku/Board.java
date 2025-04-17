package com.sudoku;

public class Board {
    int size;
    int currentDigit = 1;
    public Board(int edgeSize){
        size = edgeSize;
    }

    public void fill(){
    }

    public int positionValue(int row, int column){
        if(currentDigit == 10){
            currentDigit = 1;
        }
        return currentDigit++;
    }
}

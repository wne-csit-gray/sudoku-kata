package com.sudoku;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BoardTests {
    @Test
    public void createBoard(){
        int size = 9;
        Board b = new Board(size);
        b.fill();
        checkAllPositionsNotNull(b);
        checkAllRowsEachPositionAppearsOnce(b);
    }

    void checkAllPositionsNotNull(Board b){
        for (int i = 0; i < b.size; i++){
            for (int j = 0; j < b.size; j++){
                assertNotNull(b.positionValue(i, j));
            }
        }
    }

    void checkAllRowsEachPositionAppearsOnce(Board b){
        for (int j = 0; ;j < b.size; j++){
            boolean[] found = new boolean[b.size];
            for (int i = 0; i < b.size; i++){
                int val = b.positionValue(i, j);
                if (found[val]){
                    assertTrue(false);
                }
                found[val] = true;
            }
        }
    }
}

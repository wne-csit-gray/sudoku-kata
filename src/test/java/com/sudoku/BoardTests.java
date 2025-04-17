package com.sudoku;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class BoardTests {
    @Test
    public void createBoard(){
        int size = 9;
        Board b = new Board(size);
        b.fill();
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                assertNotEquals(null, b.positionValue(i, j));
            }
        }

    }
}

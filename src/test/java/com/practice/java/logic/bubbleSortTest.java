package com.practice.java.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class bubbleSortTest {

    @Test
    void sort() {
        //given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //when
        List<Integer> ac = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

        //then
        assertEquals(List.of(1, 2, 3, 4, 5), ac);
    }
}
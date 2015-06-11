package com.lifegame.block.state.evaluate;

import com.lifegame.block.state.State;

/**
 * Created by ¿ìÇö on 2015-06-11.
 */
public class Evaluator {
    private Evaluator(){}
    public static State findStateByAdjCnt(int adjCnt) {
        if (adjCnt < 3 || adjCnt > 4) return State.DEAD;
        else return State.ALIVE
    }
}

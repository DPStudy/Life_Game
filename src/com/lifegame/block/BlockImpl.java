package com.lifegame.block;

/**
 * Created by ¿ìÇö on 2015-06-11.
 */
public class BlockImpl implements IBlock {

    private int currAdjCnt;
    private int nextAdjCnt;
    public BlockImple(int adjCnt) {
        currAdjCnt = adjCnt;
    }
    public void setAdjCnt(int adjCnt) {
        nextAdjCnt = adjCnt;
    }
    public int getAdjCnt() {
        return currAdjCnt;
    }
    public void tick() {
        currAdjCnt = nextAdjCnt;
        nextAdjCnt = 0;
    }
}

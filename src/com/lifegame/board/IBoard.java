package com.lifegame.board;

/**
 * Created by ¿ìÇö on 2015-06-11.
 */
public interface IBoard {
    public void calculate();
    public void tick();
    public State[][] release();
}

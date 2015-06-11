package com.lifegame.board;

/**
 * Created by ¿ìÇö on 2015-06-11.*/
public class Board {
    private State[][] board;
    public static class BoardIterator {
        private int x;
        private int y;
        private State[][] states;
        public BoardIterator(int x, int y) {
            this.x = x;
            this.y = y;
            states = board;
        }
        public BoardIterator() {
            this(0, 0);
        }
        public State next() {
           return states[x][++y];
        }
        public State prev() {
            return states[x][--y];
        }
        public State up() {
            return states[--x][y];
        }
        public State down() {
            return states[++x][y];
        }
        public State lineChange() {
            return states[++x][(y=0)];
        }

        public int width() {
           return states[0].length;
        }
        public int height() {
            return states.length;
        }
    }

    public BoardIterator Iterator() {
        return new
    }
}

package com.github.boyarsky1997.task.collections;

public class VitalikList {

    private static int MAX_COLUMN = 10;
    private static int MAX_ROW = 10;

    private String[][] data = new String[MAX_ROW][];
    private int row = 0, column = 0;

    public VitalikList() {
        this(MAX_COLUMN);
    }

    public VitalikList(int capacity) {
        data[0] = new String[capacity];
        MAX_COLUMN = capacity;
    }

    public void add(String elem) {
        if (column == MAX_COLUMN) {
            newRow();
        }
        data[row][column] = elem;
        column++;
    }

    private void newRow() {
        if (row + 1 == MAX_ROW) {
            resize();
        }
        row++;
        data[row] = new String[MAX_COLUMN];
        column = 0;
    }

    private void resize() {
        String[][] tmp = data;
        MAX_ROW = (MAX_ROW * 3) / 2 + 1;
        data = new String[MAX_ROW][];
        int i = 0;
        for (String[] arr : tmp) {
            data[i] = arr;
            i++;
        }
    }

    public int length() {
        return (MAX_COLUMN * row) + column;
    }

    public String get(int arg0) {
        return data[arg0 / MAX_COLUMN][arg0 % MAX_COLUMN];
    }

}
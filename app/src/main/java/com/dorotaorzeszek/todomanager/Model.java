package com.dorotaorzeszek.todomanager;

/**
 * Created by dorota on 16.06.16.
 */
public class Model {

    String name;
    int value; /* 0 -&gt; checkbox disable, 1 -&gt; checkbox enable */

    Model(String name, int value) {
        this.name = name;
        this.value = value;
    }
    public String getName() {
        return this.name;
    }
    public int getValue() {
        return this.value;
    }

}

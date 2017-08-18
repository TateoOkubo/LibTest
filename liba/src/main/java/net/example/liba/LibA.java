package net.example.liba;

import hoge.example.tateo_okubo.testlib.TestLib;

/**
 * Created by tateo-okubo on 2017/08/18.
 */
public class LibA {
    public static int VALUE = 10;

    public LibA() {}

    public int getLibValue () {
        TestLib.getHoge();
        TestLib.setTestLibValue(1111);
        return 1;
    }
}

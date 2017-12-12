package net.lc.kotlin.main.方法重载与默认参数;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 18480 on 2017/12/11.
 */

public class Bug {

    public static void main(String... args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        System.out.println(integers);
        integers.remove(1);
        integers.remove(2);
        System.out.println(integers);
    }

}

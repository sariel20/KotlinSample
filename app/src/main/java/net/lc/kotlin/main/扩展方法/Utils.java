package net.lc.kotlin.main.扩展方法;

/**
 * Created by 18480 on 2017/12/11.
 */

public class Utils {
    public static boolean isEmpty(String[] args) {
        return args.length == 0;
    }

    public static boolean isNotEmpty(String[] args) {
        return args.length > 0;
    }
}

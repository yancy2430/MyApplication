package com.nice.main.data.enumerable;

import java.util.Random;

public class CGG {
    public static String f() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 16) {
            sb.append(Integer.toString(random.nextInt() & Constants.DEFAULT_BLACKBOX_MAZSIZE, 36));
        }
        return sb.substring(0, 16);
    }

}

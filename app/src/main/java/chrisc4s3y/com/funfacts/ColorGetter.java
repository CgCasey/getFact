package chrisc4s3y.com.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Chris on 10/5/2014.
 */
public class ColorGetter {

    private String[] colors = new String[]{"#39add1", // light blue
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"};

    protected int getColor() {
        Random number = new Random();
        int rand = number.nextInt(colors.length);

        String color = colors[rand];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;

    }
}

package Testing;

import java.io.*;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class LineAnalyser implements Runnable{

    /*
     * untitled.java
     * Copyright 2019 Karan Kanojia <karankanojia@Karans-MacBook-Air.local>
     *
     * This program is free software; you can redistribute it and/or modify
     * it under the terms of the GNU General Public License as published by
     * the Free Software Foundation; either version 2 of the License, or
     * (at your option) any later version.
     *
     * This program is distributed in the hope that it will be useful,
     * but WITHOUT ANY WARRANTY; without even the implied warranty of
     * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     * GNU General Public License for more details.
     *
     * You should have received a copy of the GNU General Public License
     * along with this program; if not, write to the Free Software
     * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
     * MA 02110-1301, USA.
     */
    static Scanner scanner = new Scanner(System.in);
    static StringBuffer stringBuffer = new StringBuffer();
    static PrintWriter out  = new PrintWriter(System.out);
    static int MAX = 1111111111;
    static int bit_max = 32;
    static int ALPHA_LIMIT = 30;
    static int SQRT_BUCKET = 555;
    static int lim = 1000000007;
    static long watcher = 0;




    public static Integer analyseMood(String s){
        String[] word = s.split("\\s");
        return null;
    }

    static class pair{
        float slope, intercept;
        pair(float slope, float intercept){
            this.slope = slope;
            this.intercept = intercept;
        }

    }
    public static pair Line(float a, float b, float c){
        pair p = new pair(-a/b, -c/b);
        //System.out.println(a+"\t"+b+"\t"+c);
        return p;
    }


    @Override
    public void run() {

    }

    public static void main(String[] args){
        //new Thread(null, new MoodAnalyser(), "Main", 1<<26).start();
    }

}

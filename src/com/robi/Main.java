package com.robi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> xList = new ArrayList<>(Arrays.asList(8,2,11,6,5,4,12,9,6,1));
        List<Integer> yList = new ArrayList<>(Arrays.asList(3,10,3,6,8,12,1,4,9,14));

        LeastSquare liSquare = new LeastSquare(xList,yList);

        double slope = liSquare.getSlope();
        double intercept = liSquare.getIntercept();

        System.out.println(slope);
        System.out.println(intercept);
    }
}

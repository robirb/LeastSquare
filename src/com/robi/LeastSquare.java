package com.robi;

import java.util.List;

public class LeastSquare {

    private List<Integer> xList;
    private List<Integer> yList;

    private double meanX,meanY;

    public LeastSquare(List<Integer> xList, List<Integer> yList) {
        this.xList = xList;
        this.yList = yList;

        meanX = getMeanX();
        meanY = getMeanY();
    }

    private double getMeanX() {
        double total = 0;

        for (int x: xList){
            total+=x;
        }

        return total/xList.size();
    }

    private double getMeanY() {
        double total = 0;

        for (int x: yList){
            total+=x;
        }

        return total/yList.size();
    }

    public double getSlope(){
        double top=0;
        double bottom = 0;

        for(int i=0;i<xList.size();i++){
            top+=(xList.get(i)-meanX)*(yList.get(i)-meanY);
            bottom+=(xList.get(i)-meanX)*(xList.get(i)-meanX);
        }

        return top/bottom;



    }

    public double getIntercept(){

        double m = getSlope();

        return (meanY -m*meanX);

    }
}

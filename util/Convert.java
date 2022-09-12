package util;

public class Convert {

    public static double IntToDouble(int x){
        double y = Double.valueOf(x);
        return y;
    }

    public static int DoubleToInt(double x){
        int y = (int) Math.round(x);
        return y;
    }
}

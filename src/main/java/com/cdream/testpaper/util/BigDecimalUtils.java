package com.cdream.testpaper.util;

import java.math.BigDecimal;

/**
 * 用于商业计算的工具类
 * String的构造方法才能完成
 * @author cdream
 * @date 2018/9/22
 */
public class BigDecimalUtils {
    private BigDecimalUtils(){}

    /**
     * 精确计算加法
     * @param a
     * @param b
     * @return
     */
    public static BigDecimal add(double a, double b){
        BigDecimal b1 = new BigDecimal(Double.toString(a));
        BigDecimal b2 = new BigDecimal(Double.toString(b));
        return b1.add(b2);
    }

    /**
     * 精确计算减法
     * @param a
     * @param b
     * @return
     */
    public static BigDecimal subtract(double a, double b){
        BigDecimal b1 = new BigDecimal(Double.toString(a));
        BigDecimal b2 = new BigDecimal(Double.toString(b));
        return b1.subtract(b2);
    }

    /**
     * 精确计算乘法
     * @param a
     * @param b
     * @return
     */
    public static BigDecimal multiply(double a, double b){
        BigDecimal b1 = new BigDecimal(Double.toString(a));
        BigDecimal b2 = new BigDecimal(Double.toString(b));
        return b1.multiply(b2);
    }

    /**
     * 精确计算除法,保留两位四舍五入
     * @param a
     * @param b
     * @return
     */
    public static BigDecimal divide(double a, double b){
        BigDecimal b1 = new BigDecimal(Double.toString(a));
        BigDecimal b2 = new BigDecimal(Double.toString(b));
        return b1.divide(b2,2, BigDecimal.ROUND_HALF_UP);
    }
}

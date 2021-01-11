package com.tutorial.cn;

import javax.print.attribute.standard.PrinterResolution;
import javax.xml.soap.Node;
import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        int[][] points={{2,3},{3,3},{-5,3}};
        Solution solution=new Solution();
        System.out.println(solution.maxPoints(points));
    }
}



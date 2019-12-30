package Leetcode.zap.todo.finish;

import java.util.ArrayList;
import java.util.List;

public class LC119_PascalTriangle2 {
    public static void main(String[] args) {
        LC119_PascalTriangle2 lc119 = new LC119_PascalTriangle2();
        lc119.getRow(5).forEach(k-> System.out.println(k));
    }
    public List<Integer> getRow(int rowIndex) {

        List<Integer> ret = new ArrayList<Integer>();
        ret.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--) {
                int tmp = ret.get(j - 1) + ret.get(j);
                ret.set(j, tmp);
            }
            ret.add(1);
        }
        return ret;


    }
}

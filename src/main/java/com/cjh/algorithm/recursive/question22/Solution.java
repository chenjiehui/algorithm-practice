package com.cjh.algorithm.recursive.question22;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjh on 2020/11/9.
 */
public class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<String>();
        generate(0, 0, n, "", result);
        return result;
    }

    private void generate(int left, int right, int max, String str, List<String> result) {
        // 退出条件
        if (str.length() == max * 2) {
            result.add(str);
            return ;
        }
        // 处理当前逻辑 & 向下递归
        if (left < max)
            generate(left + 1, right, max, str + "(", result);
        if (right < left)
            generate(left, right + 1, max, str + ")", result);
    }
}

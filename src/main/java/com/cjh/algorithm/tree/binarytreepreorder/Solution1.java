package com.cjh.algorithm.tree.binarytreepreorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 非递归解法，迭代
 * Created by cjh on 2020/10/9.
 */
public class Solution1 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null) continue;
            ret.add(node.val);
            stack.push(node.right);  // 先右后左，保证左子树先遍历
            stack.push(node.left);
        }
        return ret;
    }

}

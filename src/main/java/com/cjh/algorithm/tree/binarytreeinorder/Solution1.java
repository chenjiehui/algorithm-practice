package com.cjh.algorithm.tree.binarytreeinorder;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归解法
 * Created by cjh on 2020/10/9.
 */
public class Solution1 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}

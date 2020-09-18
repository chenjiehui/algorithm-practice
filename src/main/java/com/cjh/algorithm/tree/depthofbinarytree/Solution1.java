package com.cjh.algorithm.tree.depthofbinarytree;

/**
 * 递归法
 * Created by cjh on 2020/9/18.
 */
public class Solution1 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

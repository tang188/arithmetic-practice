package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName P100
 * @Description
 * @Author tangzhihong
 * @Date 2020/8/1 21:12
 * @Version 1.0
 **/
public class P100 {

    /**
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     * 示例 1:
     * 输入:       1         1
     *           / \       / \
     *          2   3     2   3
     *         [1,2,3],   [1,2,3]
     * 输出: true
     * 示例 2:
     * 输入:      1          1
     *           /           \
     *          2             2
     *         [1,2],     [1,null,2]
     * 输出: false
     * 示例 3:
     * 输入:       1         1
     *           / \       / \
     *          2   1     1   2
     *         [1,2,1],   [1,1,2]
     * 输出: false
     */

    @Test
    public void test(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        System.out.println(isSameTree(root, root1));;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        if (p != null && q != null && p.val == q.val){
            return isSameTree(p.left, q.left) ? isSameTree(p.right, q.right) : false;
        }
        return false;
    }

    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
}

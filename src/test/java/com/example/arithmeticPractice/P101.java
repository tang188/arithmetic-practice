package com.example.arithmeticPractice;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName P101
 * @Description
 * @Author tangzhihong
 * @Date 2020/8/1 21:28
 * @Version 1.0
 **/
public class P101 {

    /**
     * 给定一个二叉树，检查它是否是镜像对称的。
     * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
     *     1
     *    / \
     *   2   2
     *  / \ / \
     * 3  4 4  3
     * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
     *     1
     *    / \
     *   2   2
     *    \   \
     *    3    3
     * 进阶：
     * 你可以运用递归和迭代两种方法解决这个问题吗？
     */

    @Test
    public void test(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));;
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return check(root.left, root.right);
    }

    public boolean check(TreeNode left, TreeNode right){

        Queue a = new LinkedList();
        if (left == null && right == null){
            return true;
        }else {
            return left != null && right != null && left.val == right.val ? check(left.left, right.right) ? check(left.right, right.left) : false : false;
        }
    }
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
}

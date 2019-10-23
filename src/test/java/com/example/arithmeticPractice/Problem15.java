package com.example.arithmeticPractice;

import org.junit.Test;

/**
 * @ClassName Problem15
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/23 14:32
 * @Version 1.0
 **/
public class Problem15 {

    @Test
    public void test(){
//        1,3,null,null,2
        TreeNode node  = new TreeNode(1);
        TreeNode node2  = new TreeNode(2);
        TreeNode node3  = new TreeNode(3);
        node.left = node3;
        node3.right = node2;
        recoverTree(node);
    }

    TreeNode first=null,second=null,pre=new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        dfs(root);
        int tmp=first.val;
        first.val=second.val;
        second.val=tmp;
    }

    private void dfs(TreeNode node){
        if(node==null){
            return;
        }
        dfs(node.left);
        if(pre.val>node.val){
            if(first==null){
                first=pre;
            }
            second=node;
        }
        pre=node;
        dfs(node.right);
    }
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

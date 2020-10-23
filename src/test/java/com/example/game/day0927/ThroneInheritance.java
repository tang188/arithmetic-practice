package com.example.game.day0927;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName P3
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/27 11:09
 * @Version 1.0
 **/
public class ThroneInheritance {

    Node root;

    public static void main(String[] args) {
        ThroneInheritance throneInheritance = new ThroneInheritance("king");
        throneInheritance.birth("king", "huangzi1");
        throneInheritance.birth("king", "huangzi2");
        throneInheritance.birth("huangzi2", "taizi2-1");
        throneInheritance.birth("huangzi2", "taizi2-2");
        throneInheritance.birth("huangzi1", "taizi1-1");
        throneInheritance.birth("huangzi1", "taizi1-2");
        System.out.println("1");
        throneInheritance.death("taizi1-1");
        System.out.println(throneInheritance.getInheritanceOrder());

    }
    public ThroneInheritance(String kingName){
        Node node = new Node(kingName, new ArrayList<>(), true);
        this.root = node;
    }

    public void birth(String parentName, String childName) {
        Node o = root;
        doAddCircle(o, parentName, childName);
    }

    public boolean doAddCircle(Node root, String parentName, String childName){
        if (!root.value.equals(parentName)){
            List<Node> child = root.childNodes;
            Iterator<Node> it = child.iterator();
            while (it.hasNext()){
                if (!doAddCircle(it.next(), parentName, childName)) break;
            }
        }else {
//            root.value == parentName
            Node n = new Node(childName, new ArrayList<>(), true);
            root.childNodes.add(n);
            return false;
        }
        return true;
    }

    public void death(String name) {
        Node n = root;
        doDeathCircle(n, name);
    }

    public boolean doDeathCircle(Node root, String name){
        if (root.value.equals(name)){
            root.alive = false;
            return false;
        }else{
            for (Node node : root.childNodes) {
                if (!doDeathCircle(node, name)){
                    break;
                }
            }
        }
        return true;
    }

    public List<String> doCircle(Node root,List<String> result){
        if (root.alive)
            result.add(root.value);
        if (!root.childNodes.isEmpty()){
            root.childNodes.forEach(n -> doCircle(n, result));
        }
        return result;
    }

    public List<String> getInheritanceOrder() {
        Node r = root;
        return doCircle(r, new ArrayList<>());
    }

    public static class Node {
        String value;
        boolean alive;
        List<Node> childNodes;

        public Node(String value, List<Node> childNodes, boolean alive) {
            this.value = value;
            this.childNodes = childNodes;
            this.alive = alive;
        }
    }
}

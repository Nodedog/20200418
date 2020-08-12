/*
*
*
*                          二叉树的遍历
*
*
* */


import java.util.ArrayList;
import java.util.List;

public class Testdemo {

    static class Node{
        public char val;
        public Node left;
        public Node right;

        public Node(char val) {
            this.val = val;
            //left和right可以不用卸载构造方法里，应为医用类型成员变量默认值为null
            this.left = null;
            this.right = null;
        }

    }

    //用bulid方法构造一棵树，返回这棵树的根节点
    public static Node bulid(){
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.left = G;
        C.right = F;
        return  A;
    }


    public static void preOrder(Node root){
        //前序遍历（先序遍历）：先访问根节点，递归访问左子树，再递归访问右子树
        //如果是空树，不需要任何操作
        if (root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }




    public static void inOrder(Node root){
        //中序遍历：先访问左子树，递归访问根节点，再递归访问右子树
        //如果是空树，不需要任何操作
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }



    public static void postOrder(Node root){
        //前序遍历（先序遍历）：先访问左子树，递归访问右子树，再递归访问根节点
        //如果是空树，不需要任何操作
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }





    public static void main(String[] args) {
        Node root = bulid();

    }

}

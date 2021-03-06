package Grokking.Ch7_TreeBFS;

import java.util.LinkedList;
import java.util.Queue;

public class L6_LevelOrderSuccessor {
    public static TreeNode findSuccessor(TreeNode root, int key) {
        // TODO: Write your code here

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);


        while (!queue.isEmpty()) {



                TreeNode currentNode= queue.poll();


                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);

                if(currentNode.val == key){
                    break;
                }

        }


        return queue.peek();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        TreeNode result = L6_LevelOrderSuccessor.findSuccessor(root, 12);
        if (result != null)
            System.out.println(result.val + " ");
        result = L6_LevelOrderSuccessor.findSuccessor(root, 9);
        if (result != null)
            System.out.println(result.val + " ");
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            var rootRightList = new ArrayList<Integer>();
            rootRightList.add(root.val);
            rootRightList.addAll(inorderTraversal(root.right));
            if (root.left != null) {
                var list = inorderTraversal(root.left);
                list.addAll(rootRightList);
                return list;
            }
            else{
                return rootRightList;
            }
        }
        return new ArrayList<Integer>();
    }
}
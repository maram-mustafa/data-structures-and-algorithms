package HashTable;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
  public TreeNode<T> root;
  private List<T> list = new ArrayList<>();

  public List<T> inOrder(TreeNode<T> root) {

    if (root.left != null)
      inOrder(root.left);
    list.add(root.value);
    if (root.right != null)
      inOrder(root.right);
    return list;
  }

}

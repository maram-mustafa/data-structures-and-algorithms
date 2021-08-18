package trees;

public class KTreeNode {
  int data;
  KTreeNode children[];

  public KTreeNode() {
  }

  KTreeNode(int k, int data) {
    children = new KTreeNode[k];
    this.data = data;
  }
}

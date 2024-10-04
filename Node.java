public class Node {
  private	String texto;
  private	Node left, right;

  public	Node() {
    this("", null, null);
  }

  public Node(String linha){
      this.texto = linha;
      this.left = null;
      this.right = null;
  };

  public Node(String linha, Node left, Node right){
      this.texto = linha;
      this.left = left;
      this.right = right;
  };

  public String getTexto() { return texto;};
  public Node getLeft(){ return left;};
  public Node getRight(){ return right;};

  public void setTexto(String t) { this.texto = t;};
  public void setLeft(Node left){ this.left = left; };
  public void setRight(Node right){ this.right = right; };
}

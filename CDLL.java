public class CDLL {
  private	Node head, tail;
  private int count;

  // Construtor vazio
  // inicia o cabeça da lista como null
  public CDLL(){
    this.head = null;
    this.tail = null;
    this.count = 0;
  }

  public boolean isEmpty() { // Verifica se DLL está vazia
    if (this.head == null) {
      return true; 
    } else {
        return false;	
    } 
  }

  public int getCount() { return count; }

  // Percorre a DLL da esquerda para a direita 
  // e mostra os valores das strings
  public void showLeftToRight(){
    if (head == null) System.out.print( "Lista vazia!\n");
    else{
      System.out.print( "Lista: [ ");
      Node pAnda = this.head;
      while (pAnda.getRight() != this.head){
        System.out.print( pAnda.getTexto() + " ");
        pAnda= pAnda.getRight();
      }
      System.out.print( pAnda.getTexto() +"]\n");
    }
  }


  // Percorre a DLL da direita para a esquerda 
  // e mostra os valores das strings
  public void showRightToLeft(){
    if (head == null) System.out.print( "Lista vazia!\n" );
    else{
      System.out.print( "Lista: [ " );
      Node pAnda = this.head;
      while (pAnda.getLeft() != this.head){
        pAnda= pAnda.getLeft();
        System.out.print( pAnda.getTexto() + " " );
      }
      System.out.print( pAnda.getLeft().getTexto() + "]\n");
    }
  }

  // metodo para inserir em Head recebendo
  // um nó já pronto
  public void insertNodeToHead(Node n) {
    // Cria um novo no
    if (head == null) {
      this.head = n;
      this.tail = n;
      head.setLeft(tail);
      tail.setRight(head);
    } else {
      n.setRight(head);
      n.setLeft(tail);
      head.setLeft(n);
      tail.setRight(n);
      head = n;
    }
    this.count++;
  }

  // metodo para inserir em Head recebendo
  // uma string
  public void insertHead(String linha) {
    // Cria um novo no
    Node novoNo = new Node(linha);
    insertNodeToHead(novoNo);
  }

  // metodo para inserir em Tail recebendo
  // o nó já pronto
  public void insertNodeToTail(Node n) {
    // Cria um novo no
    if (tail == null) {
      this.head = n;
      this.tail = n;
      head.setLeft(tail);
      tail.setRight(head);
    } else {
      n.setRight(head);
      n.setLeft(tail);
      head.setLeft(n);
      tail.setRight(n);
      tail = n;
    }
    this.count++;
  }	

  // metodo para inserir em Tail recebendo
  // uma string
  public void insertTail(String linha) {
    // Cria um novo no
    Node novoNo = new Node(linha);
    insertNodeToTail(novoNo);
  }

  // busca e retorna o nó da string linha passada como parâmetro
  public Node search(String linha){
    // Lista vazia
    if (isEmpty()) return null;

    // Procura o elemento 
    Node pAnda = this.head;
    while (pAnda.getRight() != this.head && !pAnda.getTexto().equals(linha)){
      pAnda = pAnda.getRight();
    }

    if (pAnda.getRight() == this.head && !pAnda.getTexto().equals(linha)){// elemento não encontrado
      return null;
    } else { // elemento encontrado
      return pAnda;
    }
  }

  // remove e retorna o nó em Head
  public Node removeHead() {
    if (isEmpty()) return null;

    if (head == tail) {
      Node removido = head;

      head = tail = null;
      count--;

      removido.setRight(null);
      removido.setLeft(null);

      return removido;
    } else {
      Node removido = head;
      head = removido.getRight();

      head.setLeft(tail);
      tail.setRight(head);

      removido.setRight(null);
      removido.setLeft(null);

      count--;

      return removido;
    }
  }

    // remove e retorna o nó em Tail
  public Node removeTail() {
    if (isEmpty()) return null;

    if (head == tail) {
      Node removido = head;

      head = tail = null;
      count--;

      removido.setRight(null);
      removido.setLeft(null);

      return removido;
    } else {
      Node removido = tail;
      tail = removido.getLeft();

      head.setLeft(tail);
      tail.setRight(head);

      removido.setRight(null);
      removido.setLeft(null);

      count--;

      return removido;
    }
  }

  // deleta um elemento da CDLL
  // retornando verdadeiro ou falso
  // se conseguiu remover ou não
  public boolean delete(String texto) {

    Node removed = search(texto);

    if (removed == null){// elemento não encontrado
      return false;
    } else {
      // elemento encontrado no cabeça
      if (removed == head){
        removeHead();
      } else if (removed == tail) {
        removeTail();
      } else { // elemento encontra-se no meio da lista
        removed.getLeft().setRight(removed.getRight());
        removed.getRight().setLeft(removed.getLeft());

        removed.setLeft(null);
        removed.setRight(null);

        removed = null;
        this.count--;

      }
      return true;
    }
  }


  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    int qtde = 0;
    sb.append("\n[Lista]\n");

      sb.append("L: [ ");
      Node pAnda = head;
      while (qtde != count) {
        sb.append("(" + pAnda.getTexto() + "), ");
        qtde++;
        pAnda = pAnda.getRight();
      }
      sb.append("]\n");

      sb.append("Qtde.: " + count);
      return sb.toString();
  }

}

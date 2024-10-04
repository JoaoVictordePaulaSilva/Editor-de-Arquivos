import java.io.*;
import java.util.Scanner;

  public class Main {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int opcaozinha;

          do {
              System.out.println("\nMenu do Grande cabaço do Caio!");
              System.out.println("1 - :e nomeArq.ext (Abrir arquivo)");
              System.out.println("2 - :w (Salvar modificações)");
              System.out.println("3 - :w nomeArq.ext (Salvar como)");
              System.out.println("4 - :wq (Salvar e sair)");
              System.out.println("5 - :q! (Sair sem salvar)");
              System.out.println("6 - :ZZ (Gravar conteúdo se alterado)");
              System.out.println("7 - :v LinIni LinFim (Marcar texto)");
              System.out.println("8 - :y (Copiar texto marcado)");
              System.out.println("9 - :c (Cortar texto marcado)");
              System.out.println("10 - :p LinIniPaste (Colar texto marcado)");
              System.out.println("11 - :s (Exibir conteúdo)");
              System.out.println("12 - :s Lin (Exibir linha)");
              System.out.println("13 - :s LinIni LinFim (Exibir intervalo de linhas)");
              System.out.println("14 - :x Lin (Apagar linha)");
              System.out.println("15 - :xG Lin (Apagar a partir da linha até o final)");
              System.out.println("16 - :XG Lin (Apagar da linha até o início)");
              System.out.println("17 - :/ elemento (Localizar elemento)");
              System.out.println("18 - :/ elem elemTroca (Substituir elemento)");
              System.out.println("19 - :/ elem elemTroca Linha (Substituir em linha específica)");
              System.out.println("20 - :o (Editar várias linhas)");
              System.out.println("21 - :a posLin (Inserir após linha)");
              System.out.println("22 - :i posLin (Inserir antes da linha)");
              System.out.println("23 - :help (Ajuda)");
              System.out.println("24 - Sair do Menu");

              System.out.print("Escolha uma opção: ");
              opcaozinha = input.nextInt();

              switch (opcaozinha) {
                  case 1:
                      System.out.println("Opção 1 selecionada.");
                      break;
                  case 2:
                      System.out.println("Opção 2 selecionada.");
                      break;
                  case 3:
                      System.out.println("Opção 3 selecionada.");
                      break;
                  case 4:
                      System.out.println("Opção 4 selecionada.");
                      break;
                  case 5:
                      System.out.println("Opção 5 selecionada.");
                      break;
                  case 6:
                      System.out.println("Opção 6 selecionada.");
                      break;
                  case 7:
                      System.out.println("Opção 7 selecionada.");
                      break;
                  case 8:
                      System.out.println("Opção 8 selecionada.");
                      break;
                  case 9:
                      System.out.println("Opção 9 selecionada.");
                      break;
                  case 10:
                      System.out.println("Opção 10 selecionada.");
                      break;
                  case 11:
                      System.out.println("Opção 11 selecionada.");
                      break;
                  case 12:
                      System.out.println("Opção 12 selecionada.");
                      break;
                  case 13:
                      System.out.println("Opção 13 selecionada.");
                      break;
                  case 14:
                      System.out.println("Opção 14 selecionada.");
                      break;
                  case 15:
                      System.out.println("Opção 15 selecionada.");
                      break;
                  case 16:
                      System.out.println("Opção 16 selecionada.");
                      break;
                  case 17:
                      System.out.println("Opção 17 selecionada.");
                      break;
                  case 18:
                      System.out.println("Opção 18 selecionada.");
                      break;
                  case 19:
                      System.out.println("Opção 19 selecionada.");
                      break;
                  case 20:
                      System.out.println("Opção 20 selecionada.");
                      break;
                  case 21:
                      System.out.println("Opção 21 selecionada.");
                      break;
                  case 22:
                      System.out.println("Opção 22 selecionada.");
                      break;
                  case 23:
                      System.out.println("Opção 23 selecionada.");
                      break;
                  case 24:
                      System.out.println("Saindo do Menu...");
                      break;
                  default:
                      System.out.println("Opção inválida!");
              }
          } while (opcaozinha != 24);

          input.close();
      }
  }

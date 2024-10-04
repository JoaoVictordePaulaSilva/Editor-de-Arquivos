import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipularArquivo {
    private String nome;

    public ManipularArquivo(String nome) {
        this.nome = nome;
    }

    public void abrir() {
        try {
            File arquivo = new File(nome);
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }

    public void salvar(String conteudo) {
        try {
            FileWriter escritor = new FileWriter(nome);
            escritor.write(conteudo);
            escritor.close();
            System.out.println("Modificações salvas.");
      } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo.");
      }
    }

   public void lerEArmazenarEmCDLL(CDLL cdll) {
          try {
              File arquivo = new File(nome);
              Scanner leitor = new Scanner(arquivo);
              while (leitor.hasNextLine()) {
                  String linha = leitor.nextLine();
                  cdll.insertTail(linha);
              }
              leitor.close();
              System.out.println("Arquivo lido com sucesso e linhas armazenadas na lista encadeada circular.");
          } catch (FileNotFoundException e) {
              System.out.println("Arquivo não encontrado.");
          }
      }
  }

    
    

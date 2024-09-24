import java.util.Scanner;

public class MorseInterpreter {
    private ArvoreBinariaMorse arvore;

    // Construtor que recebe a árvore binária como parâmetro
    public MorseInterpreter(ArvoreBinariaMorse arvore) {
        this.arvore = arvore;
    }

    // Método para interpretar a entrada do usuário e buscar na árvore
    public void interpretarEntrada() throws Exception {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma palavra em código Morse (separe os caracteres por espaço, use . para ponto e - para traço): ");
            String entrada = scanner.nextLine().trim();  // Lê a entrada do usuário

            String[] codigosMorse = entrada.split(" ");  // Divide a entrada em vários códigos Morse separados por espaços
            StringBuilder resultado = new StringBuilder();

            // Para cada código Morse digitado, buscar o caractere correspondente
            for (String codigoMorse : codigosMorse) {
                char caractere = buscarNaArvore(codigoMorse);  // Busca na árvore o caractere correspondente
                if (caractere != '\0') {
                    resultado.append(caractere);  // Adiciona o caractere encontrado ao resultado
                } else {
                    System.out.println("Código Morse '" + codigoMorse + "' não encontrado.");
                    return;  // Encerra se um código Morse não for encontrado
                }
            }

            // Exibe a palavra final correspondente aos códigos Morse
            System.out.println("A palavra correspondente ao código Morse é: " + resultado.toString());
        }catch (Exception e){
            System.out.println("Erro ao interpretar a entrada" + e.getMessage());
        }
    }

    // Método para buscar o caractere na árvore baseado no código Morse
    private char buscarNaArvore(String codigoMorse) throws Exception {
        try{ 
            Nodo noAtual = arvore.getRaiz();  // Começa a busca pela raiz da árvore

            for (char simbolo : codigoMorse.toCharArray()) {
                if (simbolo == '.') {
                    if (noAtual.filhoEsquerdo != null) {
                        noAtual = noAtual.filhoEsquerdo;  // Vai para o filho esquerdo
                    } else {
                        return '\0';  // Se o nó não existir, retorna nulo
                    }
                } else if (simbolo == '-') {
                    if (noAtual.filhoDireito != null) {
                        noAtual = noAtual.filhoDireito;  // Vai para o filho direito
                    } else {
                        return '\0';  // Se o nó não existir, retorna nulo
                    }
                } else {
                    System.out.println("Entrada inválida. Use apenas '.' e '-' para o código Morse.");
                    return '\0';
                }
            }

            return noAtual.caractere;  // Retorna o caractere encontrado
        }catch (Exception e){
            System.out.println("Erro ao buscar na árvore" + e.getMessage());
            return '\0';
        }
    }
}

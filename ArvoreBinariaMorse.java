public class ArvoreBinariaMorse {
    private Nodo raiz;  // A raiz da árvore binária

    // Construtor para inicializar a árvore
    public ArvoreBinariaMorse() {
        raiz = new Nodo();  // Inicializa com um nó raiz vazio
        preencherArvore();  // Chama o método para preencher a árvore com os caracteres Morse
    }

    
    // Método para retornar a raiz da árvore
    public Nodo getRaiz() {
        return raiz;
    }


    // Método para inserir um caractere na árvore baseado no código Morse
    public void inserir(String codigoMorse, char caractere) {
        Nodo noAtual = raiz;
        for (char simbolo : codigoMorse.toCharArray()) {
            if (simbolo == '.') {
                if (noAtual.filhoEsquerdo == null) {
                    noAtual.filhoEsquerdo = new Nodo();
                }
                noAtual = noAtual.filhoEsquerdo;
            } else if (simbolo == '-') {
                if (noAtual.filhoDireito == null) {
                    noAtual.filhoDireito = new Nodo();
                }
                noAtual = noAtual.filhoDireito;
            }
        }
        noAtual.caractere = caractere;
    }

    // Método para exibir a árvore binária da esquerda para direita (verticalmente)
    public void exibirArvore()throws Exception {
        try{
            exibirArvoreRecursivo(raiz, 0);  // Chama o método recursivo começando da raiz
        }catch (Exception e){
            System.out.println("Erro ao exibir a árvore");
        }
    }

    // Método recursivo para exibir a árvore
    private void exibirArvoreRecursivo(Nodo no, int nivel) throws Exception {
        try{
            if (no != null) {
                // Exibe o filho direito com indentação
                exibirArvoreRecursivo(no.filhoDireito, nivel + 1);
                
                // Exibe o caractere do nó atual com indentação proporcional ao nível
                for (int i = 0; i < nivel; i++) {
                    System.out.print("    ");
                }
                System.out.println("-> " + (no.caractere != '\0' ? no.caractere : " "));

                // Exibe o filho esquerdo com indentação
                exibirArvoreRecursivo(no.filhoEsquerdo, nivel + 1);
            }
        }catch (Exception e){
            System.out.println("Erro ao exibir a árvore");
        }
    }

    // Método para preencher a árvore binária com os caracteres e códigos Morse
    private void preencherArvore() {
        inserir(".-", 'A');
        inserir("-...", 'B');
        inserir("-.-.", 'C');
        inserir("-..", 'D');
        inserir(".", 'E');
        inserir("..-.", 'F');
        inserir("--.", 'G');
        inserir("....", 'H');
        inserir("..", 'I');
        inserir(".---", 'J');
        inserir("-.-", 'K');
        inserir(".-..", 'L');
        inserir("--", 'M');
        inserir("-.", 'N');
        inserir("---", 'O');
        inserir(".--.", 'P');
        inserir("--.-", 'Q');
        inserir(".-.", 'R');
        inserir("...", 'S');
        inserir("-", 'T');
        inserir("..-", 'U');
        inserir("...-", 'V');
        inserir(".--", 'W');
        inserir("-..-", 'X');
        inserir("-.--", 'Y');
        inserir("--..", 'Z');
        inserir("-----", '0');
        inserir(".----", '1');
        inserir("..---", '2');
        inserir("...--", '3');
        inserir("....-", '4');
        inserir(".....", '5');
        inserir("-....", '6');
        inserir("--...", '7');
        inserir("---..", '8');
        inserir("----.", '9');
    }
}

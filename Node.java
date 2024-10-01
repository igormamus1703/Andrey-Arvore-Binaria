public class Node {
    char caractere;        // Armazena o caractere (letra ou número)
    Node filhoEsquerdo;    // Referência para o filho esquerdo (representa ponto .)
    Node filhoDireito;     // Referência para o filho direito (representa traço -)

    // Construtor padrão do Nodo
    public Node() {
        this.caractere = '\0';  // Inicializa com o caractere nulo
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }

    // Construtor com caractere
    public Node(char caractere) {
        this.caractere = caractere;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }
}

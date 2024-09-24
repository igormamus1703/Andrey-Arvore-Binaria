public class Nodo {
    char caractere;        // Armazena o caractere (letra ou número)
    Nodo filhoEsquerdo;    // Referência para o filho esquerdo (representa ponto .)
    Nodo filhoDireito;     // Referência para o filho direito (representa traço -)

    // Construtor padrão do Nodo
    public Nodo() {
        this.caractere = '\0';  // Inicializa com o caractere nulo
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }

    // Construtor com caractere
    public Nodo(char caractere) {
        this.caractere = caractere;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }
}

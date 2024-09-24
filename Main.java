public class Main {
    public static void main(String[] args) {
        ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();
        MorseInterpreter interpretador = new MorseInterpreter(arvore);  // Cria o interpretador
        
        // Exibe a estrutura da árvore de forma hierárquica
        arvore.exibirArvore();
        
        // Chama o método para o usuário digitar o código Morse
        interpretador.interpretarEntrada();
    }
}
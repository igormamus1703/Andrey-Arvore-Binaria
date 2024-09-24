public class Main {
    public static void main(String[] args) {
        ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();
        MorseInterpreter interpretador = new MorseInterpreter(arvore);  // Cria o interpretador
        
       
        try{ 
            // Exibe a estrutura da árvore de forma hierárquica
            arvore.exibirArvore();
            // Chama o método para o usuário digitar o código Morse
            interpretador.interpretarEntrada();
        
       }catch(Exception e){
            System.out.println("Erro ao exibir a árvore");
        }
        
    }
}
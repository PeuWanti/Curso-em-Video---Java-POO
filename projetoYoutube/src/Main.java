public class Main {
    public static void main(String[] args) {

        // --- 1. CRIANDO OS VÍDEOS ---
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula de HTML5");

        // --- 2. CRIANDO OS GAFANHOTOS (ESPECTADORES) ---
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Júlio", 22, "M", "juliogafanhoto");
        g[1] = new Gafanhoto("Maria", 19, "F", "mariazinha");

        System.out.println("=== ESTADO INICIAL ===");
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        System.out.println();

        // --- 3. TESTANDO AÇÕES DE VÍDEO (Interface AcoesVideo) ---
        System.out.println("=== TESTE: INTERFACE ACOESVIDEO ===");
        v[0].play();
        v[0].like();
        System.out.println(v[0].toString());
        System.out.println();

        // --- 4. TESTANDO VISUALIZAÇÃO E SOBRECARGA DE AVALIAÇÃO ---
        System.out.println("=== TESTE: VISUALIZAÇÃO E AVALIAÇÕES ===");

        // Visualização 1: Júlio assiste Aula 1 de POO e avalia sem parâmetros
        Visualizacao vis1 = new Visualizacao(g[0], v[0]);
        vis1.avaliar(); // Avaliação padrão
        System.out.println(vis1.toString());
        System.out.println();

        // Visualização 2: Júlio assiste Aula 12 de Java e avalia por Nota (ex: 8)
        Visualizacao vis2 = new Visualizacao(g[0], v[1]);
        vis2.avaliar(8); // Avaliação direta por nota
        System.out.println(vis2.toString());
        System.out.println();

        // Visualização 3: Maria assiste Aula 1 de POO e avalia por Porcentagem (ex: 85.0f)
        Visualizacao vis3 = new Visualizacao(g[1], v[0]);
        vis3.avaliar(85.0f); // Avaliação por porcentagem assistida
        System.out.println(vis3.toString());
        System.out.println();

        // --- 5. RESULTADO FINAL DOS OBJETOS ---
        System.out.println("=== ESTADO FINAL ===");
        System.out.println(v[0].toString()); // Deve ter 2 views, curtidas e média de avaliação atualizada
        System.out.println(g[0].toString()); // Deve ter totAssistido incrementado
    }
}
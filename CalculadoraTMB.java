
import java.util.Scanner;

public class CalculadoraTMB {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // --- 1. ENTRADA E VALIDAÇÃO DE DADOS ---
        // Garante a leitura válida do gênero aceitando variações de texto
        String genero = "";
        while (!genero.toLowerCase().contains("masculino") && !genero.toLowerCase().contains("homem")
                && !genero.toLowerCase().contains("feminino") && !genero.toLowerCase().contains("mulher")) {
            System.out.println("Qual é o seu gênero?");
            genero = leitor.nextLine();
        }

        // Validação da idade (impede valores zerados ou negativos)
        int idade = 0;
        while (idade <= 0) {
            System.out.println("Qual é a sua idade ?");
            idade = leitor.nextInt();
        }

        double peso = 0.0;
        while (peso <= 0) {
            System.out.println("Qual é o seu peso ?");
            String entrada = leitor.next();

            entrada = entrada.replace(',', '.');
            peso = Double.parseDouble(entrada);
        }

        double altura = 0.0;
        while (altura <= 0) {
            System.out.println("Qual é a sua altura ?");
            String entrada = leitor.next();

            entrada = entrada.replace(',', '.');
            altura = Double.parseDouble(entrada);
        }

        // --- 2. CÁLCULO DA TAXA METABÓLICA BASAL ---
        double totalTmb = 0;
        if (genero.toLowerCase().contains("masculino") || genero.toLowerCase().contains("homem")) {
            totalTmb = (10 * peso) + (6.25 * altura) - (5 * idade) + 5;
        } else if (genero.toLowerCase().contains("feminino") || genero.toLowerCase().contains("mulher")) {
            totalTmb = (10 * peso) + (6.25 * altura) - (5 * idade) - 161;
        }

        // --- 3. FATOR DE ATIVIDADE FÍSICA E GASTO DIÁRIO TOTAL ---
        double baixo = 1.2;
        double medio = 1.375;
        double alto = 1.725;
        double gastoTotal = 0.0;

        System.out.println("\nQuais dessas opçoes é o seu nível de intensidade física diária?");
        System.out.println("1 - Baixo | 2 - Médio | 3 - Alto");
        int opcao = leitor.nextInt();

        if (opcao == 1) {
            gastoTotal = totalTmb * baixo;
        } else if (opcao == 2) {
            gastoTotal = totalTmb * medio;
        } else if (opcao == 3) {
            gastoTotal = totalTmb * alto;
        } else {
            System.out.println("pergunta invalida!");
        }

        // --- 4. EXIBIÇÃO DOS RESULTADOS ---
        System.out.println("Gasto Basal (TMB): " + totalTmb + " kcal");
        System.out.println("Gasto Calórico Total Diário: " + gastoTotal + " kcal");

        leitor.close();
    }
}

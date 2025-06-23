import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Receber as 8 notas anuais
        double[] notas = new double[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // 2. Calcular as médias
        // Médias Bimestrais
        double mediaBimestre1 = (notas[0] + notas[1]) / 2;
        double mediaBimestre2 = (notas[2] + notas[3]) / 2;
        double mediaBimestre3 = (notas[4] + notas[5]) / 2;
        double mediaBimestre4 = (notas[6] + notas[7]) / 2;

        // Médias Semestrais
        double mediaSemestre1 = (mediaBimestre1 + mediaBimestre2) / 2;
        double mediaSemestre2 = (mediaBimestre3 + mediaBimestre4) / 2;

        // Média Final
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // 3. Apresentar os resultados
        System.out.println("\nResultados:");
        System.out.printf("1º Bimestre: %.1f\n", mediaBimestre1);
        System.out.printf("2º Bimestre: %.1f\n", mediaBimestre2);
        System.out.printf("1º Semestre: %.1f\n", mediaSemestre1);
        System.out.printf("---------+---++-----");
        
        System.out.printf("3º Bimestre: %.1f\n", mediaBimestre3);
        System.out.printf("4º Bimestre: %.1f\n", mediaBimestre4);
        System.out.printf("2º Semestre: %.1f\n", mediaSemestre2);
        System.out.printf("---------+---++-----");
        
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        scanner.close();
    }
}
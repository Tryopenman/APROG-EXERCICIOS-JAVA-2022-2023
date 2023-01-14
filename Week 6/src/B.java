import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nAlunos, numAprovados, nDisciplinas;
        String nomeDisciplina;
        nAlunos = input.nextInt();
        nDisciplinas = input.nextInt();

        for (int i = 0; i < nDisciplinas; i++){
            input.nextLine();
            nomeDisciplina = input.nextLine();
            numAprovados = input.nextInt();

            infDisciplinas(numAprovados, (nAlunos - numAprovados), nomeDisciplina);
        }
    }
    public static void infDisciplinas(int nAprovados, int nReprovados, String nomeDisciplina){
        String Aprovados = "", Reprovados ="";
        for (int i = 0; i < nAprovados; i++){
            Aprovados = Aprovados + "*";
        }
        for (int i = 0; i < nReprovados; i++){
            Reprovados = Reprovados + "*";
        }
        System.out.println("Subject: " + nomeDisciplina);
        System.out.println("- Approved: " + Aprovados);
        System.out.println("- Failed: " + Reprovados);
    }
}







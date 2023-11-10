package classes.classesterceiraaula;

public class Executar {
    public static void main(String[] args) {
        Pessoa ananias = new Pessoa("Ananias", 010130);
        Funcionario jeremias = new Funcionario("Jeremias", 5501, "Limpeza");

        /*Todo funcionário é uma pessoa */
        Pessoa apolo = new Funcionario("apolo", 111, "Solar");

        System.out.println("Matrícula de Ananias: "+ ananias.getMatricula());
        System.out.println("O departamento de Jeremias é: "+ jeremias.getDepartamento());
        System.out.println("O nome do funcionário de matrícula "+apolo.getMatricula()+"é: "+apolo.getNome());
    }
}

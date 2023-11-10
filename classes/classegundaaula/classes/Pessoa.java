package classes.classegundaaula.classes;

class Pessoa {
    //atributos
    public String nome;
    public int idade;

    //métodos
    void imprimenome(){
        System.out.println("O nome é: "+nome);
    }
    void mostrarnNomeIdade(){
        System.out.println("Nome: "+nome+" \nidade: "+idade);
    }
    public Pessoa(String n){
        nome = n;
    }
    public Pessoa(String n, int i) {
        nome = n;
        idade = i;
    }
}
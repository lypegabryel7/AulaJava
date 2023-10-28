package classejava;
class Pessoa {
    private String nome;
    public int idade;
    public float altura;
    
    public Pessoa(String n) {
        nome = n;
    }
    public String mostraNome(){
        return nome;      
    }
}
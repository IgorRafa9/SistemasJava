
package Adocao;

public class Pet {
    private String nome;
    private String raca;
    private int anoNasc;
    private char sexo;
    
    public Pet(String nome, String raca, int anoNasc, char sexo){
        this.nome=nome;
        this.raca=raca;
        this.anoNasc=anoNasc;
        this.sexo=sexo;
    }
    public String getInfoPet(){
        return nome + "|" + raca + "|" + anoNasc + "|" + sexo;
    }
}

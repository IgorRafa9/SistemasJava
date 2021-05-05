
package Adocao;

import java.util.ArrayList;


public class Pessoa {
    private String nome;
    private String cpf;
    private int anoNasc;
    ArrayList<Pet>petsAdotados;
    private static final int MAXIMO_PETS=2;
    
    public Pessoa(String nome, String cpf, int anoNasc){
        this.nome=nome;
        this.cpf=cpf;
        this.anoNasc=anoNasc;
        this.petsAdotados=new ArrayList();
    }
    public boolean adotarPet(Pet p){
        if(this.anoNasc<2003 && petsAdotados.size()<MAXIMO_PETS){
            petsAdotados.add(p);
            return true;
        }else{
            return false;
        }
    }
        
    public String listarPets(){
        String dados="";
        for(Pet p: petsAdotados){
            dados=dados+p.getInfoPet()+"\n";
        }
        return dados;
    }
    
        
}

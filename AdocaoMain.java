package Adocao;

import java.util.ArrayList;
import java.util.Scanner;

public class AdocaoMain {

    public static void main(String[] args) {   
        
        Scanner entrada=new Scanner(System.in);
        
        ArrayList<Pet>petAdocao=new ArrayList<>();
        Pet p1= new Pet("Brimstone","Vira-lata",1997,'M');
        Pet p2= new Pet("Warwick","Pastor Alemão",2002,'M');
        Pet p3= new Pet("Sage","Pitbull",2001,'F');
        Pet p4= new Pet("Reyna","Husky Siberiano",2000,'F');
        
        petAdocao.add(p1);
        petAdocao.add(p2);
        petAdocao.add(p3);
        petAdocao.add(p4);
        
        ArrayList<Pessoa>pessoa=new ArrayList<>();
        
        Pessoa pessoa1=new Pessoa("Igor","01904917526",1997);
        
        AdocaoMain.abrirMenuInciar(petAdocao, pessoa1, entrada);
        AdocaoMain.listarPetsAdotados(pessoa1);
    }
    public static void abrirMenuInciar(ArrayList<Pet>petsAdocao, Pessoa pessoa,Scanner entrada){
        String opcao ="X";
            while(!opcao.equals("4")){
                System.out.println(" O que deseja fazer ?"+ "\n"
                        + "1) Adotar pet" + "\n"
                        + "2) Listar pets adotados" + "\n"
                        + "3) Listar pets restantes" + "\n" 
                        + "4) Sair");
                       
                opcao = entrada.next();
                    if(opcao.equals("1")){
                    AdocaoMain.realizarAdocao(pessoa, petsAdocao, entrada);
                  }else if(opcao.equals("2")){
                      AdocaoMain.listarPetsAdotados(pessoa);
                  }else if(opcao.equals("3")){
                      AdocaoMain.listarPetsRestantes(petsAdocao);
                  }
            }
    }

    private static void realizarAdocao(Pessoa pessoa, ArrayList<Pet> petsAdocao, Scanner entrada) {
        System.out.println("Informe qual pet deseja adotar: ");
        for (int i = 0; i < petsAdocao.size(); i++) {
            System.out.println(i + " - " + petsAdocao.get(i).getInfoPet());
            
        }
        int numeroPet = entrada.nextInt();
        Pet candidato = petsAdocao.get(numeroPet);
        if (pessoa.adotarPet(candidato) == true) {
            
            System.out.println("Pet " + numeroPet + " adotado com sucesso!");
            System.out.println(candidato.getInfoPet());
            petsAdocao.remove(candidato);
            System.out.println("\n");
        } else {
            System.out.println("Você já adotou o máximo de pets permitidos!\n");
        }
    }
    
    private static void listarPetsAdotados(Pessoa pessoa) {
        System.out.println("\nPets adotados até o momento:");
        System.out.println(pessoa.listarPets());   
    }
    
    private static void listarPetsRestantes(ArrayList<Pet> petsAdocao) {
        System.out.println("\nPets restantes para adoção: ");
        for (Pet p : petsAdocao) {
            System.out.println(p.getInfoPet());
        }
    }
  }


package list.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados =  new ConjuntoConvidados();
        System.out.println();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado dentro do set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 01", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 02", 1212);
        conjuntoConvidados.adicionarConvidado("Convidado 03", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 04", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de Convidados");

        conjuntoConvidados.exibirConvidado();
        
        

    }

}

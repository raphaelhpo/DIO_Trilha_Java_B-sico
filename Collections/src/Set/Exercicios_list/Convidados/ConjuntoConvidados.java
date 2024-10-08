package Set.Exercicios_list.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    public Set<Convidado> convidados;
    
    public ConjuntoConvidados(){
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo_convidado){
        convidados.add(new Convidado(nome, codigo_convidado));
    }

    public void remover_convidado_por_codigo_convite(int Codigo_convite){
        Convidado convidado_para_excluir = null;
        for(Convidado convidado: convidados){
            if(convidado.getCodigo_Convite() == Codigo_convite){
                convidado_para_excluir = convidado;
                break;
                //Esse Break é utilizado, pois, se removemos um código do SET, não teremos outro repetido.
            }
        }
        convidados.remove(convidado_para_excluir);
    }

    public int contar_convidados(){
        return convidados.size();
    }

    public void exibir_convidados(){
        System.out.println("\n");
        for(Convidado convidado: convidados){
            System.out.println(convidado.toString());
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Alice", 1);
        conjuntoConvidados.adicionarConvidado("Bob", 4);
        conjuntoConvidados.adicionarConvidado("Charlie", 3);
        conjuntoConvidados.adicionarConvidado("David", 4);
        conjuntoConvidados.adicionarConvidado("Eve", 5);
        conjuntoConvidados.exibir_convidados();
        conjuntoConvidados.remover_convidado_por_codigo_convite(3);
        conjuntoConvidados.exibir_convidados();

        System.out.println("\n"+conjuntoConvidados.contar_convidados());
    }
}

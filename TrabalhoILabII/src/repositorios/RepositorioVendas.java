
package repositorios;

import model.Venda;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class RepositorioVendas {
    private List<Venda> listaVendas;

    public RepositorioVendas() {
        listaVendas = new ArrayList<>();
    }

    public boolean adicionaVenda(Venda venda) {
        return (listaVendas.add(venda));
    }
     public List<Venda> getListaVendas() {
        return listaVendas;
    }

    public List<Venda> getListaVendasFinalizadas() {
        List<Venda> vendasFinalizadas = new ArrayList<>();
        for(Venda v: listaVendas){
            if(v.estaFinalizado()){
                vendasFinalizadas.add(v);
            }
        }
        return(vendasFinalizadas);
    }
     
    public List<Venda> getListaVendasPorCliente(String cpf) {
        List<Venda> vendasPorCliente = new ArrayList<>();
        for(Venda v: listaVendas){
            if(v.getCliente().getCpf().equals(cpf)){
                vendasPorCliente.add(v);
            }
        }
        return(vendasPorCliente);
    }
   
    public List<Venda> getListaVendasPorMesEAno(int mes, int ano) {
        List<Venda> vendasPorMes = new ArrayList<>();
        Calendar calendario = Calendar.getInstance();
        
        for(Venda v: listaVendas){
            calendario.setTime(v.getHorario());
            if(calendario.get(Calendar.MONTH)==(mes-1) 
                    && calendario.get(Calendar.YEAR)==ano)
                vendasPorMes.add(v);
        }
        return(vendasPorMes);
    }

    public boolean vendaExiste(int codigo) {
        for (Venda venda : listaVendas) {
            if (venda.getcodVendaGerado()==codigo) {
                return true;
            }
        }
        return false;
    }

    public Venda buscarComprasPorCodigo(int codigo) {
        for (Venda venda : listaVendas) {
            if (venda.getcodVendaGerado()== codigo) {
                return venda;
            }
        }
        return null;
    }
    
    public List<Venda> buscarVendasPorCliente(String cpf) {
        List<Venda> vendas = new ArrayList<>();
        for (Venda venda : listaVendas) {
            if (venda.getCliente().getCpf().equals(cpf)) {
                vendas.add(venda);
           }
        }
        return vendas;
    }    

     public List<Venda> getVendasFinalizadas(){
        List<Venda> vendas = new ArrayList<>();
        for (Venda venda : listaVendas) {
            if (venda.estaFinalizado()) {
                vendas.add(venda);
           }
        }
        return vendas;
    }
} 
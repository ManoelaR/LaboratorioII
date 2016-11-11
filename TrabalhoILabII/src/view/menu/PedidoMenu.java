package view.menu;

public class PedidoMenu {
    public static final int OpcaoAdicionar = 1;
    public static final int OpcaoListar = 2;   
    public static final int OpcaoFinalizar = 0;
    
    public static String getOpcoes() {
        return ("\n.........................................\n"
                + "1: Adicionar Itens ao Pedido\n"
                + "2: Remover Itens do Pedido\n"               
                + "0: Finalizar Pedido"        
                + "\n........................................."); 
    }
}

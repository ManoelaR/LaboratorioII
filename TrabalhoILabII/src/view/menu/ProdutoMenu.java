package view.menu;


public class ProdutoMenu {
    public static final int OpcaoCadastrar = 1;
    public static final int OpcaoListar = 2;
    public static final int OpcaoVoltar = 0;

    public static String getOpcoes() {
        return ("\n.........................................\n"
                + "1: Cadastro de Produtos\n"
                + "2: Visualizar Produtos\n"               
                + "0: Voltar"        
                + "\n........................................."); 
    }    
}

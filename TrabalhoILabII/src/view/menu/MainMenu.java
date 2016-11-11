package view.menu;

public class MainMenu {

    public static final int OpcaoClientes = 1;
    public static final int OpcaoProdutos = 2;
    public static final int OpcaoConta = 3;
    public static final int OpcaoVenda = 4;
    public static final int OpcaoRelatorio = 5;
    public static final int OpcaoSair = 0;

    public static String getOpcoes() {
        return ("\n.........................................\n"
                + "1: Menu Clientes\n"
                + "2: Menu Produtos\n"
                + "3: Acessar Conta\n"
                + "4: Menu Vendas\n"
                + "5: Relatórios de Atividades\n"
                + "0: Sair"
                + "\n.........................................");
    }
}

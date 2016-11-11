package view.menu;

public class RelatorioMenu {
    public static final int OpcaoListarVendasFinalizadas = 1;
    public static final int OpcaoListarVendasPorCliente = 2;
    public static final int OpcaoListasVendasPorMesEAno = 3;
    public static final int OpcaoVoltar = 0;

    public static String getOpcoes() {
        return ("\n.........................................\n"
                + "1: Visualizar Vendas Finalizadas\n"
                + "2: Visualizar Vendas Por Cliente\n"
                + "3: Visualizar Vendas do Mês\n"
                + "0: Voltar"
                + "\n.........................................");
    }          
}

package view.menu;

public class ClienteMenu {
    public static final int OpcaoCadastro = 1;
    public static final int OpcaoListar = 2;
    public static final int OpcaoVoltar = 0;

    public static String getOpcoes() {
        return ("\n.........................................\n"
                + "1: Cadastro de Cliente\n"
                + "2: Visualizar Clientes\n"
                + "0: Voltar"
                + "\n.........................................");
    }    
}

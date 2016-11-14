package view.menu;

public class ContaMenu {
    
    public static final int OpcaoSaldo = 1;
    public static final int OpcaoDeposito = 2;
    public static final int OpcaoTransferencia = 3;
    public static final int OpcaoVoltar = 0;
    
    public static String getOpcoes(){
        return ("\n.........................................\n"
                + "1: Consulta de Saldo\n"
                + "2: Realizar Depósito\n"
                + "3: Realizar Transferência\n"
                + "0: Voltar"
                + "\n.........................................");
    }    
}



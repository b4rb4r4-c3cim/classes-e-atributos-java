
public class Exer1 {
    public static void main(String[] args){

        Conta contaCorrente = new Conta();
        contaCorrente.numero = " 33455667";
        contaCorrente.agencia = "3456";
        contaCorrente.saldo = 100;
        contaCorrente.contaEspecial = true;
        contaCorrente.limite = 500;

        System.out.println("Numero da conta: " + contaCorrente.numero );
        System.out.println("Numero da agencia: " + contaCorrente.agencia );
        System.out.println("Saldo da conta: " + contaCorrente.saldo );
        System.out.println("Conta especial? " + contaCorrente.contaEspecial );
        System.out.println("Limite da conta: " + contaCorrente.limite );
    }
}

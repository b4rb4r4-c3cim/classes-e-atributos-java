public class Exer2 {
    public static void main(String[] args)
    {
        Contato contato1 = new Contato();
        contato1.nome = "Barbara";
        contato1.endereco = "alameda 5";
        contato1.email = "barbara@gmail.com";
        contato1.telefones = new String[5];
        contato1.telefones [0] = "9999-9999";
        contato1.telefones [1] = "9999-9978";
        contato1.telefones [2] = "9999-9478";

        System.out.println("Nome do contato: " + contato1.nome);
        System.out.println("Endereco do contato: " + contato1.endereco);
        System.out.println("Email do contato: " + contato1.email);
        System.out.println("Telefone 1 do contato: " + contato1.telefones[0]);
        System.out.println("Telefone 2 do contato: " + contato1.telefones[1]);
        System.out.println("Telefone 3 do contato: " + contato1.telefones[2]);


        }
}

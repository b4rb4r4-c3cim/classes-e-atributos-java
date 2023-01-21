public class Exer3 {
    public static void main(String[] args){
       
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "LED";
        lampada.garantiaMeses = 36;
        lampada.tipoAbajur = false;

        System.out.println("Modelo da lampada: " + lampada.modelo);
        System.out.println("Tensao da lampada: " + lampada.tensao);
        System.out.println("Potencia da lampada: " + lampada.potencia);
        System.out.println("Cor da lampada: " + lampada.cor);
        System.out.println("Tipo de luz da lampada: " + lampada.tipoLuz);
        System.out.println("Garantia em meses da lampada: " + lampada.garantiaMeses);
        System.out.println("Eh uma lampada tipo abajur? " + lampada.tipoAbajur);


    }
}

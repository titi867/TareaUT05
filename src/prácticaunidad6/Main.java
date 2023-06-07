package prácticaunidad6;

public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Manuel Mantecas", "0000-1234-55-123456789", 3000, 0);
        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = miCuenta.getEstado();
        System.out.println("El saldo actual es" + saldoActual);
    }

}

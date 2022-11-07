public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("feijão",0.233);
        Comida c2 = new Comida("arroz",0.500);
        Comida c3 = new Comida("bisteca",0.700);


        Pessoa p1 = new Pessoa("salomão",90.00);

        System.out.println(p1.apresentacao());
        double comi = c1.peso + c2.peso + c3.peso;
        System.out.println("Comi "+ comi+" Kilos");
        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c3);

        System.out.println(p1.apresentacao());



    }}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shipping shipping = new Shipping();
        executeOptions(shipping);
    }

    private static void executeOptions(Shipping shipping) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println(
                "1- Afiliar tienda a la compañía de envíos.\n" +
                "2- Cancela afiliación de la compañía de envíos.\n" +
                "3- Agendar envío.\n" +
                "8- Salir");
        int menuOption = sc.nextInt();

        switch (menuOption){
            case 1:
                System.out.println("Nombre de la tienda: ");
                String nameToBeAdded = sc2.nextLine();

                Store store = new Store(nameToBeAdded);
                shipping.addStore(store);

                System.out.println("Se ha afiliado correctamente la tienda, ahora puede recibir peticiones de compra.");
                executeOptions(shipping);
                break;

            case 2:
                shipping.getStores().forEach(System.out::println);

                System.out.println("Cancelar afiliación de la tienda: ");
                String nameToBeRemoved = sc2.nextLine();

                shipping.removeByName(nameToBeRemoved);
                System.out.println("Se ha cancelado afiliación de la tienda, no puede recibir nuevas solicitudes de compra.");
                executeOptions(shipping);
                break;

            case 3:
                System.out.println("Registrar nueva petición de compra: ");
                String newOrder = sc2.nextLine();
                shipping.createShipping(newOrder);
                executeOptions(shipping);
                System.out.println("Se le notificará a nuestra tiendas registradas, en breve recibirá ofertas en su correo. ");
                break;
            case 8:
                System.out.println("Gracias por utilizar nuestro sistema!");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        sc.close();
        sc2.close();
    }
}
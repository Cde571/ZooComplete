package view;

import controller.Habitat;
import controller.Store;
import model.AnimalDomestico;
import model.AnimalSalvaje;
import model.Product;

public class MainZoo {
    public static void main(String[] args) {
        Habitat granja = new Habitat("123", "Granja", "espacio para gallinas y patos", 250f);
        Habitat mundoMarino = new Habitat("456", "Mundo Marino", "espacio para peces", 300f);

        AnimalDomestico gallina = new AnimalDomestico("001", "Gallina", "Gallinazo Común", "Coragyps atratus", "Culeca", "Amarillo", 2.5);
        AnimalDomestico pato = new AnimalDomestico("002", "Pato", "Patos Chapoteadores", "Antidae", "ganzo", "Marron", 2.8);
        AnimalDomestico firulais = new AnimalDomestico("003", "Perro", "Perro", "Canidae", "Pastor Aleman", "Cafe", 4.7);
        AnimalSalvaje pez = new AnimalSalvaje("004", "PezCuezon", "Peces suela", "Achiridae", 3, false);
        AnimalSalvaje globo = new AnimalSalvaje("005", "Pez Globo", "Peces globo", "Tetraodontidae", 4, false);
        AnimalSalvaje raya = new AnimalSalvaje("006", "Raya", "Rayas Latigo", "Myliobatiformes", 6, true);

        granja.addAnimalToList(gallina);
        granja.addAnimalToList(pato);
        granja.addAnimalToList(firulais);

        mundoMarino.addAnimalToList(pez);
        mundoMarino.addAnimalToList(globo);
        mundoMarino.addAnimalToList(raya);

        Product p1 = new Product("007", "Camiseta Zoo", 15, 20, 10000f);
        Product p2 = new Product("008", "Gorra Zoo", 15, 20, 5000f);

        Store tienda = new Store();
        tienda.addHabitat(granja);// 0 Dato habitat
        tienda.addHabitat(mundoMarino); // 1 Habitat
        tienda.addProducto(p1); // 2 Product
        tienda.addProducto(p2); // 3 Product

        System.out.println("Precio de entrada a " + tienda.getHabitat(0).getName() + " : " + tienda.getHabitat(0).calculatePrice());
        System.out.println("Precio de entrada a " + tienda.getHabitat(1).getName() + " : " + tienda.getHabitat(1).calculatePrice());
        System.out.println("Producto de " + tienda.getProduct(0).getName() + " : "
                        + tienda.getProduct(0).calculatePrice() + " ; Cantidad en stock: "
                        + tienda.getProduct(0).getStock());

        tienda.getProduct(0).setStock(tienda.getProduct(0).getStock() - 2);

        System.out.println("Producto de " + tienda.getProduct(0).getName() + " : "
                + tienda.getProduct(0).calculatePrice() + " ; Cantidad en stock: "
                + tienda.getProduct(0).getStock());
    }
}

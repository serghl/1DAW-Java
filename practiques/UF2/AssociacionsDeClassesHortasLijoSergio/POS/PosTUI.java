/*
 * PosTUI.java
 * 
 *
 */


public class PosTUI {
    
    public static void main(String[] args) {
        Product p1 = new Product(111,"Cepillo de dientes","Colgate",3.50);
        Product p2 = new Product(222,"Patatas fritas","Lays",1.75);
        Product p3 = new Product(333,"Garbanzos en lata","Luengo",2.25);
        Product p4 = new Product(444,"Zumo de naranja","Don Simon",0.95);
        Product p5 = new Product(555,"Lavavajillas","Fairy",4.30);
        Product p6 = new Product(666,"Detergente","Dixan",12.50);
        Product p7 = new Product(777,"Mejillones","Rianxeira",4.55);
        Product p8 = new Product(888,"Lata 33cl","Coca cola",2.70);
        Product p9 = new Product(999,"Pack 6x25cl","Estrella Galicia",4.25);
        
        // Creamos 3 catálogos en los que almacenamos los productos, por categorias
        Catalog c1 = new Catalog("Droguería");
        Catalog c2 = new Catalog("Bebidas");
        Catalog c3 = new Catalog("Alimentacion");
        
        c1.add(p1);
        c1.add(p5);
        c1.add(p6);
        
        c2.add(p4);
        c2.add(p8);
        c2.add(p9);
        
        c3.add(p2);
        c3.add(p3);
        c3.add(p7);
                
        System.out.println("----------------------------------");
        System.out.println("Numero de productos del CATALOGO 1");
        System.out.println(c1.productsNumber());
        
        // Creamos 3 salelines
        SaleLine sl1 = new SaleLine(3,p1);
        SaleLine sl2 = new SaleLine(5,p8);
        SaleLine sl3 = new SaleLine(1,p9);
         
        // Creamos una venta con los 3 salelines anteriores
        Sale s1 = new Sale(12345,"23/3/2022-09:52");
        s1.add(sl1);
        s1.add(sl2);
        s1.add(sl3);
        System.out.println("----------------------------------");
        System.out.println("Ticket 12345");
        System.out.println(s1.totalAmount());
    }
}


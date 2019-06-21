import java.lang.reflect.Array;
import java.util.*;

public class ChipotleJr {
    public static void main(String[] args) {
        int[] num = {3, 6, 3, 5, 5};
        int q, y, z = 0;
        String str1 = "";
        Random rand = new Random ();
        Random rnd = new Random ();
        double price = 0.00;

        //populating rice Arraylist
        ArrayList<String> burrito = new ArrayList<> ();
        ArrayList<String> rice = new ArrayList<> ();
        rice.add ( "Brown rice" );
        rice.add ( "White rice" );
        rice.add ( "No rice" );
        burrito.add ( rice.get ( (int) (Math.random () * rice.size ()) ) );


        //populating meat  Arraylist

        ArrayList<String> meat = new ArrayList<> ();
        meat.add ( "Chicken" );
        meat.add ( "Steak" );
        meat.add ( "Carnidas" );
        meat.add ( "Chorizo" );
        meat.add ( "Sofritas" );
        meat.add ( "Veggies" );
        burrito.add ( meat.get ( (int) (Math.random () * meat.size ()) ) );

        //populating Beans Arraylist

        ArrayList<String> beans = new ArrayList<> ();
        beans.add ( "Pinto beans" );
        beans.add ( "black beans" );
        beans.add ( "No beans" );
        burrito.add ( beans.get ( (int) (Math.random () * beans.size ()) ) );


        //populating Salsa Arraylist

        ArrayList<String> salsa = new ArrayList<> ();

        salsa.add ( "Mild salsa" );
        salsa.add ( "Medium salsa" );
        salsa.add ( "Hot salsa" );
        salsa.add ( "No salsa" );
        salsa.add ( "All salsa" );
        burrito.add ( salsa.get ( (int) (Math.random () * salsa.size ()) ) );

        //populating Veggies Arraylist

        ArrayList<String> veggies = new ArrayList<> ();
        veggies.add ( "Lettuce" );
        veggies.add ( "Fajita veggies" );
        veggies.add ( "Veggies" );
        veggies.add ( "No veggies" );
        veggies.add ( "All veggies " );
        burrito.add ( veggies.get ( (int) (Math.random () * veggies.size ()) ) );

        String[] ingredients = {"rice", "meat", "beans", "salsa", "veggies"};
        String[] extraIngredients = {" cheese ", " guac ", " queso ", " sour_Cream "};


        ArrayList<String> cheese = new ArrayList<> ();

        cheese.add ( "Cheese" );
        cheese.add ( "No cheese" );
        burrito.add ( cheese.get ( (int) (Math.random () * cheese.size ()) ) );

        ArrayList<String> guac = new ArrayList<> ();

        guac.add ( "Guac" );
        guac.add ( "No Guac" );
        burrito.add ( guac.get ( (int) (Math.random () * guac.size ()) ) );

        ArrayList<String> queso = new ArrayList<> ();

        queso.add ( "Queso" );
        queso.add ( "No queso" );
        burrito.add ( queso.get ( (int) (Math.random () * queso.size ()) ) );

        ArrayList<String> sour_Cream = new ArrayList<> ();

        sour_Cream.add ( "Sour_Cream" );
        sour_Cream.add ( "No sour_Cream" );
        burrito.add ( sour_Cream.get ( (int) (Math.random () * sour_Cream.size ()) ) );

        for (int i = 1; i < 26; i++) {
            int count = 5;

            System.out.print ( "Burrito " + i + ": " );

            for (int j = 0; j < 5; j++) {
                q = num[j];
                y = rand.nextInt ( q );


                switch (j) {

                    case 0:

                        System.out.print ( rice.get ( y ) + ", " );
                        break;
                    case 1:

                        System.out.print ( meat.get ( y ) + ", " );
                        break;
                    case 2:
                        System.out.print ( beans.get ( y ) + ", " );
                        break;
                    case 3:

                        if (str1 == "all") {
                            for (int n = 0; n < (salsa.size () - 2); n++) {
                                System.out.print ( salsa.get ( y ) + ", " );
                            }
                            count = count + 2;
                        } else {
                            System.out.print ( salsa.get ( y ) + ", " );
                            break;
                        }

                    case 4:
                        if (str1 == "all") {
                            for (int l = 0; l < (veggies.size () - 2); l++) {
                                System.out.println ( veggies.get ( y ) + " " );
                            }
                            count = count + 2;
                        } else {
                            System.out.println ( veggies.get ( y ) + "" );
                            break;

                        }


                    default:
                }

                count++;
            }


            price = 3 + (count * .5);
            System.out.println ( "Price: $" + price );

        }

    }
}













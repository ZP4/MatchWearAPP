package matchwear.com.matchwearapp;

import java.net.FileNameMap;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by ZP4 on 12/2/2016.
 */

public class Food {
public HashMap<String, HashMap> American= new HashMap<String, HashMap>();
public HashMap<String, HashMap> Brooklyn= new HashMap<String, HashMap>();
    public Food() {
        HashMap<String, HashMap> AA     = new HashMap<String, HashMap>();
        HashMap<String, String>FMNCB    = new HashMap<String,String>();
        FMNCB.put("Title", "Fried Mac N Cheese Balls");
        FMNCB.put("Description","Crispy balls filled with homemade mac n' cheese" );
        FMNCB.put("Price", "$29.99");
        FMNCB.put("Servings","20 pieces" );
        FMNCB.put("ID","USA01");
        HashMap<String, String>PCS      = new HashMap<String, String>();
        PCS.put("Title", "Philly Cheeseteak Sliders");
        PCS.put("Description", "Thinly sliced steak meat cooked with peppers and onions, and covered in provolone cheese");
        PCS.put("Price", "$45.99");
        PCS.put("Servings", "20 sandwiches");
        PCS.put("ID", "USA02");
        HashMap<String, String>NECCS    = new HashMap<String, String>();
        NECCS.put("Title", "New England Clam Chowder Soup");
        NECCS.put("Description", "A thick soup made with clams, onions, salt pork, potatoes, and milk");
        NECCS.put("Price", "$35.99");
        NECCS.put("Servings", "1 large bowl");
        NECCS.put("ID", "USA03");
        HashMap<String,HashMap>AE       = new HashMap<String, HashMap>();
        HashMap<String, String>SM       = new HashMap<String, String>();
        SM.put("Title", "Sliced Meatloaf");
        SM.put("Description", "Juicy carved meat loaf slices with a pour over tomato sauce");
        SM.put("Price", "$39.99");
        SM.put("Servings", "2-3 slices per person");
        SM.put("ID", "USE01");
        HashMap<String, String>CDRC     = new HashMap<String, String>();
        CDRC.put("Title", "Carved Double Roasted Chicken");
        CDRC.put("Description", "Carved roasted chicken marinated in rosemary and garlic  served with mushrooms and carrots");
        CDRC.put("Price", "$34.99");
        CDRC.put("Servings", "Whole chicken- precut");
        CDRC.put("ID", "USE02");
        HashMap<String, String>PCT      = new HashMap<String, String>();
        PCT.put("Title", "Paremsan Crusted Ttilapia");
        PCT.put("Description", "Garlic seasoned tilapia baked with shredded parmesan ");
        PCT.put("Price", "$34.99");
        PCT.put("Servings", "15 pieces");
        PCT.put("ID", "USE03");
        HashMap<String, HashMap>ASD     = new HashMap<String, HashMap>();
        HashMap<String, String>MP       = new HashMap<String, String>();
        MP.put("Title", "Mashed Potatoes");
        MP.put("Description","Buttery mashed potatoes that'll remind you of home ");
        MP.put("Price","$24.99");
        MP.put("Servings", "1 tray");
        MP.put("ID","USS01");
        HashMap<String, String>PS       = new HashMap<String, String>();
        PS.put("Title", "Potato Salad");
        PS.put("Description","Boiled potatoes dressed with olive oil, vinegar, finely minced parsley and garlic, hot chili peppers and salt");
        PS.put("Price","$20.99");
        PS.put("Servings", "1 large bowl");
        PS.put("ID","USS02");
        HashMap<String,String>SS        = new HashMap<String, String>();
        SS.put("Title", "Side Salad");
        SS.put("Description", "Salad included with croutons, shredded carrots, cucumbers and tomatoes served with choice of dressing");
        SS.put("Price", "$19.99");
        SS.put("Servings", "1 large bowl");
        SS.put("ID", "USS03");
        HashMap<String, HashMap>AD      = new HashMap<String, HashMap>();
        HashMap<String, String>AP       = new HashMap<String, String>();
        AP.put("Title", "Apple Pie");
        AP.put("Description", "fresh apples, mixed with the perfect blend of brown sugar and cinnamon");
        AP.put("Price", "$32.99");
        AP.put("Servings", "10 pieces");
        AP.put("ID", "USD01");
        HashMap<String, String>IC       = new HashMap<String, String>();
        IC.put("Title", "Ice Cream");
        IC.put("Description", "Comes in a variety of flavors; coconut, vanilla, lime , avocado, peanut, banana, and chocolate");
        IC.put("Price", "$24.99");
        IC.put("Servings", "10 bowls");
        IC.put("ID", "USD02");
        HashMap<String, String>RVC      = new HashMap<String, String>();
        RVC.put("Title", "Red Velvet Cupcakes");
        RVC.put("Description", "Fluffy, moist cupcakes with tangy cream cheese frosting heaped on top");
        RVC.put("Price", "$34.99");
        RVC.put("Servings", "10 cupcakes");
        RVC.put("ID", "USD03");


        AA.put("Fred Mac N Cheese Balls", FMNCB);
        AA.put("Philly Cheeseteak Sliders",PCS);
        AA.put("New England Clam Chowder Soup",NECCS);
        American.put("Appitizer", AA);
        AE.put("Sliced Meatloaf", SM);
        AE.put("Carved Double Roasted Chicken", CDRC);
        AE.put("Paremsan Crusted Ttilapia", PCT);
        American.put("Entrees", AE);
        ASD.put("Mashed Potatoes",MP);
        ASD.put("Potato Salad",PS);
        ASD.put("Side Salad",SS);
        American.put("Side Dish",ASD);
        AD.put("Apple Pie", AP);
        AD.put("Ice Cream", IC);
        AD.put("Red Velvet Cupcakes", RVC);
        American.put("Desserts", AD);

        HashMap<String, HashMap>BA      = new HashMap<String, HashMap>();
        HashMap<String, String>BP       = new HashMap<String, String>();
        BP.put("Title", "Bagel Pops");
        BP.put("Description", "Small bagel bites filled with cream cheese, and served on a stick");
        BP.put("Price", "$29.99");
        BP.put("Servings", "20 pieces");
        BP.put("ID", "BKA01");
        HashMap<String, String>CIHD     = new HashMap<String, String>();
        CIHD.put("Title", "Coney Island Hot Dog");
        CIHD.put("Description", "Iconic Coney Island hotdogs, topped with relish, deli mustard, chili and ketchup");
        CIHD.put("Price", "$29.99");
        CIHD.put("Servings", "10 pieces");
        CIHD.put("ID", "BKA02");
        HashMap<String, String>HW       = new HashMap<String, String>();
        HW.put("Title", "Hot Wings");
        HW.put("Description", "Cripsy boneless wings slathered in a flavor of your chocie and served with blue cheese");
        HW.put("Price", "$39.99");
        HW.put("Servings", "20 pieces");
        HW.put("ID", "BKA03");
        HashMap<String, HashMap>BE      = new HashMap<String, HashMap>();
        HashMap<String, String>BKB      = new HashMap<String, String>();
        BKB.put("Title", "BK Burger");
        BKB.put("Description", "Half pound beef burger with hot pastrami and melted swiss cheese, served with steak fries");
        BKB.put("Price", "$59.99");
        BKB.put("Servings", "10 pieces");
        BKB.put("ID", "BKE01");
        HashMap<String, String>PP       = new HashMap<String, String>();
        PP.put("Title", "Pulled Pork");
        PP.put("Description", "juicy pork is cooked carefully at low temperatures, steadily tenderizing the meat as it is seasoned carefully");
        PP.put("Price", "$49.99");
        PP.put("Servings", "15 pieces");
        PP.put("ID", "BKE02");
        HashMap<String, String>P        = new HashMap<String, String>();
        P.put("Title", "Pizza");
        P.put("Description", " A staple that consists of baked dough and marinara sauce, topped with melted mozzeralla");
        P.put("Price", "$59.99");
        P.put("Servings", "3 pies");
        P.put("ID", "BKE03");
        HashMap<String, HashMap>BSD     = new HashMap<String, HashMap>();
        HashMap<String, String>BWC      = new HashMap<String, String>();
        BWC.put("Title", "Bacon-Wrapped Crab");
        BWC.put("Description", "Juicy strips of crab wrapped with thin cut bacon");
        BWC.put("Price", "$39.99");
        BWC.put("Servings", "20 pieces");
        BWC.put("ID", "BKS01");
        HashMap<String, String>FC       = new HashMap<String, String>();
        FC.put("Title", "Fried Calamari");
        FC.put("Description", "Lightly fried Squid with a fresh marinara sauce");
        FC.put("Price", "$39.99");
        FC.put("Servings", "1 large tray");
        FC.put("ID", "BKS02");
        HashMap<String, String>MS       = new HashMap<String, String>();
        MS.put("Title", "Mozzarella Sticks");
        MS.put("Description", "Mozzarella sticks covered in bread crumbs and fried till golden brown");
        MS.put("Price", "$39.99");
        MS.put("Servings", "1 tray");
        MS.put("ID", "BKS03");
        HashMap<String, HashMap>BD      = new HashMap<String, HashMap>();
        HashMap<String, String>NYC      = new HashMap<String, String>();
        NYC.put("Title", "New York Cheesecake");
        NYC.put("Description", "Iconic New York Cheesecake");
        NYC.put("Price", "$49.99");
        NYC.put("Servings", "1 tray");
        NYC.put("ID", "BKD01");
        HashMap<String, String >IBC     = new HashMap<String, String>();
        IBC.put("Title", "Italian Bakery Canolis");
        IBC.put("Description", "Crisp, yet soft, cannoli shells filled with fresh cream");
        IBC.put("Price", "$59.99");
        IBC.put("Servings", "1 tray");
        IBC.put("ID", "BKD02");
        HashMap<String, String>CC       = new HashMap<String, String>();
        CC.put("Title", "Cotton Candy");
        CC.put("Description", "A light, very sweet candy of threaded sugar, often tinted with food coloring and twirled onto a stick");
        CC.put("Price", "$19.99");
        CC.put("Servings", "10 bags");
        CC.put("ID", "BKD03");



        BA.put("Bagel Pops", BP);
        BA.put("Coney Island Hot Dog", CIHD);
        BA.put("Hot Wings", HW);
        Brooklyn.put("Appitizer", BA);
        BE.put("BK Burger", BKB);
        BE.put("Pulled Pork", PP);
        BE.put("Pizza", P);
        Brooklyn.put("Entrees", BE);
        BSD.put("Bacon-Wrapped Crab",BWC);
        BSD.put("Fried Calamari", FC);
        BSD.put("Mozzarella Sticks", MS);
        Brooklyn.put("Side Dish",BSD);
        BD.put("New York Cheesecake",NYC);
        BD.put("Italian Bakery Canolis",IBC);
        BD.put("Cotton Candy",CC);
        Brooklyn.put("Desserts", BD);





    }
}

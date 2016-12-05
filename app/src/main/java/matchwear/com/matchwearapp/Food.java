package matchwear.com.matchwearapp;

import java.net.FileNameMap;
import java.util.HashMap;

/**
 * Created by ZP4 on 12/2/2016.
 */

public class Food {
public HashMap<String, HashMap> American= new HashMap<String, HashMap>();


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

    }
}

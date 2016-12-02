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
        SM.put("Title","Sliced Meatloaf");
        SM.put("Description", "Juicy carved meat loaf slices with a pour over tomato sauce");
        SM.put("Price", "$39.99");
        SM.put("Servings", "2-3 slices per person");
        SM.put("ID", "USE01");
        








        AA.put("Fred Mac N Cheese Balls", FMNCB);
        AA.put("Philly Cheeseteak Sliders",PCS);
        AA.put("New England Clam Chowder Soup",NECCS);
        American.put("Appitizer", AA);
        AE.put("Sliced Meatloaf", SM);
        American.put("Entrees", AE);

    }
}

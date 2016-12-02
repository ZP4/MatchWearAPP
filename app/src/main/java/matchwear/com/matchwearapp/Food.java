package matchwear.com.matchwearapp;

import java.net.FileNameMap;
import java.util.HashMap;

/**
 * Created by ZP4 on 12/2/2016.
 */

public class Food {
public HashMap<String, HashMap> American= new HashMap<String, HashMap>();


    public Food() {
        HashMap<String, HashMap> AA = new HashMap<String, HashMap>();
        HashMap<String, String>FMNCB  = new HashMap<String,String>();
        FMNCB.put("Title", "Fried Mac N Cheese Balls");
        FMNCB.put("Description","Crispy balls filled with homemade mac n' cheese" );
        FMNCB.put("Price", "$29.99");
        FMNCB.put("Servings","20 pieces" );
        FMNCB.put("ID","USA01");







        AA.put("Fred Mac N Cheese Balls", FMNCB);
    American.put("Appitizer", AA);

    }
}

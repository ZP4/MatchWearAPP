package matchwear.com.matchwearapp;

import java.util.HashMap;


/**
 * Created by ZP4 on 11/28/2016. GG NO RE
 */

public class Clothes {
    public HashMap<String,HashMap > Clothes = new HashMap<String, HashMap>();
public HashMap<String,HashMap > male = new HashMap<String, HashMap>();
public HashMap<String,HashMap > female = new HashMap<String, HashMap>();


    public Clothes() {
        HashMap<String,String >pants = new HashMap<String, String>();
        pants.put("id", "213123123123");
        pants.put("size", "M");
        pants.put("color", " blue");
        male.put("pants", pants);




        //MUST BE THE LAST 2
        Clothes.put("Males", male);
        Clothes.put("Females", female);
    }
}


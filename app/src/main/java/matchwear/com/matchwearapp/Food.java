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
    public HashMap<String, HashMap> Southern_Comfort= new HashMap<String, HashMap>();
    public HashMap<String, HashMap> Hispanic= new HashMap<String, HashMap>();
public HashMap<String, HashMap>Carribean = new HashMap<String ,HashMap>();
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

        HashMap<String, HashMap>SCA     = new HashMap<String, HashMap>();
        HashMap<String, String>CFS      = new HashMap<String, String>();
        CFS.put("Title", "Cripsy Fried Shrimp");
        CFS.put("Description", "Beer battered shrimp deep fried and served with tartar sauce");
        CFS.put("Price", "$34.99");
        CFS.put("Servings", "30 pieces");
        CFS.put("ID", "SCA01");
        HashMap<String,String>CAWM      = new HashMap<String, String>();
        CAWM.put("Title", "Chicken and Waffle Minis");
        CAWM.put("Description", "Fried chicken pieces served over a mini waffle with a maple syrup drizzle");
        CAWM.put("Price", "$29.99");
        CAWM.put("Servings", "20 pieces");
        CAWM.put("ID", "SCA02");
        HashMap<String,String>HP        = new HashMap<String, String>();
        HP.put("Title", "Hushpuppies");
        HP.put("Description", "Small deep-fried balls made from cornmeal-based batter");
        HP.put("Price", "$37.99");
        HP.put("Servings", "20 pieces");
        HP.put("ID", "SCA03");
        HashMap<String, HashMap>SCE     = new HashMap<String, HashMap>();
        HashMap<String, String>CFSteak  = new HashMap<String, String>();
        CFSteak.put("Title", "Chicken Fried Steak");
        CFSteak.put("Description", "Pan fried steak cutlet coated with seasoned flour served with white gravy");
        CFSteak.put("Price", "$89.99");
        CFSteak.put("Servings", "10 Pieces");
        CFSteak.put("ID","SCE01");
        HashMap<String, String>BC      = new HashMap<String, String>();
        BC.put("Title", "Blackened Catfish");
        BC.put("Description", "Skillet cooked catfish seasoned with cajun spices ");
        BC.put("Price", "$84.99");
        BC.put("Servings", "15 Pieces");
        BC.put("ID","SCE02");
        HashMap<String, String>BPR      = new HashMap<String, String>();
        BPR.put("Title", "Barbeque Pork Ribs");
        BPR.put("Description", "Pork ribs grilled with a honey barbeque sauce (with bones and boneless)");
        BPR.put("Price", "$84.99 ");
        BPR.put("Servings", "20 Pieces");
        BPR.put("ID","SCE03");
        HashMap<String, HashMap>SCSD    = new HashMap<String, HashMap>();
        HashMap<String, String>SPF      = new HashMap<String, String>();
        SPF.put("Title", "Sweet Potato Fries");
        SPF.put("Description", "Air baked sweet potato fries seasoned with salt ");
        SPF.put("Price", "$24.99");
        SPF.put("Servings", "1 tray");
        SPF.put("ID","SCS01");
        HashMap<String, String>BBB      = new HashMap<String, String>();
        BBB.put("Title", "Barbeque Baked Beans");
        BBB.put("Description", "Slow cooked beans, simmered withbrown sugar, onion and barbeque sauce");
        BBB.put("Price", "$24.99");
        BBB.put("Servings", "1 tray");
        BBB.put("ID","SCS02");
        HashMap<String, String>BB      = new HashMap<String, String>();
        BB.put("Title", "Buttery Biscuits");
        BB.put("Description", "With a side of gravy");
        BB.put("Price", "$24.99");
        BB.put("Servings", "20 pieces");
        BB.put("ID","SCS03");
        HashMap<String, HashMap>SCD    = new HashMap<String, HashMap>();
        HashMap<String, String>UDC      = new HashMap<String, String>();
        UDC.put("Title", "Upside Down Cake");
        UDC.put("Description", "Cake made with blackberries, apples, and strawberries");
        UDC.put("Price", "$29.99");
        UDC.put("Servings", "10 pieces");
        UDC.put("ID","SCD01");
        HashMap<String, String>B      = new HashMap<String, String>();
        B.put("Title", "Beignets");
        B.put("Description", "a square deep-fried pastry served hot and sprinkled with icing sugar");
        B.put("Price", "$29.99");
        B.put("Servings", "20 pieces");
        B.put("ID","SCD02");
        HashMap<String, String>PC      = new HashMap<String, String>();
        PC.put("Title", "Peach Cobbler");
        PC.put("Description", "Peach Cobbler");
        PC.put("Price", "$34.99");
        PC.put("Servings", "10 pieces");
        PC.put("ID","SCD03");


        SCA.put("Cripsy Fried Shrimp", CFS);
        SCA.put("Chicken and Waffle Minis", CAWM);
        SCA.put("Hushpuppies",HP);
        Southern_Comfort.put("Appitizer", SCA);
        SCE.put("Chicken Fried Steak", CFSteak);
        SCE.put("Blackened Catfish", BC);
        SCE.put("Barbeque Pork Ribs",BPR);
        Southern_Comfort.put("Entrees",SCE);
        SCSD.put("Sweet Potato Fries",SPF);
        SCSD.put("Barbeque Baked Beans",BBB);
        SCSD.put("Buttery Biscuits",BB);
        Southern_Comfort.put("Side Dish",SCSD);
        SCD.put("Upside Down Cake",UDC);
        SCD.put("Beignets",B);
        SCD.put("Peach Cobbler",PC);
        Southern_Comfort.put("Desserts",SCD);

        HashMap<String, HashMap>HA     = new HashMap<String, HashMap>();
        HashMap<String, String>VT      = new HashMap<String, String>();
        VT.put("Title", "Vegan Tostones");
        VT.put("Description", "Fried savory plantains sprinkled with salt and served with a garlic and oil dipping sauce");
        VT.put("Price", "$29.99 ");
        VT.put("Servings", "20 pieces");
        VT.put("ID","HPA01");
        HashMap<String, String>SDM      = new HashMap<String, String>();
        SDM.put("Title", "Sorullitos de Maiz");
        SDM.put("Description", "Hush Puppies with a crunchy outer crust and a creamy buttery center");
        SDM.put("Price", "$29.99 ");
        SDM.put("Servings", "20 pieces");
        SDM.put("ID","HPA02");
        HashMap<String, String>S     = new HashMap<String, String>();
        S.put("Title", "Sancocho");
        S.put("Description", "Beef stew simmered with corn, potatoes, cilantro and onions");
        S.put("Price", "$39.99 ");
        S.put("Servings", "1 large bowl");
        S.put("ID","HPA03");
        HashMap<String, HashMap>HE   = new HashMap<String, HashMap>();


        HashMap<String, HashMap>APp      = new HashMap<String, HashMap>();
        HashMap<String, String>  BP1  = new HashMap<String, String>();
        BP1.put("Title", "Beef Patties");
        BP1.put("Description", "Meat patties filled with curried ground beef, onion, garlic, and Scotch bonnet pepper, plus a slew of aromatic herbs and spices");
        BP1.put("Price", "$29.99 ");
        BP1.put("Servings", "20 patties");
        BP1.put("ID","CBA01");
        APp.put("Beef Patties", BP1);

        /*
        HashMap<String, String>      = new HashMap<String, String>();
        .put("Title", "");
        .put("Description", "");
        .put("Price", "");
        .put("Servings", "");
        .put("ID","");
         */
        HA.put("Vegan Tostones",VT);
        HA.put("Sorullitos de Maiz",SDM);
        HA.put("Sancocho",S);
        Hispanic.put()
    }
}

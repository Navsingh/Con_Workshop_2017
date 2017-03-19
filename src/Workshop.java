/**
 * Created by Waheguru on 3/12/2017.
 */
public class Workshop
{
    public static void main (String args[])
    {
        System.out.println("Hello Concordia Workshop");

        //******************   NumberHolder     ******************** \

        NumberHolder obj = new NumberHolder();
        obj.anInt =10;
        obj.aFloat=10;
        System.out.println("anInt from NumberHolder "+ obj.anInt);
        System.out.println("aFloat from NumberHolder "+ obj.aFloat);

        //******************   NumberHolder_Finish ***************** \

        //******************   IdentifyMyParts     *****************  \
       IdentifyMyParts a = new IdentifyMyParts();
       IdentifyMyParts b = new IdentifyMyParts();
       a.y=5;
       b.y=6;
       a.x=1;  //doesn't effect x
       b.x=2;  //doesn't effect x
       System.out.println("a.y is "+ a.y);
       System.out.println("b.y is "+ b.y);
       System.out.println("a.x is "+a.x);
       System.out.println("b.x is "+ b.x);
       System.out.println("X of class is "+ IdentifyMyParts.x);
       //System.out.println("Y of class is "+ IdentifyMyParts.y);   //error see effect after removing comment

      //****************** IdentifyMyParts_Finish ****************   \

    }
}

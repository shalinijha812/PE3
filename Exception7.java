package myexercise3;

public class Exception7 {
    public static void main(String[] args)
    {

        try
        {
            int i=8,j=3,k=1;
            k = (i / j);
            throw new MyOwnException7( "error");
        }
        catch(MyOwnException7 myOwnException7)
        {
            System.out.println(myOwnException7.msg);
        }
        finally{
            System.out.println("finally it's done");
        }

    }
}

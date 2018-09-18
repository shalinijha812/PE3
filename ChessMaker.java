package myexercise3;

public class ChessMaker {
    public int chessPattern()
    {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if (i%2==0)
                {
                    if (((i+j)%2)==0)

                        System.out.print("WW|");

                    else
                        System.out.print("BB|");

                }
                else
                    {
                        if (((i + j) % 2) == 0)
                            System.out.print("WW|");
                        else
                            System.out.print("BB|");
                     }

            }
            System.out.printf("%n");
        }
        return 0;
    }

}

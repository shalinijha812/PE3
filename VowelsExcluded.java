package myexercise3;

public class VowelsExcluded {
    public String[] removeVowels(String[] placeName,int size)
    {
        String[] vowel={"a","e","i","o","u"};
        for(int i=0;i<size;i++)
        {
          for (int j=0;j<vowel.length;j++)
          {
              if (placeName[i].contains(vowel[j]))
              {
                  placeName[i]=placeName[i].replace(vowel[j],"");

              }

          }
        }
        return placeName;

    }
}

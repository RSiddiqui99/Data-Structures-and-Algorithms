import java.util.HashSet;

public class UniqueString
{
    static public boolean isUnique(String word)
    {
        if (word.length()==0||word.length()==1)
        {
            return true;
        }

        HashSet <Character> letters=new HashSet<Character>();

        for (int i=0;i<word.length();i++)
        {
            if (letters.contains(word.charAt(i)))
            {
                return false;
            }

            else
            {
                letters.add(word.charAt(i));
            }
        }

        return true;
    }


    public static void main(String[] args)
    {
        System.out.print(UniqueString.isUnique("ggg"));
        System.out.print(UniqueString.isUnique("word"));
        System.out.print(UniqueString.isUnique("g"));
        System.out.print(UniqueString.isUnique("jeff"));
    }
}
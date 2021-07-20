import java.util.HashMap;

public class CheckPermutationString
{
    static public boolean isPermutation(String one, String two)
    {
        if (one==null||two==null||one.length()!=two.length())
        {
            return false;
        }

        HashMap <Character, Integer> lettersOne=new HashMap<>();
        HashMap <Character, Integer> lettersTwo=new HashMap<>();

        for (int i=0;i<one.length();i++)
        {
            if (lettersOne.containsKey(one.charAt(i)))
            {
                lettersOne.put(one.charAt(i),lettersOne.get(one.charAt(i)+1));
                continue;
            }

            lettersOne.put(one.charAt(i),1);
        }

        for (int i=0;i<one.length();i++)
        {
            if (lettersTwo.containsKey(two.charAt(i)))
            {
                lettersTwo.put(two.charAt(i),lettersOne.get(two.charAt(i)+1));
                continue;
            }

            lettersTwo.put(two.charAt(i),1);
        }

        for (char letter: lettersOne.keySet())
        {
            if (lettersOne.get(letter)!=lettersTwo.get(letter))
            {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args)
    {
        System.out.print(CheckPermutationString.isPermutation("staple","plates"));
        System.out.print(CheckPermutationString.isPermutation("moom","moom"));
        System.out.print(CheckPermutationString.isPermutation("staples","jones"));
        System.out.print(CheckPermutationString.isPermutation("staples","plates"));
        System.out.print(CheckPermutationString.isPermutation("s","s"));

    }
}

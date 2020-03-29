import java.util.ArrayList;

public class ArrayUtil {

  public static String[] findCommon(String[] array1, String[] array2) {
   ArrayList<String> expectedResult = new ArrayList<>();
    for (int i = 0; i < array1.length; i++)
    {
      for (int j = 0; j < array2.length; j++)
      {
        if (array1[i].equals(array2[j]))
        {
          expectedResult.add(array1[i]);
        }
      }
    }
    String[] s = new String[expectedResult.size()];
    for (int i = 0; i < expectedResult.size(); i++){

        s[i] = expectedResult.get(i);
    }
    return s;
  }
}
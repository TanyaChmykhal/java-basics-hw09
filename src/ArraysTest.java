import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraysTest {

  @DataProvider(name = "ArrayUtil")
  public static Object[][] arrays() {
    return new Object[][]{
        {
            new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
            new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
            new String[]{"JAVA", "SQL"}
        },
            {
                    new String[]{"Atom", "Postman", "PHP", "Figma", "C++", "SQL"},
                    new String[]{"PostgreSQL", "DB2", "JAVA", "Atom", "Postman"},
                    new String[]{"Atom","Postman"}
            },
            {
                    new String[]{"Figma", "Chrome", "Charles", "Calendar", "IJ"},
                    new String[]{"Charles", "SQL", "IJ", "Figma", "PostgreSQL", "DB2", "JAVA"},
                    new String[]{ "Figma", "Charles", "IJ"}
            }
    };
  }

  @Test(dataProvider = "ArrayUtil")
  public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {

    assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
        "Common elements are not correct");
  }
}
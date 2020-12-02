import java.util.ArrayList;

public class Day1 {
    public static int[] inputList = new int[] {1810, 1729, 1857, 1777, 1927, 1936, 1797, 1719, 1703, 1758, 1768, 2008, 1963,
            1925, 1919, 1911, 1782, 2001, 1744, 1738, 1742, 1799, 1765, 1819, 1888, 127, 1880, 1984, 1697, 1760, 1680,
            1951, 1745, 1817, 1704, 1736, 1969, 1705, 1690, 1848, 1885, 1912, 1982, 1895, 1959, 1769, 1722, 1807, 1901,
            1983, 1993, 1871, 1795, 1955, 1921, 1934, 1743, 1899, 1942, 1964, 1034, 1952, 1851, 1716, 1800, 1771, 1945,
            1877, 1917, 1930, 1970, 1948, 1914, 1767, 1910, 563, 1121, 1897, 1946, 1882, 1739, 1900, 1714, 1931, 2000,
            311, 1881, 1876, 354, 1965, 1842, 1979, 1998, 1960, 1852, 1847, 1938, 1369, 1780, 1698, 1753, 1746, 1868,
            1752, 1802, 1892, 1755, 1818, 1913, 1706, 1862, 326, 1941, 1926, 1809, 1879, 1815, 1939, 1859, 1999, 1947,
            1898, 1794, 1737, 1971, 1977, 1944, 1812, 1905, 1359, 1788, 1754, 1774, 1825, 1748, 1701, 1791, 1786, 1692, 1894,
            1961, 1902, 1849, 1967, 1770, 1987, 1831, 1728, 1896, 1805, 1733, 1918, 1731, 661, 1776, 1494, 2005, 2009, 2004,
            1915, 1695, 1710, 1804, 1929, 1725, 1772, 1933, 609, 1708, 1822, 1978, 1811, 1816, 1073, 1874, 1845, 1989, 1696,
            1953, 1823, 1923, 1907, 1834, 1806, 1861, 1785, 297, 1968, 1764, 1932, 1937, 1826, 1732, 1962, 1916, 1756, 1975,
            1775, 1922, 1773};

    static final int TWENTY_TWENTY = 2020;

    public static class FinalResultForTwoNumbers
    {
        public int firstValue;
        public int secondValue;

        FinalResultForTwoNumbers(int firstNumber, int secondNumber){
            firstValue = firstNumber;
            secondValue = secondNumber;
        }
    }

    public static class FinalResultForThreeNumbers
    {
        public int firstValue;
        public int secondValue;
        public int thirdValue;

        FinalResultForThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
            firstValue = firstNumber;
            secondValue = secondNumber;
            thirdValue = thirdNumber;
        }

    }

    public static FinalResultForTwoNumbers findSumForTwoNumbers(){

        int listSize = inputList.length;

        for (int i = 0; i < listSize; i++){

            for (int j = i+1; j < listSize; j++){

                if((inputList[i] + inputList[j]) == TWENTY_TWENTY) {
                 return new FinalResultForTwoNumbers(inputList[i], inputList[j]);
                }
            }
        }
        return new FinalResultForTwoNumbers(0,0);
    }

    public static FinalResultForThreeNumbers findSumForThreeNumbers(){

        int listSize = inputList.length;

        for (int i = 0; i < listSize; i++){

            for (int j = i+1; j < listSize; j++){

                for(int z = j + 1; z < listSize; z++) {

                    if ((inputList[i] + inputList[j] + inputList[z]) == TWENTY_TWENTY) {
                        return new FinalResultForThreeNumbers(inputList[i], inputList[j], inputList[z]);
                    }
                }
            }
        }
        return new FinalResultForThreeNumbers(0,0, 0);
    }

    public static void main(String[] args){
        FinalResultForTwoNumbers finalResultForTwoNumbers = findSumForTwoNumbers();

        System.out.println("First Value: " + finalResultForTwoNumbers.firstValue);
        System.out.println("Second Value: " + finalResultForTwoNumbers.secondValue);
        int sumOfTwoValues = finalResultForTwoNumbers.firstValue + finalResultForTwoNumbers.secondValue;
        System.out.println("Equal: " + sumOfTwoValues);

        int multOfTwoValues = finalResultForTwoNumbers.firstValue * finalResultForTwoNumbers.secondValue;
        System.out.println("Multiplied: " + multOfTwoValues);

        //---------------------------------------------------------------------------------------------------

        FinalResultForThreeNumbers finalResultForThreeNumbers = findSumForThreeNumbers();

        System.out.println("First Value: " + finalResultForThreeNumbers.firstValue);
        System.out.println("Second Value: " + finalResultForThreeNumbers.secondValue);
        System.out.println("Third Value: " + finalResultForThreeNumbers.thirdValue);
        int sumOfThreeValues = finalResultForThreeNumbers.firstValue + finalResultForThreeNumbers.secondValue + finalResultForThreeNumbers.thirdValue;
        System.out.println("Equal: " + sumOfThreeValues);

        int multOfThreeValues = finalResultForThreeNumbers.firstValue * finalResultForThreeNumbers.secondValue * finalResultForThreeNumbers.thirdValue;
        System.out.println("Multiplied: " + multOfThreeValues);
    }
}

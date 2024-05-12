package org.example.javaqahw.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import org.junit.jupiter.params.provider.CsvSource;

public class HoliServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/values.csv")
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    public void test(int expected, int income, int expenses, int threshold) {
        HoliService service = new HoliService();
        //int expected = 3;
        int count = service.calculate(income, expenses, threshold);
        //System.out.println(count);

        Assertions.assertEquals(expected, count);
    }

}

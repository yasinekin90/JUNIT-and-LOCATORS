package day09_Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//todo
// öncelikle @Before annotation olan setup() metodu çalısır
// daha sonra çalıştırmak istedigimiz testimiz çalışır
// en sonda @After anootation olan duzelt() metodu calısır
public class Junit02 {
    @Test
    public void test01() {
        System.out.println("1.TEST01 çalıştı");
    }

    @Test
    public void test02() {
        System.out.println("2.TEST02 calıstı");
    }

    @Before
    public void setup(){
        System.out.println("sistem çalışmaya başladı");
    }

    @After
    public void duzelt(){
        System.out.println("sistem ortaliği düzeltmeyi bitirdi");
    }


}
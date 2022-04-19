package secao19;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<Object>();
        
        List<? super Number> myList = myObjs;
    }
}

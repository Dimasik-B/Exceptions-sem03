package Task3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) {
//        System.out.println(divide(13, 0));
        try {
            fileNotFound("text.txt");
        } catch (NonExistedFileException e) {
            throw new RuntimeException(e);
        }
    }
    public static int divide(int a, int b) throws DivideByZeroException{
        if(b == 0) throw new DivideByZeroException();
        return a / b;
    }

    public static void fileNotFound(String path) throws NonExistedFileException {
        try {
            FileReader fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException();
        }
    }
}

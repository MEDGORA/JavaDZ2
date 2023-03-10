import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) throws IOException {
        printString(6,'a','b');
        CreateFile();
    }


//Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, 
//которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
private static void printString(int N, char c1, char c2) {
    if (N % 2 == 1 | N <= 0){
        System.out.println("Число N должно быть положительным чётным числом");
    }
    else {
        System.out.println();
        for (int i = 0; i < N / 2; i++){
            System.out.print(c1);
            System.out.print(c2);
    }
    }
}
// Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз
private static void CreateFile() throws IOException {
        Path of = Path.of("file.txt");
        if (Files.exists(of) == false) {
            Files.createFile(of);
        }
        else {
            String str = "TEXT";
            for (int i = 0; i < 99; i++){
                str = str + "TEXT";
            }
            byte[] bytes = str.getBytes();
            Files.write(of, bytes);
        }
    }
}


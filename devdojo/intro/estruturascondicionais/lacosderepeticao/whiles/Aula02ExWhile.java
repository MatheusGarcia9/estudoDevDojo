package academy.devdojo.intro.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExWhile {
    public static void main(String[] args) {
        int i = 0;
        while(i<=20){
            if(i%5==0)
                i++;
        else
                i = i+2;
        }
        System.out.println(i);
    }
}

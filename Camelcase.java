import java.io.*;
import java.util.*;
class Camelcase
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
        String input = s.nextLine();
        String result = "";
        char first = input.charAt(0);
        result = result + Character.toUpperCase(first);
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char previousChar = input.charAt(i - 1);
            if (previousChar == ' ') {
                result = result + Character.toUpperCase(currentChar);
            } else {
                result = result + currentChar;
            }
        }
        System.out.println(result);
        }
        }

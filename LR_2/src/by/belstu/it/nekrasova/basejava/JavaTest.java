/**
 * @author Nastya
 * @version 1.0
 */
package by.belstu.it.nekrasova.basejava;

import java.util.Arrays;

import static java.lang.Long.*;
import static java.lang.Math.log;
import static java.lang.Math.*;
 
  //*Класс*/
  public class JavaTest {
      /**
       * abc
       */
      int abc = 15;
      /**
       * { @link JavaTest#abc }
       *
       * @see JavaTest
       */
      final int cons = 15;
      public final int cons1 = 16;
      public static final int cons2 = 17; //не привязан к объекту - можно вывести
      static int sint;

      public JavaTest() {
          abc = 15;
      }

      public static void main(String[] args) {
          char ch = 'a';
          int i = 1;
          short sh = 1;
          byte b = 1;
          long l;
          boolean bool = true;
          double d = 2.5;
          String str = "Hello";

          System.out.println();
          System.out.println("String+int=" + str + i);
          System.out.println("String+char=" + str + ch);
          System.out.println("String+double=" + str + d);

          //b=b+i;  int>byte
          //i=d+l; long>int

          l = i + 2147483647;
          System.out.println("i+2147483647=" + l);
          System.out.println("sint=" + sint);

          //static int sint;

          System.out.println();
          bool = bool && bool;
          System.out.println("boolean && boolean=" + bool);
          bool = bool ^ bool;
          System.out.println("boolean ^ boolean=" + bool);
          //bool=bool+bool; нельзя т.к. арифметическая операция

          System.out.println();
          long longValue = 9223372036854775807L;
          System.out.println("LongValue=" + longValue);
          long longValue1 = 0x7fff_ffff_fffL;
          System.out.println("LongValue1=" + longValue1);

          System.out.println();
          char ch1 = 'a';
          char ch2 = '\u0061';
          char ch3 = 97;
          System.out.println("ch1=" + ch1 + "\tch2=" + ch2 + "\tch3=" + ch3);
          System.out.println("ch1+ch2+ch3=" + (ch1 + ch2 + ch3));

          System.out.println();
          double d1 = 3.45 % 2.4;
          System.out.println("3.45%2.4=" + d1);
          double d2 = 1.0 % 0.0;
          System.out.println("1.0%0.0=" + d2);
          double d3 = 0.0 % 0.0;
          System.out.println("0.0%0.0=" + d3);
          System.out.println("log(-345)=" + log(-345));

          System.out.println();
          System.out.println(Float.intBitsToFloat(0x7F80000));
          System.out.println(Float.intBitsToFloat(0xFF800000));

          //System.out.println(cons+cons1+cons2);

          System.out.println();
          System.out.println("Число Pi(округлённое)=" + round(PI));
          System.out.println("Число E(округлённое)=" + round(E));
          System.out.println("Минимальное среди PI и E = " + min(PI, E));
          System.out.println("Рандомное число  из [0,1)= " + random());

          Boolean bol = new Boolean(true);
          Character cha = new Character('a');
          Integer i100 = new Integer(100);
          Byte by = new Byte((byte) 7);
          Short sh5 = new Short((short) 5);
          Long l50 = new Long(50);
          Double d25 = new Double(25);

          System.out.println();
          System.out.println("i100+45=" + (i100 + 45));
          System.out.println("sh5*5=" + (sh5 * 5));
          System.out.println("by>>1=" + (by >> 1));

          System.out.println();
          System.out.println("Максимальное Long=" + l50.MAX_VALUE);
          System.out.println("Минимальное Long=" + l50.MIN_VALUE);
          System.out.println("Максимальное Double=" + d25.MAX_VALUE);
          System.out.println("Минимальное Double=" + d25.MIN_VALUE);

          // Автоупаковка (преобраз примитивных типов в эквив объекты) Integer
          Integer integer = 10;
          // Распаковка (преобраз объектов в соотв им примитивные типы) Integer
          int int1 = 0;
          int1 = new Integer(9);
          // Автоупаковка Byte
          Byte byt = 1;
          // Распаковка Byte
          Byte byt1 = 0;
          byt1 = new Byte((byte) 1);

          System.out.println();
          int1 = Integer.parseInt("a", 16);    // в 16 системе a=10
          System.out.println("Метод parseInt=" + int1);
          System.out.println("Метод toHexString=" + toHexString(10)); //обратное parseInt
          System.out.println("Метод compare=" + compare(int1, integer)); //если первое больше то 1,иначе 0
          System.out.println("Метод toString=" + Integer.toString(21)); //перевод в строку
          System.out.println("Метод bitCount=" + bitCount(4));  //считает кол-во едениц в двочином коде
          System.out.println("Метод isNaN=" + d25.isNaN()); //тру если дабл

          System.out.println();
          String s34 = "2345";
          int per = Integer.parseInt(s34);
          System.out.println("Через parseInt:" + per);
          int per1 = Integer.valueOf(s34);
          System.out.println("Через valueOf:" + per1);
          int per2 = new Integer(s34);
          System.out.println("Через конструктор:" + per2);

          System.out.println();
          String inputString = "nekrasova";
          // преобразование строки в массив байт
          byte[] byteArray = inputString.getBytes();
          System.out.println("Строку в массив байт : " + Arrays.toString(byteArray));
          // конвертируем байты в строку
          String string = new String(byteArray);
          System.out.println("байты в строку : " + string);

          System.out.println();
          //Преобразование строки в логический тип
          String s1 = "True";
          String s2 = "yes";
          boolean bool1, bool2, boolean1, boolean2;
          //с использованием метода parseBoolean
          bool1 = Boolean.parseBoolean(s1);
          bool2 = Boolean.parseBoolean(s2);
          System.out.println("String(True).parseBoolean : " + bool1);
          System.out.println("String(yes).parseBoolean : " + bool2);
          //c использованием метода valueOf
          boolean1 = Boolean.valueOf(s1);
          boolean2 = Boolean.valueOf(s2);
          System.out.println("String(True).valueOf : " + boolean1);
          System.out.println("String(yes).valueOf : " + boolean2);

          System.out.println();
          String str1 = "Hello";
          String str2 = "Hello";
          System.out.println("str1=Hello\tstr2=Hello");
          System.out.println("str1 == str2 -> " + (str1 == str2));
          System.out.println("str1.equals(str2) -> " + str1.equals(str2));
          System.out.println("str1.compareTo(str2) -> " + str1.compareTo(str2)); // >0 - вызывающий объект больше; <0 - вызывающий объект меньше; =0 - объекты равны
          str2 = null;
          System.out.println("str1=Hello\tstr2=null");
          System.out.println("str1 == str2 -> " + (str1 == str2));
          System.out.println("str1.equals(str2) -> " + str1.equals(str2));
          // System.out.println("str1.equals(str2) -> " + str1.compareTo(str2));

          System.out.println();
          str1 = "Hello World";
          String[] words = str1.split(" ");
          i = 1;
          for (String word : words) {
              System.out.println("Split" + i + " = " + word);
              i++;
          }
          System.out.println("Содержит ли подстроку (Hello) : " + str1.contains("Hello")); // содержит ли строку
          System.out.println("hashCode() : " + str1.hashCode());
          System.out.println("Индекс объекта (е) : " + (str1.indexOf('e') + 1));  // индекс объекта
          System.out.println("Длина : " + str1.length());   // длина
          String str3 = str1.replace("Hel", "Hi");  // замена
          System.out.println("replace 'Hel' -> 'Hi' : " + str3);

          System.out.println();
          char[][] arr1 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
          char[] arr2[];
          char arr3[][];
          char[] arr = {'a', 'b', 'c'};

          arr1 = new char[3][];
          arr1[0] = new char[1];
          arr1[1] = new char[2];
          arr1[2] = new char[3];
          System.out.println("arr1 = new char[3][]");
          System.out.println("arr1.length = " + arr1.length);
          System.out.println("arr1[0].length = " + arr1[0].length);
          System.out.println("arr1[1].length = " + arr1[1].length);
          System.out.println("arr1[2].length = " + arr1[2].length);
          arr2 = new char[][]{{'1', '2', '3'}, {'1', '2', '3'}, {'1', '2', '3'}};
          arr3 = new char[][]{{'1', '2', '3'}, {'1', '2', '3'}, {'1', '2', '3'}};
          boolean comRez = arr2 == arr3; // сравнение по ссылкам,разные
          System.out.println("ComRez : " + comRez);

          System.out.println();
          arr2 = arr3;
          for (char[] z2 : arr2) {
              for (int z : z2) {
                  System.out.print(" " + z);
              }
              System.out.println();
          }
          /**  int[] arr1 = new int[]{1,2,3};
           for (int i = 0; i < 4; i++) {
           System.out.println(arr1[i]);
           }* ///Exception i thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
           */

          System.out.println();
          WrapperString wrap = new WrapperString("Nastya");  //создали
          wrap.replace('a', '!');
          System.out.println(wrap.getStrwrap());

          WrapperString anon = new WrapperString("Nastya") {
              /** params
               * @param newchar parm functions delete
               */
              public void delete(char newchar) {
                  super.replace(newchar, '\0');
              }

              @Override
              public void replace(char oldchar, char newchar) {
                  super.replace(newchar, '\0');
              }

          };
          anon.replace('s', 'q');
          System.out.println(anon.getStrwrap());
      }
  }

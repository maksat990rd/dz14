package com.company;
 /** Создайте класс с именем Класс
  у него есть массив, в котором хранится число в нижнем колонтитуле номера класса, слово, в котором хранится слово, и массив, в котором хранится число
  Напишите конструктор
  Создайте объект Class из метода Maine
  Обратите внимание на поля объекта через конструктор
  Переместите поля этого объекта в консоль. */
public class Klass {
    private int nomer;
    private String slovo;
    private int[] nomer2;

     public Klass(int nomer, String slovo, int[] nomer2) {
         this.nomer = nomer;
         this.slovo = slovo;
         this.nomer2 = nomer2;
     }

     public int getNomer() {
         return nomer;
     }

     public void setNomer(int nomer) {
         this.nomer = nomer;
     }

     public String getSlovo() {
         return slovo;
     }

     public void setSlovo(String slovo) {
         this.slovo = slovo;
     }

     public int[] getNomer2() {
         return nomer2;
     }

     public void setNomer2(int[] nomer2) {
         this.nomer2 = nomer2;
     }
 }

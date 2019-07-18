//import javax.swing.*;

//public class Main {

 //   public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}

//import javax.swing.*;
//public class Main{
//    public static void main(String[] args){
//        JOptionPane.showMessageDialog(null, "Все Ок?!"); //вызов диалогового окна
//
//    }
//}

import javax.swing.*;
public class Main {
  //  public static void main(String[] args) {
  //      String name;
  //      name = JOptionPane.showInputDialog("Добрый день! Как Вас зовут?");
  //      JOptionPane.showMessageDialog(null, "Приятно познакомиться,\n" + name + "!");

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Введите число:"));
        String text = number % 2 == 0 ? "четное" : "нечетное";
        JOptionPane.showMessageDialog(null, "Вы ввели " + text + " число!");
    }
}


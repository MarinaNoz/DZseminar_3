import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Task {
// 1. Создайте новый список массивов, добавить несколько цветов (строку) и вывести коллекцию на экран.
 public static List<String> newColor() {
    List<String> colorList = new ArrayList<>();
    colorList.add("green");
    colorList.add("red");
    colorList.add("blue");
    colorList.add("black");
    colorList.add("white");
    return colorList;
 }
 //2. Проитерируйте все элементы списка цветов и добавте к каждому символа '!'.
public static List<String> iterList(List<String> list) {
    ListIterator<String> newList = list.listIterator();
    while (newList.hasNext()) {
        newList.set(newList.next().concat("!"));
    }
    return list;
}
// 3. Напишите программу для вставки элемента в список массивов в первой позиции.
public static List<String> addList(List<String> list) {
list.add(0, "orange");
return list;
}
// 4. Извлеките элемент (по указанному индексу) из заданного списка.
public static String extractElement(List<String> list) {
    return list.get(2);
}
//5. Обновите элемент массива по заданному индексу.
public static List<String> update(List<String> list, String firstElement, String secondElement) {
    list.set(list.indexOf(firstElement), secondElement);
    return list;
}
//6. Напишите программу для удаления третьего элемента из списка массивов.
public static List<String> deleteElement(List<String> list) {
    list.remove(2);
    return list;
}
//7. Напишите программу для поиска элемента в списке массивов.
public static boolean searchElementList(List<String> list, String element) {
    if (list.contains(element))
        return true;
    else
        return false;
}
// 8. Напишите программу для сортировки заданного списка массивов.
public static List<String> sortList(List<String> list) {
    Collections.sort(list);
    return list;
}
// 9. Напишите программу для копирования одного списка массивов в другой.
public static List<String> copyList(List<String> list) {
    List<String> copyListnew = List.copyOf(list);
    return copyListnew;

}
 public static void main(String[] args) {
    //1.
    System.out.println(newColor());
    //2.
    System.out.println(iterList(newColor()));
    //3.
    System.out.println(addList(iterList(newColor())));
    //4.
    System.out.println(extractElement(addList(iterList(newColor()))));
    //5.
    System.out.println(update(addList(iterList(newColor())), "orange", "orange!"));
    //6.
    System.out.println(deleteElement(update(addList(iterList(newColor())), "orange", "orange!")));
    //7.
    String element = "black!";
    System.out.println(searchElementList(deleteElement(update(addList(iterList(newColor())), "orange", "orange!")), element));
    //8.
    System.out.println(sortList(deleteElement(update(addList(iterList(newColor())), "orange", "orange!"))));
    //9.
    System.out.println(copyList(sortList(deleteElement(update(addList(iterList(newColor())), "orange", "orange!")))));

 }
    
}
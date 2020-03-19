package t_11_holdingYourObjects.ex14;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

    public static void main(String[] args)
    {
        List<Integer> list = new LinkedList<>();

        list.add(0);
        list.add(1);

        ListIterator<Integer> li = list.listIterator();
        int i = 0;

        while (li.hasNext())
        {
            list.add(1, i++);
            if (i > 10)
            {
                break;
            }
        }

        System.out.println(list);
    }
}

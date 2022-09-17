import java.util.Comparator;
import java.util.TreeSet;

public class BookSorter {

    public static void main(String[] args) {

        TreeSet<Book> set = new TreeSet<>();
        set.add(new Book("Yabancı", 100, "Albert Camus", "05.11.2002"));
        set.add(new Book("Olasılıksız", 223, "Adam Fawer", "05.11.2002"));
        set.add(new Book("Daha", 234, "Hakan Günday", "05.11.2002"));
        set.add(new Book("Böyle Buyurdu Zerdüşt", 90, "Nietsche", "05.11.2002"));


        System.out.println(set.toString());
        TreeSet<Book> set2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        set2.add(new Book("Yabancı", 100, "Albert Camus", "05.11.2002"));
        set2.add(new Book("Olasılıksız", 223, "Adam Fawer", "05.11.2002"));
        set2.add(new Book("Daha", 234, "Hakan Günday", "05.11.2002"));
        set2.add(new Book("Böyle Buyurdu Zerdüşt", 90, "Nietsche", "05.11.2002"));

        /*
        * This set is sorted according to book name
        */
        for (Book i : set) {
            System.out.println(i.getName());
        }
        System.out.println("\n***************\n");
        /*
         * This set is sorted according to book page number
         */
        for (Book i : set2) {
            System.out.println(i.getName() + " \t Sayfa Sayısı: "+ i.getPageNumber());
        }
    }
}

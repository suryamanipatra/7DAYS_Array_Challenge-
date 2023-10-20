import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(4);
        System.out.println(x);
        Float f = Float.valueOf(4.91f);
        System.out.println(f);
        // SYNTAX :-
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> l2  = new ArrayList<>();
        ArrayList<Float> l3 = new ArrayList<>();
        // ADD NEW ELEMENT AT END
        l1.add(5); // 5
        l1.add(6); // 5 6
        l1.add(7); // 5 6 7
        l1.add(8); // 5 6 7 8
        //GET AN ELEMENT AT INDEX 1
        System.out.println(l1.get(1)); // 6
        // PRINT WITH FOR LOOP
        for (int i = 0 ; i < l1.size(); i++){
            System.out.println(l1.get(i)); // 5 6 7 8
        }
        // PRINT ArrayList DIRECTLY
        System.out.println(l1); // [5,6,7,8]
        // Adding element at some index i
        l1.add(1,30);
        System.out.println(l1); // [5,30,6,7,8]
        // MODIFYING ELEMENT AT INDEX i
        l1.set(1,20);
        System.out.println(l1); // [5,20,6,7,8]
        // REMOVING AN ELEMENT AT INDEX i
        l1.remove(1);
        System.out.println(l1); //[5,6,7,8]
        // REMOVING AN ELEMENT WITHOUT KNOW THE INDEX
        l1.remove(Integer.valueOf(7));
        System.out.println(l1); // [5,6,8]
        l1.remove(Integer.valueOf(17));
        System.out.println(l1.remove(Integer.valueOf(17))); // return a boolean ans
        System.out.println(l1); // does not show any error although 17 is not present
        // CHECKING IF AN ELEMENT EXIST OR NOT
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans); // true
        // if you don't specify class , you can put anything inside l1 , like :
        ArrayList l = new ArrayList();
        l.add("pqrs");
        l.add(87);
        l.add(3.5f);
        System.out.println(l);


    }
}

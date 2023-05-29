// package il;

public class lesson3 {
    public static void main(String[] args) {

        // OneWayList<Integer> list = new OneWayList<>(); // Односвязный список. НУжно
        // снять комментарий если работа будет с односвязным списком
        TwoWayList<Integer> list = new TwoWayList<>(); // Двухсвязный список. НУжно снять комментарий если работа будет
                                                       // с двухсвязным списком

        list.add(55);
        list.add(26);
        list.add(13);
        list.add(98);
        // integerOneWayList.add(122, 2);

        // System.out.println(integerOneWayList.size());
        // System.out.println(integerOneWayList.get(integerOneWayList.size() - 1));
        // System.out.println(integerOneWayList.get(1));
        // System.out.println(integerOneWayList.contains(26));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        // list.oneWayListrevert(); // Разворот односвязного списка
        list.linkedListRevert(); // Разворот двухсвязного списка
        System.out.println("**************     After revert   ****************");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }

}
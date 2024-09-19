import queues.Employee;
import queues.arrayQueue.ArrayQueue;
import queues.circularQueue.CircularQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayQueue");
        ArrayQueue queue = new ArrayQueue(10);
        queue.add(new Employee("Moez", "one",123));
        queue.add(new Employee("Mohamed", "two",23));
        queue.add(new Employee("Ahmed", "three",723));
        queue.add(new Employee("Jhon", "four",923));

        queue.printQueue();
        System.out.println("remove (): " + queue.remove());
        System.out.println("size (): " + queue.size());
        queue.remove();
        System.out.println("size (): " + queue.size());
        System.out.println("peek (): " + queue.peek());
        queue.printQueue();


        System.out.println("CircularQueue");
        CircularQueue circularQueue = new CircularQueue(10);
        circularQueue.add(new Employee("Moez", "one",123));
        circularQueue.add(new Employee("Mohamed", "two",23));
        circularQueue.add(new Employee("Ahmed", "three",723));
        circularQueue.add(new Employee("Jhon", "four",923));

        circularQueue.printQueue();
        System.out.println("remove (): " + circularQueue.remove());
        circularQueue.add(new Employee("jean", "five",123));
        System.out.println("size (): " + circularQueue.size());
        System.out.println("remove (): " + circularQueue.remove());
        System.out.println("size (): " + circularQueue.size());
        circularQueue.add(new Employee("bill", "end",123));
        System.out.println("peek (): " + circularQueue.peek());
        circularQueue.printQueue();




    }
}
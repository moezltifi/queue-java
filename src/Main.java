import queues.Employee;
import queues.arrayQueue.ArrayQueue;

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


    }
}
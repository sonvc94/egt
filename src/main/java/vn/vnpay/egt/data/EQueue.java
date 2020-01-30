package vn.vnpay.egt.data;

public class EQueue {
    int front, rear, size;
    int capacity;
    int[] array;

    public EQueue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = this.capacity - 1;
        array = new int[capacity];
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enQueue(int data) {
        if (this.isFull()) {
            return;
        }
        this.rear = (this.rear + 1) % capacity;
        array[this.rear] = data;
        this.size = this.size + 1;
    }

    public void deQueue() {
        if (this.isEmpty()) {
            return;
        }
        this.array[this.front] = 0;
        this.front = (this.front + 1) % capacity;
        this.size = this.size - 1;
    }

    public void printQueue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < capacity; i++) {
            System.out.printf("[%d]", this.array[i]);
        }
        System.out.println();
        System.out.printf("front: %d, rear %d\n", this.front, this.rear);
    }
}

package ss011_stack_queue.pratice;

import java.util.EmptyStackException;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head=0;
    private int tail=-1;
    private int currentSize=0;
    public MyQueue(int queueSize){
        this.capacity=queueSize;
        queueArr=new int[queueSize];
    }
    public boolean isQueueFull(){
        boolean check=false;
        if (this.currentSize==capacity){
           check=true;
        }return check;
    }
    public boolean isQueueEmpty(){
        boolean check=false;
        if (this.currentSize==0){
            check=true;
        }
        return check;
    }
    public void enqueue(int item){
        if (isQueueFull()){
            System.out.println("danh sách đã đầy không thể thêm được phần tử nào cả");
        }
        else {
            tail++;
            if (tail==capacity-1){
                tail=0;
            }
            queueArr[tail]=item;
            currentSize++;
            System.out.println("phần tử đã được thêm = "+item);
        }

    }
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("danh sách của bạn đã trống không có phần tử nào để xóa");
        }
        else {
            head++;
            if (head==capacity-1){
                System.out.println("phần tử đã được xóa "+queueArr[head-1]);
                head=0;
            }
            else {
                System.out.println("phần tử đã được xóa"+queueArr[head-1]);
            }


        }
    }
}

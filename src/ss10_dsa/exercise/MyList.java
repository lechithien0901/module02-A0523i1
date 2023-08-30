package ss10_dsa.exercise;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
     private static final int DEFAULT_CAPACITY=10;
     private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTS={};
     private Object elements[];

    public MyList() {
        this.elements=DEFAULTCAPACITY_EMPTY_ELEMENTS;
    }
    public MyList(int capacity){
        if (capacity>0){
            this.elements=new Object[capacity];
        }
        else if (capacity==0){
            this.elements=DEFAULTCAPACITY_EMPTY_ELEMENTS;
        }
        else {
            throw new IllegalArgumentException("khong hop le");
        }

    }
    public void add(int index,E element){

        if (index<0||index>this.size()){
            throw new IndexOutOfBoundsException(" mảng lỗi vì "+index+" nhỏ hơn size");
        } else {
            Object[]elementTemp=new Object[this.size];
        for (int i = 0; i <this.size ; i++) {
            elementTemp[i]=this.elements[i];
        }
        this.elements=new Object[size+1];
        for (int i = 0; i <size+1 ; i++) {
            if (index>i){
                this.elements[i]=elementTemp[i];
            }
            else if (index==i){
               this.elements[i]=element;
            }
            else {
                this.elements[i]=elementTemp[i-1];
            }

        }
        }}
        public E remove(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("vị trí bạn muốn xóa không phù hợp "+size+" nhỏ hơn vị trí index bạn muốn thêm vào "+index);
        }else {
           Object[] tempElement=new Object[size];
            for (int i = 0; i < size ; i++) {
                tempElement[i]=elements[i];
            }
            elements=new Object[size-1];
            for (int i = 0; i <size -1; i++) {
                if (index>i){
                    elements[i]=tempElement[i];

            } else if (index<=i){
                    elements[i]=tempElement[i+1];
                }

            }
size--;
            return (E) tempElement[index];


        }

        }
        public int size(){
        return this.size= this.elements.length;
        }
        public E[] clone(){
        Object[]elementTemp=new Object[size];
            for (int i = 0; i <elementTemp.length ; i++) {
                elementTemp[i]=elements[i];

            }
            return (E[]) elementTemp;
        }
        public boolean contains(E o){
        boolean check=false;
            for (int i = 0; i <size ; i++) {
                if (o.equals(elements[i])) {
                    check = true;
                }
            }
            return check;
    }
    public int indexOf(E o){
        int checkNum=-1;
        for (int i = 0; i <size ; i++) {
            if (o.equals(elements[i])){
                checkNum=i;
               break;
            }
        }
        return checkNum;

    }
    public boolean add(E e){
        Object[]elementTemp=new Object[size];
        for (int i = 0; i < elementTemp.length; i++) {
            elementTemp[i]=elements[i];
        }
        this.elements=new Object[size+1];
        for (int i = 0; i <size ; i++) {
            elements[i]=elementTemp[i];

        }
        elements[elements.length-1]=e;
return true;
    }
    public void ensureCapacity(int minCapacity){
        int newSize= elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public  E get (int index){
        Object elementTemp=new Object();
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("index "+index+" size "+size);
        }
        else {


            for (int i = 0; i < size ; i++) {
                if (index==i){
                    elementTemp=elements[i];

                }

            }
            return (E) elementTemp;

        }


    }
    public void clear(){
        this.elements=DEFAULTCAPACITY_EMPTY_ELEMENTS;
    }
    public String toString() {
        String str = "[";
        for (Object o : this.elements) {
            str += o + ", ";
        }
        str += "]";
        return str;

    }}



package com.company;



public class Main {

    //STACK ELEMANLARI
    static int[] stack=new int[5];
    static int top=0;
    //QUEUE ELEMANLARI
    static int[] queue=new int[5];
    static int back=0;



    static int pop(){
        if(top!=0)
            return stack[--top];
        else
            System.out.println("Stack yapısı boş.Eleman çıkartılamıyor");
        return -1;
    }
    static void push(int a){
        if(top>=stack.length){
            System.out.println("Yığına "+a+" eklenemiyor.Yığın dolu");
        }
        else
            stack[top++]=a;
    }


    static void print(int[] struct,int topOrBack){
        for(int i=0;i<topOrBack;i++){

            if(i==topOrBack-1)
                System.out.print(struct[i]+"\n");
            else
                System.out.print(struct[i]+"-");

        }


    }

    static void enque(int a){
        if(back<queue.length) {
            queue[back] = a;
            back++;
        }
        else
            System.out.println("Kuyruk dolu "+a+" eklenemiyor");

    }
    static int deque(){
        int tut=queue[0];
        if(back!=0){

            for(int i=0;i<queue.length-1;i++){
                queue[i]=queue[i+1];
            }
            back--;
        }
        else
            System.out.println("Kuyruk yapısı boş.Eleman çıkartılamıyor");
        return tut;
    }




    public static void main(String[] args) {
        push(6);push(4);push(5);push(2);push(8);
        print(stack,top);

        System.out.println("========================YIĞINDAN BİR KEZ ÇIKARMA============================");
        pop();
        print(stack,top);

        System.out.println("=========================SIRASIYLA 9 VE 3 SAYILARINI EKLEME=========================");
        push(9);push(3);
        print(stack,top);
        System.out.println("========================YIĞINDAN BİR KEZ ÇIKARMA============================");
        pop();
        print(stack,top);
        System.out.println("========================STACK ELEMANLARINI ÇIKIŞ SIRASIYLA YAZDIRMA============================");
        for(int i=0;i<top;i++)
            System.out.print(stack[top-i-1]+"-");
        System.out.println("\n========================STACK ELEMANLARI KUYRUK YAPISINA ATILIYOR============================");
        for(int i=0;i<=top+2;i++){
            enque(pop());
        }
        print(queue,back);
        System.out.println("========================KUYRUKTAN BİR KEZ ELEMAN ÇIKARMA============================");
        deque();
        print(queue,back);
        System.out.println("========================5 VE 1 ELEMANLARINI KUYRUĞA EKLEME============================");
        enque(5);enque(1);
        print(queue,back);
        System.out.println("========================KUYRUK ELEMANLARINI ÇIKIŞ SIRASIYLA YAZDRIMA============================");
        int keepBack=back;
        for(int i=0;i<keepBack;i++){
            System.out.print(deque()+"-");
        }
    }

}

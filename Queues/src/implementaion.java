public class implementaion {
    public class queue{
        private int[] arr;
        private int front;
        private int rear;
        private int curSize;
        private int totalSize;

        public queue(int capacity){
            this.totalSize = capacity;
            this.curSize = 0;
            this.front = 0;
            this.rear = -1;
        }
        public queue(){
            int defaultCapacity = 10;
        }
        public int size(){
            return this.curSize;
        }
        public boolean empty(){
            return this.curSize == 0;
        }
//        push or enqueue
        public void enqueue(int item)throws Exception{
            if (this.curSize == this.totalSize){
                throw new Exception("Queue is already full");
            }
            this.rear = (this.rear+1) % this.totalSize;
            this.arr[rear] = item;
            this.curSize++;
        }
//        pop or dequeue
        public int dequeue()throws Exception{
            if (empty()){
                throw new Exception("Queue is empty");
            }
            int ele = this.arr[this.front];
            this.front = (this.front+1)% this.totalSize;
            this.curSize--;
            return ele;

        }
        public int peek()throws Exception{
            if (empty()){
                throw new Exception("Queue is empty");
            }
            int ele = this.arr[this.front];
            return ele;
        }

    }
}

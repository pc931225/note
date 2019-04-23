import java.util.LinkedList;

public class LimitQueue<E> {
    private Integer limit;//队列长度

    private LinkedList<E> queue=new LinkedList<>();

    public LimitQueue(Integer limit) {
        this.limit = limit;
    }

    public boolean offer(E e){
        if(queue.size()>=limit){
            queue.pollFirst();
        }
        return queue.offer(e);
    }

    public boolean add(E e){
        if(queue.size()>=limit){
            queue.pollFirst();
        }
        return queue.add(e);
    }

    public E get(int i){
        return queue.get(i);
    }

    public E getLast(){
        return queue.getLast();
    }

    public E getFirst(){
        return queue.getFirst();
    }

    public int size(){
        return queue.size();
    }

    public Object[] toArray() {
        Object[] result = new Object[size()];
        for(int i = 0;i<size();i++){
            result[i]=get(i);
        }
        return result;
    }
}

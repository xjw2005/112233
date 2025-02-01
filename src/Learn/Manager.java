package Learn;

import java.util.Map;

public class Manager<T, E extends IRun> {
    private Map<T, E> map;

    public Manager(Map<T, E> map) {
        this.map = map;
    }

    public void set(T key,E e) {
        map.put(key, e);
    }
    public E get(T key) {
        return map.get(key);
    }

    //1 实现一个Run方法。
    public void run(T t){
        E e = map.get(t);
        if(e != null){
            e.run();
        }
    }
}

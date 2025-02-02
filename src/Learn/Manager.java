package Learn;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

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

    public Set<T> keySet() {
        return map.keySet();
    }

    public Collection<E> values(){
        return map.values();
    }


}

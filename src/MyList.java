public interface MyList<T> {
    void add(T t);
    T get(int i);
    void remove(int i);
    void remove(T obj);
    int size();

}

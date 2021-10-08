public class MyArrayList<T> implements MyList {
    private final int CAPACITY = 4;
    private Object[] data;
    private int size;
    private int index;

    MyArrayList() {
        data = new Object[CAPACITY];
        size = CAPACITY;
    }

    @Override
    public void add(Object o) {
        if (index == size - 1) {
            increaseSize();
        }
        data[index++] = o;
    }

    void increaseSize() {
        size += CAPACITY;
        Object[] newData = new Object[size];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public T get(int i) {
        checkIndex(i);
        return (T) data[i];
    }

    void checkIndex(int i) {
        if (i < 0 || i >= index) {
            throw new IndexOutOfBoundsException("Invalid index for my List");
        }
    }

    @Override
    public void remove(int i) {
        for (int k = i; k < index - 1; k++) {
            data[k] = data[k + 1];
        }
        data[index - 1] = null;
        index--;
    }

    @Override
    public void remove(Object obj) {
        for (int i = 0; i < index; i++) {

            if (data[i] != null) {
                if (data[i].equals(obj)) {
                    remove(i);
                    break;
                }
            }else if (data[i] == null) {
                    remove(i);
                    break;

            }
        }
    }


    @Override
    public int size() {
        return index;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < index; i++) {
            stringBuilder.append(data[i]);
            if (i != index - 1) {
                stringBuilder.append(", ");
            }

        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

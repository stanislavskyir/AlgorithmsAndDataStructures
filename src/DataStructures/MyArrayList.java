package DataStructures;

public class MyArrayList<T> implements MyList<T> {

    private int capacity = 10;
    private int size = 0;
    private Object[] array;

    public MyArrayList(){
        array = new Object[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }


    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < this.size - 1; i++){
            array[i] = array[i+1];
        }
        array[--this.size] = null;
    }

    @Override
    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void ensureCapacity() {
        if (size == array.length) {
            capacity = (int) (capacity * 1.5);
            Object[] newArray = new Object[capacity];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
}
public class Array {

    private int id;
    private String surname;
    private String name;
    private int year;

    static Array[]arr = new Array[1];
    static int size = 0;

    public Array(int id, String surname, String name, int year) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.year = year;
    }

    public String toString() {
        return this.id + " " + this.surname + " "  + this.name + " " + this.year;
    }

    public static void add(int id, String surname, String name, int year) {
        if (size >= arr.length) {
            extendArray();
        }
        arr[size++] = new Array(id, surname, name, year);
    }

    private static void extendArray() {
        Array[] newArr = new Array[size + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public static Array[] getArr() {
        return arr.clone();
    }

    public static void search(int id) {
        for (Array tmp : arr) {
            if (tmp.id == id) {
                System.out.println(tmp.toString());
            }
        }
    }

    public static int searchIndex(int id) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].id == id) {
                index = i;
            }
        }
        return index;
    }

    public static void removeById(int id) {
            if (searchIndex(id) < arr.length) {
                Array[] newArr = new Array[arr.length - 1];
                for (int i = 0; i < searchIndex(id); i++) {
                    newArr[i] = arr[i];
                }
                for (int i = searchIndex(id); i < arr.length - 1; i++) {
                    newArr[i] = arr[i + 1];
                }
                arr = newArr;
            } else
                throw new IndexOutOfBoundsException();
    }

    public static Array[] set(int id, String surname, String name, int year) {
        if (searchIndex(id) < arr.length) {
            for (Array tmp : arr) {
                if (tmp.id == id) {
                    arr[searchIndex(id)].surname = surname;
                    arr[searchIndex(id)].name = name;
                    arr[searchIndex(id)].year = year;
                }
            }
        } else
            throw new IndexOutOfBoundsException();
        return arr;
    }
}

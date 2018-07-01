public class School {

    static Student[]arr = new Student[1];
    static int size = 0;

    public static void add(int id, String surname, String name, int year) {
        if (size >= arr.length) {
            extendArray();
        }
        arr[size++] = new Student(id, surname, name, year);
    }

    private static void extendArray() {
        Student[] newArr = new Student[size + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public static Student[] getArr() {
        return arr.clone();
    }

    public static void search(int id) {
        for (Student tmp : arr) {
            if (tmp.getId() == id) {
                System.out.println(tmp.toString());
            }
        }
    }

    public static int searchIndex(int id) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }

    public static void removeById(int id) {
        if (searchIndex(id) < arr.length) {
            Student[] newArr = new Student[arr.length - 1];
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

    public static Student[] set(int id, String surname, String name, int year) {
        if (searchIndex(id) < arr.length) {
            for (Student tmp : arr) {
                if (tmp.getId() == id) {
                    arr[searchIndex(id)].setSurname(surname);
                    arr[searchIndex(id)].setName(name);
                    arr[searchIndex(id)].setYear(year);
                }
            }
        } else
            throw new IndexOutOfBoundsException();
        return arr;
    }
}

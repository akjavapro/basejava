/**
 * Array based storage for Resumes
 */
import java.util.Arrays;

public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int count =0;

    void clear() {
        for (int i =0; i <= storage.length; i++) {
            Arrays.fill(storage, null);
        }

    }

    void save(Resume r) {
        storage[count] = r;
        count++;
    }

    Resume get(String uuid) {
        return null;
    }

    void delete(String uuid) {
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return new Resume[0];
    }

    int size() {
        int ind;
        for (ind =0; ind <= storage.length; ind++) {
            if (storage[ind] == null) break;
        }
        return ind;
    }
}

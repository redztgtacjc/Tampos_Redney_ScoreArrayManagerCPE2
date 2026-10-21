public class ScoreArrayManager {
    private final int[] scores;
    private int size;
    private final int capacity;

    public ScoreArrayManager(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
        this.scores = new int[capacity];
        this.size = 0;
    }

    public ScoreArrayManager(int capacity, int[] initialScores) {
        this(capacity);
        if (initialScores.length > capacity) {
            throw new IllegalArgumentException("Initial scores exceed capacity");
        }
        for (int score : initialScores) {
            insertAt(size, score);
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(scores[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public boolean updateScore(int index, int newScore) {
        if (index < 0 || index >= size) {
            return false;
        }
        scores[index] = newScore;
        return true;
    }

    public boolean insertAt(int index, int value) {
        if (size == capacity || index < 0 || index > size) {
            return false;
        }

        for (int i = size - 1; i >= index; i--) {
            scores[i + 1] = scores[i];
        }
        scores[index] = value;
        size++;
        return true;
    }

    public boolean deleteAt(int index) {
        if (index < 0 || index >= size) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            scores[i] = scores[i + 1];
        }
        size--;
        return true;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public static void main(String[] args) {
        ScoreArrayManager manager = new ScoreArrayManager(5, new int[] {72, 90, 84});

        System.out.print("Initial array: ");
        manager.display();

        System.out.print("Insert 88 at index 1: ");
        manager.insertAt(1, 88);
        manager.display();

        System.out.print("Update index 2 to 95: ");
        manager.updateScore(2, 95);
        manager.display();

        System.out.print("Delete index 3: ");
        manager.deleteAt(3);
        manager.display();

        System.out.println("Size: " + manager.getSize());
    }
}

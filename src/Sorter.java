public class Sorter {
    // Generic sort method
    public void sort(Sortable[] items) {
        int n = items.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (items[j].getSortableValue() > items[j + 1].getSortableValue()) {
                    Sortable temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }
}

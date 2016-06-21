package mapapp;

abstract class Map {

    private int[] data;

    public Map(int[] d) {
        data = d;
    }

    public int[] map() {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = function(data[i]);
        }
        return result;
    }

    protected abstract int function(int v);
}

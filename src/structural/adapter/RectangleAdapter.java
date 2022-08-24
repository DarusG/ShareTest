package structural.adapter;

public class RectangleAdapter implements Shape {
    private Rectangle adapter;

    public RectangleAdapter(Rectangle adapter){
        this.adapter = adapter;
    }

    @Override
    public void draw(int x, int y, int z, int j){
        int x1 = Math.min(x, y);
        int y1 = Math.min(z, j);
        int width = Math.abs(z - x);
        int height = Math.abs(j - y);

        adapter.draw(x1, y1, width, height);
    }
}

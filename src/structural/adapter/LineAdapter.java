package structural.adapter;

public class LineAdapter implements Shape {
    private Line adapter;

    public LineAdapter(Line adapter){
        this.adapter = adapter;
    }

    @Override
    public void draw(int x, int y, int z, int j){
        adapter.draw(x,y,z,j);
    }
}

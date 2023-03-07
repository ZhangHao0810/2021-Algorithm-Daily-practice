package CompositePattern.src.drawingsafe;

public class drawingClient {

    public drawingClient() {
    }
    public static void main(String[] args) {
        Circle circle=new Circle();
        Line line=new Line();
        Rectangle rectangle=new Rectangle();

        Picture picture=new Picture();
        picture.add(circle);
        picture.add(line);
        picture.add(rectangle);

        picture.draw();
    }
}
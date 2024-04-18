interface Color {
    String getColor();
}

interface PaintingTool {
    void applyColor(Color color);
}

class Brush implements PaintingTool {

    @Override
    public void applyColor(Color color) {
        System.out.println("Applying " + color + " with a brush");
    }

}

class Roller implements PaintingTool {

    @Override
    public void applyColor(Color color) {
        System.out.println("Applying " + color + " with a roller");
    }

}

class Sprayer implements PaintingTool {

    @Override
    public void applyColor(Color color) {
        System.out.println("Applying " + color + " with a sprayer");
    }

}

class Red implements Color {

    @Override
    public String getColor() {
        return "Red";
    }

}

class Green implements Color {

    @Override
    public String getColor() {
        return "Green";
    }

}

class Blue implements Color {

    @Override
    public String getColor() {
        return "Blue";
    }

}

public class Bridge {
    public static void main(String[] args) {
        PaintingTool brush = new Brush();
        Color red = new Red();
        brush.applyColor(red);

        PaintingTool sprayTool = new Sprayer();
        Color blue = new Blue();
        sprayTool.applyColor(blue);
    }
}
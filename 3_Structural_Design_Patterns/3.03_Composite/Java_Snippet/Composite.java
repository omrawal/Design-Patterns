import java.util.*;

interface FileSystem {
    void displayInfo();
}

class File implements FileSystem {
    private String name;
    private String contents;

    public File(String name, String contents) {
        this.name = name;
        this.contents = contents;
    }

    @Override
    public void displayInfo() {
        System.out.println("File: " + name + ", Contents: " + contents);
    }
}

class Directory implements FileSystem {
    private String name;
    private List<FileSystem> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addChild(FileSystem child) {
        this.children.add(child);
    }

    @Override
    public void displayInfo() {
        System.out.println("Directory: " + this.name);
        for (FileSystem child : this.children) {
            child.displayInfo();
        }
    }
}

public class Composite {
    public static void main(String[] args) {
        Directory baseDir = new Directory("home");
        File hackFile = new File("hack.txt", "Hacking NASA with HTML");
        Directory hackDir = new Directory("hack");
        File htmlFile = new File("index.html", "<h1>Welcome to NASA</h1>");
        baseDir.addChild(htmlFile);
        baseDir.addChild(hackDir);
        hackDir.addChild(hackFile);
        baseDir.displayInfo();
    }
}
package Artists;

public class Writer extends Artist {
    public enum WritingStyle {
        FICTION, NONFICTION, POETRY, DRAMA
    }

    private WritingStyle writingStyle;

    public Writer(String name, int age, String specialty, WritingStyle writingStyle) {
        super(name, age, specialty);
        this.writingStyle = writingStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nWriter's Info:");
        super.displayInfo();
        System.out.println("Writing Style: " + writingStyle);
    }
}

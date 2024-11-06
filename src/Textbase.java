public class Textbase implements Text {
    private String content;

    public Textbase(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

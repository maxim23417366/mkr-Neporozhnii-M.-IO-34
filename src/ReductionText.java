public class ReductionText extends TextDecorator {
    public ReductionText(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return compress(text.getContent());
    }

    private String compress(String text) {
        return text.replaceAll(" ", "");
    }
}

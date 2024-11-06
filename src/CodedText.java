public class CodedText extends TextDecorator {
    public CodedText(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return encrypt(text.getContent());
    }

    private String encrypt(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

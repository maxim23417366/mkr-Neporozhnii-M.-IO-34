public class AuthorText extends TextDecorator {
    public AuthorText(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return addAuthor(text.getContent());
    }

    private String addAuthor(String text) {
        String author = " Непорожній Максим ІО-34 ";
        return author + text;
    }
}

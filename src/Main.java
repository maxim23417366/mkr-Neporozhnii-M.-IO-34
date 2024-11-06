public class Main {
    public static void main(String[] args) {
        Text originalText = new Textbase("Тестове повідомлення в чаті");

        System.out.println("Оригінальне повідомлення: " + originalText.getContent());

        Text text = new CodedText(originalText);
        System.out.println("Шифрування: " + text.getContent());

        text = new ReductionText(text);
        System.out.println("Стискання: " + text.getContent());

        text = new DateandTimeText(text);
        System.out.println("Додавання дати та часу: " + text.getContent());

        text = new AuthorText(text);
        System.out.println("Додавання автора: " + text.getContent());
    }
}

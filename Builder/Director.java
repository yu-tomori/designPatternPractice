public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeString("朝から昼にかけて");
        builder.makeTitle("Greeting");
        builder.makeItems(new String[]{
            "おはようございます。 ",
            "こんにちは。 ",
        });
        builder.makeString("夜に");
        builder.makeItems(new String[]{
            "こんばんわ。 ",
            "おやすみなさい。 ",
            "さようなら。 ",
        });
        builder.close();
    }
}
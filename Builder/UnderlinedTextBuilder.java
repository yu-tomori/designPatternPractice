public class UnderlinedTextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    protected void buildTitle(String title) {
        buffer.append(title);
        buffer.append("\n");
        for (int i = 0; i < title.length(); i++) {
            buffer.append("=");
        }
        buffer.append("\n");
    }
    protected void buildString(String str) {
        buffer.append(str);
        buffer.append("\n");
        for (int i = 0; i < str.length(); i++) {
            buffer.append("--");
        }
        buffer.append("\n");
    }
    protected void buildItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" |" + items[i]);
            buffer.append("\n ");
            for (int j = 0; j < items[i].length(); j++) {
                buffer.append("--");
            }
            buffer.append("\n");
        }
    }
    protected void buildDone() {
        buffer.append("\n\n-----------END--------------\n");
    }
    protected String getResult() {
        return buffer.toString();
    }
}
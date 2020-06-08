public class UpDownBorder extends Border {
    private char borderChar;
    public UpDownBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }
    public int getColumns() {
        return display.getColumns();
    }
    public int getRows() {
        return display.getRows() + 2;
    }
    public String getRowText(int row) {
        if (row == 0) {
            return makeLine();
        } else if (row < getRows() - 1) {
            return display.getRowText(row-1);
        } else {
            return makeLine();
        }
    }
    private String makeLine() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < getColumns(); i++) {
            buf.append(borderChar);
        }
        return buf.toString();
    }
}
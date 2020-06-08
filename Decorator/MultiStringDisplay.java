import java.util.Iterator;
import java.util.ArrayList;

public class MultiStringDisplay extends Display {
    private ArrayList lines = new ArrayList();

    public MultiStringDisplay() {
    }
    public void add(String string) {
        lines.add(string);
    }
    public int getColumns() {
        int max = 0;
        Iterator it = lines.iterator();
        while(it.hasNext()) {
            String str = (String)it.next();
            if (str.getBytes().length > max) {
                max = str.getBytes().length;
            }
        }
        return max;
    }
    public int getRows() {
        return lines.size();
    }
    public String getRowText(int row) {
        StringBuffer tmp = new StringBuffer();
        tmp.append( lines.get(row).toString() );
        int space = getColumns() - lines.get(row).toString().getBytes().length;
        for (int i = 0; i < space; i++) {
            tmp.append(" ");
        }
        return tmp.toString();
    }
}
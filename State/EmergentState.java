public class EmergentState implements State {
    private static EmergentState singleton = new EmergentState();
    private EmergentState() {
    }
    public static State getInstance() {
        return singleton;
    }
    public void doClock(Context context, int hour) {
    }
    public void doUse(Context context) {
        context.recordLog("通報:非常時の金庫使用");
    }
    public void doAlarm(Context context) {
        context.callSecurityCenter("非常ベル");
    }
    public void doPhone(Context context) {
        context.callSecurityCenter("非常時の着信");
    }
    public String toString() {
        return "[非常]";
    }
}
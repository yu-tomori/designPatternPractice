public class LunchState implements State {
    private static LunchState singleton = new LunchState();
    private LunchState() {
    }
    public static State getInstance() {
        return singleton;
    }
    public void doClock(Context context, int hour) {
        if (hour < 12 || 13 <= hour) {
            context.changeState(DayState.getInstance());
        }
    }
    public void doUse(Context context) {
        context.recordLog("非常:昼食時の金庫使用");
    }
    public void doAlarm(Context context) {
        context.callSecurityCenter("非常ベル(昼食時)");
    }
    public void doPhone(Context context) {
        context.callSecurityCenter("留守電(昼食時の通話)");
    }
    public String toString() {
        return "[昼食時]";
    }
}
package lc.kra.system.keyboard.event;

import java.time.Instant;

public class GlobalKeyTrace {

    private final long delay;
    private Instant timeMenu;
    private Instant timeCtrl;
    private Instant timeShift;
    private Instant timeWin;

    public GlobalKeyTrace(int delay) {
        this.delay = delay;
        reset();
    }

    public void updatePressHistory(GlobalKeyEvent event) {
        if(event.isVirtualCodeControl()) {
            timeCtrl = Instant.now();
        }
        if(event.isVirtualCodeShift()) {
            timeShift = Instant.now();
        }
        if(event.isVirtualCodeMenu()) {
            timeMenu = Instant.now();
        }
        if(event.isVirtualCodeWin()) {
            timeWin = Instant.now();
        }
    }

    public void updateReleaseHistory(GlobalKeyEvent event) {
        if(event.isVirtualCodeControl()) {
            timeCtrl = Instant.MIN;
        }
        if(event.isVirtualCodeShift()) {
            timeShift = Instant.MIN;
        }
        if(event.isVirtualCodeMenu()) {
            timeMenu = Instant.MIN;
        }
        if(event.isVirtualCodeWin()) {
            timeWin = Instant.MIN;
        }
    }

    public void reset() {
        timeCtrl = Instant.MIN;
        timeShift = Instant.MIN;
        timeMenu = Instant.MIN;
        timeWin = Instant.MIN;
    }

    public boolean isMenu() {
        return timeMenu.plusMillis(delay).isAfter(Instant.now());
    }

    public boolean isCtrl() {
        return timeCtrl.plusMillis(delay).isAfter(Instant.now());
    }

    public boolean isShift() {
        return timeShift.plusMillis(delay).isAfter(Instant.now());
    }

    public boolean isWin() {
        return timeWin.plusMillis(delay).isAfter(Instant.now());
    }
}

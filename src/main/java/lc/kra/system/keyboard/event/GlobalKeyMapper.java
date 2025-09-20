package lc.kra.system.keyboard.event;

import static lc.kra.system.keyboard.event.GlobalKeyEvent.*;

public class GlobalKeyMapper {

    private GlobalKeyMapper() {
        // utility class
    }

    public static String toSimpleKey(GlobalKeyEvent event) {
        switch (event.getVirtualKeyCode()) {
            case VK_SHIFT   :
            case VK_LSHIFT  :
            case VK_RSHIFT  : return "Shift";

            case VK_CONTROL :
            case VK_LCONTROL:
            case VK_RCONTROL: return "Ctrl";

            case VK_MENU    :
            case VK_LMENU   :
            case VK_RMENU   : return "Alt";

            case VK_BACK    : return "BkSpace";
            case VK_TAB     : return "Tab";
            case VK_CLEAR   : return "Clear";
            case VK_RETURN  : return "Enter";
            case VK_PAUSE   : return "Pause";
            case VK_CAPITAL : return "Caps Lock";
            case VK_HANGUL  : return "IME Hangul";
            case VK_JUNJA   : return "IME Junja";
            case VK_FINAL   : return "IME Final";
            case VK_KANJI   : return "IME Kanji";
            case VK_ESCAPE  : return "Esc";
            case VK_CONVERT : return "IME convert";
            case VK_NONCONVERT : return "IME nonconvert";
            case VK_ACCEPT  : return "IME accept";
            case VK_MODECHANGE : return "IME change";
            case VK_SPACE   : return "Space";
            case VK_PRIOR   : return "PageUp";
            case VK_NEXT    : return "PageDown";
            case VK_END     : return "End";
            case VK_HOME    : return "Home";
            case VK_LEFT    : return "Left";
            case VK_UP      : return "Up";
            case VK_RIGHT   : return "Right";
            case VK_DOWN    : return "Down";
            case VK_SELECT  : return "Select";
            case VK_PRINT   : return "Print";
            case VK_EXECUTE : return "Execute";
            case VK_SNAPSHOT: return "PrintScreen";
            case VK_INSERT  : return "Insert";
            case VK_DELETE  : return "Delete";
            case VK_HELP    : return "Help";
            case VK_0: return "0";
            case VK_1: return "1";
            case VK_2: return "2";
            case VK_3: return "3";
            case VK_4: return "4";
            case VK_5: return "5";
            case VK_6: return "6";
            case VK_7: return "7";
            case VK_8: return "8";
            case VK_9: return "9";
            case VK_A: return "A";
            case VK_B: return "B";
            case VK_C: return "C";
            case VK_D: return "D";
            case VK_E: return "E";
            case VK_F: return "F";
            case VK_G: return "G";
            case VK_H: return "H";
            case VK_I: return "I";
            case VK_J: return "J";
            case VK_K: return "K";
            case VK_L: return "L";
            case VK_M: return "M";
            case VK_N: return "N";
            case VK_O: return "O";
            case VK_P: return "P";
            case VK_Q: return "Q";
            case VK_R: return "R";
            case VK_S: return "S";
            case VK_T: return "T";
            case VK_U: return "U";
            case VK_V: return "V";
            case VK_W: return "W";
            case VK_X: return "X";
            case VK_Y: return "Y";
            case VK_Z: return "Z";
            case VK_LWIN    : return "Win";
            case VK_RWIN    : return "Win";
            case VK_APPS    : return "Applications";
            case VK_SLEEP   : return "Sleep";
            case VK_NUMPAD0 : return "Num0";
            case VK_NUMPAD1 : return "Num1";
            case VK_NUMPAD2 : return "Num2";
            case VK_NUMPAD3 : return "Num3";
            case VK_NUMPAD4 : return "Num4";
            case VK_NUMPAD5 : return "Num5";
            case VK_NUMPAD6 : return "Num6";
            case VK_NUMPAD7 : return "Num7";
            case VK_NUMPAD8 : return "Num8";
            case VK_NUMPAD9 : return "Num9";
            case VK_MULTIPLY: return "Num*";
            case VK_ADD     : return "Num+";
            case VK_SEPARATOR: return "Num,";
            case VK_SUBTRACT: return "Num-";
            case VK_DECIMAL : return "Num.";
            case VK_DIVIDE  : return "Num/";
            case VK_F1  : return "F1";
            case VK_F2  : return "F2";
            case VK_F3  : return "F3";
            case VK_F4  : return "F4";
            case VK_F5  : return "F5";
            case VK_F6  : return "F6";
            case VK_F7  : return "F7";
            case VK_F8  : return "F8";
            case VK_F9  : return "F9";
            case VK_F10 : return "F10";
            case VK_F11 : return "F11";
            case VK_F12 : return "F12";
            case VK_F13 : return "F13";
            case VK_F14 : return "F14";
            case VK_F15 : return "F15";
            case VK_F16 : return "F16";
            case VK_F17 : return "F17";
            case VK_F18 : return "F18";
            case VK_F19 : return "F19";
            case VK_F20 : return "F20";
            case VK_F21 : return "F21";
            case VK_F22 : return "F22";
            case VK_F23 : return "F23";
            case VK_F24 : return "F24";
            case VK_NUMLOCK: return "Num Lock";
            case VK_SCROLL: return "Scroll Lock";
            case VK_BROWSER_BACK: return "Browser Back";
            case VK_BROWSER_FORWARD : return "Browser Forward";
            case VK_BROWSER_REFRESH: return "Browser Refresh";
            case VK_BROWSER_STOP: return "Browser Stop";
            case VK_BROWSER_SEARCH : return "Browser Search";
            case VK_BROWSER_FAVORITES: return "Browser Favorites";
            case VK_BROWSER_HOME : return "Browser Home";
            case VK_VOLUME_MUTE : return "Volume Mute";
            case VK_VOLUME_DOWN: return "Volume Down";
            case VK_VOLUME_UP : return "Volume Up";
            case VK_MEDIA_NEXT_TRACK: return "Media Next Track";
            case VK_MEDIA_PREV_TRACK : return "Media Prev Track";
            case VK_MEDIA_STOP: return "Media Stop";
            case VK_MEDIA_PLAY_PAUSE : return "Media Play/Pause";
            case VK_LAUNCH_MAIL: return "Mail";
            case VK_LAUNCH_MEDIA_SELECT : return "Media Select";
            case VK_LAUNCH_APP1: return "Start Application 1";
            case VK_LAUNCH_APP2 : return "Start Application 2";
            case VK_OEM_PLUS : return "OEM +";
            case VK_OEM_COMMA : return "OEM ,";
            case VK_OEM_MINUS : return "OEM -";
            case VK_OEM_PERIOD : return "OEM .";

            case VK_OEM_1 :
            case VK_OEM_2 :
            case VK_OEM_3 :
            case VK_OEM_4 :
            case VK_OEM_5 :
            case VK_OEM_6 :
            case VK_OEM_7 :
            case VK_OEM_8 : return "OEM " + event.getKeyChar();

            case VK_OEM_102 : return "OEM 102";

            case VK_PROCESSKEY : return "IME Process";
            case VK_PACKET : return "Unicode";
            case VK_ATTN : return "ATTN";
            case VK_CRSEL : return "CRSEL";
            case VK_EXSEL : return "EXSEL";
            case VK_EREOF : return "EREOF";
            case VK_PLAY : return "Play";
            case VK_ZOOM : return "Zoom";
            case VK_NONAME : return "Reserved";
            case VK_PA1 : return "PA1";
            case VK_OEM_CLEAR : return "OEM Clear";
            default: return "?";
        }
    }

    public static String toExtendedKey(GlobalKeyEvent event) {
        switch (event.getVirtualKeyCode()) {
            case VK_SHIFT   : return "Shift";
            case VK_CONTROL : return "Ctrl";
            case VK_MENU    : return "Alt";
            case VK_LSHIFT: return "LShift";
            case VK_RSHIFT: return "RShift";
            case VK_LCONTROL: return "LCtrl";
            case VK_RCONTROL: return "RCtrl";
            case VK_LMENU: return "LAlt";
            case VK_RMENU: return "RAlt";
            default: return toSimpleKey(event);
        }
    }

}

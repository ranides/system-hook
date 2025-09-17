/**
 * Copyright (c) 2016 Kristian Kraljic
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package lc.kra.system.keyboard.example;

import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;

import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyAdapter;
import lc.kra.system.keyboard.event.GlobalKeyEvent;

public class GlobalKeyboardExample {
    private static AtomicBoolean run = new AtomicBoolean(true);

    public static void main(String[] args) {
        GlobalKeyboardHook keyboardHook = new GlobalKeyboardHook(false); // use false here to switch to hook instead of raw input

        System.out.println(
            "Global keyboard hook successfully started, press [escape] key to shutdown. Connected keyboards:");

        for (Entry<Long, String> keyboard : GlobalKeyboardHook.listKeyboards().entrySet()) {
            System.out.format("%d: %s\n", keyboard.getKey(), keyboard.getValue());
        }

        keyboardHook.addKeyListener(new GlobalKeyAdapter() {
            @Override
            public boolean keyPressed(GlobalKeyEvent event) {
                System.out.println(event);
                if (event.getVirtualKeyCode() == GlobalKeyEvent.VK_ESCAPE) {
                    run.set(false);
                }
                if("qwertyuiop".indexOf(event.getKeyChar()) != -1) {
                    return true;
                }
                return false;
            }

            @Override
            public boolean keyReleased(GlobalKeyEvent event) {
                System.out.println(event);
                if("qwertyuiop".indexOf(event.getKeyChar()) != -1) {
                    return true;
                }

                return false;
            }
        });

        try {
            while (run.get()) {
                Thread.sleep(128);
            }
        } catch (InterruptedException e) { /* nothing to do here */ } finally {
            keyboardHook.shutdownHook();
        }
    }
}
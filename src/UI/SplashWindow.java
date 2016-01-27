package UI;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

public class SplashWindow extends JWindow implements Runnable {

    GraphicUpdaterThread guThread = new GraphicUpdaterThread();
    ImageIcon splashImage = null;
    BufferedImage barImage;
    float currentProgress;
    float targetProgress;
    Color barColor;
    int x = 250;
    int y = 330;
    int w = 250;
    int h = 6;
    String message= "loading";
    Color messageColor;

    public SplashWindow(ImageIcon image, String text) {
        splashImage = image;
        barColor = new Color(0x66FF00);
        messageColor = new Color(0x0000FF);
        guThread.addRunnable(this);
        setSize(splashImage.getIconWidth(), splashImage.getIconHeight());
        centerOnScreen(this);
    }

    private void setup() {
        barImage = new BufferedImage(w, h,
                BufferedImage.TYPE_INT_ARGB_PRE);
        Graphics g = barImage.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRoundRect(0, 0, w, h, h / 5, h / 5);
    }

    public void start() {
        guThread.start();
    }

    @Override
    public void hide() {
        guThread.stop();
    }

    @Override
    public void run() {
        while (currentProgress != targetProgress) {
            paint(getGraphics());

        }
    }

    @Override
    public void paint(Graphics gContext) {
        if (barImage == null) {
            setup();
        }
        gContext.drawImage(splashImage.getImage(), 0, 0, this);
        fillProgressBar();
        gContext.drawImage(barImage, x, y, this);

        gContext.drawString("\u00A9 Mohamed Ghanem", 5, 400);

        gContext.setColor(messageColor);
        gContext.drawString(message, x, y + h + 13);
        gContext.drawString("" + (int) (currentProgress * 100) + " %", x + 200, y + h + 13);
    }

    private void fillProgressBar() {
        Graphics g = barImage.getGraphics();
        g.setColor(barColor);
        g.fillRoundRect(0, 0, (int) (w * targetProgress), h, h / 3, h / 3);
        currentProgress = targetProgress;
    }

    public void setProgress(int percent) {
        targetProgress = percent / 100f;
    }

    public void setMessage(String str) {
        message = str;
    }

    private void centerOnScreen(Component c) {

        Dimension dimension = c.getToolkit().getScreenSize();

        int xCoordinate = (int) ((dimension.getWidth() - c.getWidth()) / 2);
        int yCoordinate = (int) ((dimension.getHeight() - c.getHeight()) / 2);

        c.setLocation(xCoordinate, yCoordinate);

    }

    public class GraphicUpdaterThread extends Thread {

        private ArrayList<Runnable> runnables = new ArrayList<>();

        public synchronized void addRunnable(Runnable runnable) {
            runnables.add(runnable);
        }

        @Override
        public void run() {
            while (currentProgress != 1.0) {
                Iterator<Runnable> iter = runnables.iterator();
                Runnable runner;
                while (iter.hasNext()) {
                    runner = (Runnable) iter.next();
                    SwingUtilities.invokeLater(runner);
                }
            }
        }
    }
}

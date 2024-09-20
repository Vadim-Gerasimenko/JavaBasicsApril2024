package ru.academits.lesson13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static void main(String[] args) throws IOException {
        BufferedImage sourceImage = ImageIO.read(new File("image.jpg"));

        WritableRaster sourceRaster = sourceImage.getRaster();

        BufferedImage resultImage = ImageIO.read(new File("image.jpg"));

        WritableRaster resultRaster = resultImage.getRaster();

        int width = sourceRaster.getWidth();
        int height = sourceRaster.getHeight();

        final int MESH_DIMENSION = 7;
        final int MESH_LINES_ABOVE_PIXEL_COUNT = (MESH_DIMENSION - 1) / 2;

        final double BLUR_COEFFICIENT = (double) 1 / (MESH_DIMENSION * MESH_DIMENSION);

        double[][] mesh = {
                {BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT},
                {BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT},
                {BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT},
                {BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT},
                {BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT},
                {BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT},
                {BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT},
        };

        final int COLORS_COUNT_IN_RGB = 3;

        int[] sourcePixel = new int[COLORS_COUNT_IN_RGB];
        int[] resultPixel = new int[COLORS_COUNT_IN_RGB];

        final int RED_COLOR_INDEX = 0;
        final int GREEN_COLOR_INDEX = 1;
        final int BLUE_COLOR_INDEX = 2;

        for (int y = MESH_LINES_ABOVE_PIXEL_COUNT; y < height - MESH_LINES_ABOVE_PIXEL_COUNT; ++y) {
            for (int x = MESH_LINES_ABOVE_PIXEL_COUNT; x < width - MESH_LINES_ABOVE_PIXEL_COUNT; ++x) {
                double redColor = 0;
                double greenColor = 0;
                double blueColor = 0;

                for (int j = y - MESH_LINES_ABOVE_PIXEL_COUNT; j <= y + MESH_LINES_ABOVE_PIXEL_COUNT; ++j) {
                    for (int i = x - MESH_LINES_ABOVE_PIXEL_COUNT; i <= x + MESH_LINES_ABOVE_PIXEL_COUNT; ++i) {
                        sourceRaster.getPixel(i, j, sourcePixel);

                        redColor += sourcePixel[RED_COLOR_INDEX] * mesh[i % MESH_DIMENSION][j % MESH_DIMENSION];
                        greenColor += sourcePixel[GREEN_COLOR_INDEX] * mesh[i % MESH_DIMENSION][j % MESH_DIMENSION];
                        blueColor += sourcePixel[BLUE_COLOR_INDEX] * mesh[i % MESH_DIMENSION][j % MESH_DIMENSION];
                    }
                }

                resultPixel[RED_COLOR_INDEX] = (int) Math.round(redColor);
                resultPixel[GREEN_COLOR_INDEX] = (int) Math.round(greenColor);
                resultPixel[BLUE_COLOR_INDEX] = (int) Math.round(blueColor);

                resultRaster.setPixel(x, y, resultPixel);
            }
        }

        ImageIO.write(resultImage, "png", new File("out.png"));
    }
}
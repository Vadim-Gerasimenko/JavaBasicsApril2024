package ru.academits.lesson13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blurring {
    private static final int MESH_DIMENSION = 3;
    private static final int MESH_HALF_DIMENSION = MESH_DIMENSION / 2;

    private static final double BLUR_COEFFICIENT = (double) 1 / (MESH_DIMENSION * MESH_DIMENSION);

    private static final int COLORS_COUNT_IN_RGB = 3;

    private static final int RED_COLOR_INDEX = 0;
    private static final int GREEN_COLOR_INDEX = 1;
    private static final int BLUE_COLOR_INDEX = 2;

    public static int getCroppedColor(double color) {
        if (color <= 0) {
            return 0;
        }

        if (color >= 255) {
            return 255;
        }

        return (int) Math.round(color);
    }

    public static void main(String[] args) throws IOException {
        BufferedImage sourceImage = ImageIO.read(new File("image.jpg"));
        WritableRaster sourceRaster = sourceImage.getRaster();

        int width = sourceRaster.getWidth();
        int height = sourceRaster.getHeight();

        BufferedImage resultImage = new BufferedImage(width, height, sourceImage.getType());
        WritableRaster resultRaster = resultImage.getRaster();

        double[][] mesh = {
                {BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT},
                {BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT},
                {BLUR_COEFFICIENT, BLUR_COEFFICIENT, BLUR_COEFFICIENT}
        };

        int[] sourcePixel = new int[COLORS_COUNT_IN_RGB];
        int[] resultPixel = new int[COLORS_COUNT_IN_RGB];

        final int HEIGHT_EXCEPT_MESH_HALF_DIMENSION = height - MESH_HALF_DIMENSION;
        final int WIDTH_EXCEPT_MESH_HALF_DIMENSION = width - MESH_HALF_DIMENSION;

        for (int centralPixelY = MESH_HALF_DIMENSION; centralPixelY < HEIGHT_EXCEPT_MESH_HALF_DIMENSION; ++centralPixelY) {
            for (int centralPixelX = MESH_HALF_DIMENSION; centralPixelX < WIDTH_EXCEPT_MESH_HALF_DIMENSION; ++centralPixelX) {
                double redColor = 0;
                double greenColor = 0;
                double blueColor = 0;

                for (int meshY = 0, adjacentPixelY = centralPixelY - MESH_HALF_DIMENSION; meshY < MESH_DIMENSION; ++adjacentPixelY, ++meshY) {
                    for (int meshX = 0, adjacentPixelX = centralPixelX - MESH_HALF_DIMENSION; meshX < MESH_DIMENSION; ++adjacentPixelX, ++meshX) {
                        sourceRaster.getPixel(adjacentPixelX, adjacentPixelY, sourcePixel);

                        redColor += sourcePixel[RED_COLOR_INDEX] * mesh[meshY][meshX];
                        greenColor += sourcePixel[GREEN_COLOR_INDEX] * mesh[meshY][meshX];
                        blueColor += sourcePixel[BLUE_COLOR_INDEX] * mesh[meshY][meshX];
                    }
                }

                resultPixel[RED_COLOR_INDEX] = getCroppedColor(redColor);
                resultPixel[GREEN_COLOR_INDEX] = getCroppedColor(greenColor);
                resultPixel[BLUE_COLOR_INDEX] = getCroppedColor(blueColor);

                resultRaster.setPixel(centralPixelX, centralPixelY, resultPixel);
            }
        }

        ImageIO.write(resultImage, "png", new File("out.png"));
    }
}
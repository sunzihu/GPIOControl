package com.gpiocontrol;

public class GPIODefine {
    public static String gpioRootDirectory = "/sys/class/gpio";

    public static String gpioExportFilePath = gpioRootDirectory + "/export";

    public static String gpioUnExportFilePath = gpioRootDirectory + "/unexport";

    public static String gpioDirectionFileName = "direction";

    public static String gpioValueFileName = "value";
}
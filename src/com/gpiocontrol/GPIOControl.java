package com.gpiocontrol;

import java.io.File;
import java.io.IOException;

public class GPIOControl {
    private int pinNum;
    private String gpioDirectory;
    private File gpioDirectoryFile;

    /**
     * GPIOControl's construction method.
     * @param pinNum Your pin index.
     */
    public GPIOControl(int pinNum) {
        initPin(pinNum);
    }

    /**
     * Get this pin's state.
     * @return Pin connection state, if connection, it's return true.
     */
    public boolean isExport() {
        return gpioDirectoryFile.exists();
    }

    /**
     * Export this pin.
     * (If your pin is exporting, it will skip.)
     * @throws IOException I/O error.
     */
    public void export() throws IOException {
        if (!isExport()) {
            FileUtil.append(GPIODefine.gpioExportFilePath, String.valueOf(pinNum));
        }
    }

    /**
     * UnExport this pin.
     * (If your pin isn't exporting, it will skip.)
     * @throws IOException I/O error.
     */
    public void unExport() throws IOException {
        if (isExport()) {
            FileUtil.append(GPIODefine.gpioUnExportFilePath, String.valueOf(pinNum));
        }
    }

    /**
     * Set mode.
     * @param mode It's your mode, such as OUT, IN.
     * @throws IOException I/O error.
     */
    public void setMode(String mode) throws IOException {
        if (isExport()) {
            FileUtil.append(gpioDirectory + "/" + GPIODefine.gpioDirectionFileName, mode);
        }
    }

    /**
     * Set value.
     * @param value It's your value.
     * @throws IOException I/O error.
     */
    public void setValue(int value) throws IOException {
        if (isExport()) {
            FileUtil.replace(gpioDirectory + "/" + GPIODefine.gpioValueFileName, String.valueOf(value));
        }
    }

    /**
     * Get pin index.
     * @return The pin index in this object.
     */
    public int getPinNum() {
        return pinNum;
    }

    private void initPin(int pinNum) {
        this.pinNum = pinNum;
        this.gpioDirectory = GPIODefine.gpioRootDirectory + "/gpio" + pinNum;
        this.gpioDirectoryFile = new File(gpioDirectory);
    }
}
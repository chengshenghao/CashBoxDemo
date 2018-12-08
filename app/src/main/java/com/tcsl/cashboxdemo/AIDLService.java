package com.tcsl.cashboxdemo;

import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ComposeShader;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import woyou.aidlservice.jiuiv5.ICallback;
import woyou.aidlservice.jiuiv5.IWoyouService;

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2018/12/7 15: 45
 */

public class AIDLService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return stub;
    }

    private final IWoyouService.Stub stub = new IWoyouService.Stub() {

        @Override
        public void updateFirmware() throws RemoteException {

        }

        @Override
        public int getFirmwareStatus() throws RemoteException {
            return 0;
        }

        @Override
        public String getServiceVersion() throws RemoteException {
            return null;
        }

        @Override
        public void printerInit(ICallback callback) throws RemoteException {

        }

        @Override
        public void printerSelfChecking(ICallback callback) throws RemoteException {

        }

        @Override
        public String getPrinterSerialNo() throws RemoteException {
            return null;
        }

        @Override
        public String getPrinterVersion() throws RemoteException {
            return null;
        }

        @Override
        public String getPrinterModal() throws RemoteException {
            return null;
        }

        @Override
        public int getPrintedLength() throws RemoteException {
            return 0;
        }

        @Override
        public void lineWrap(int n, ICallback callback) throws RemoteException {

        }

        @Override
        public void sendRAWData(byte[] data, ICallback callback) throws RemoteException {

        }

        @Override
        public void setAlignment(int alignment, ICallback callback) throws RemoteException {

        }

        @Override
        public void setFontName(String typeface, ICallback callback) throws RemoteException {

        }

        @Override
        public void setFontSize(float fontsize, ICallback callback) throws RemoteException {

        }

        @Override
        public void printText(String text, ICallback callback) throws RemoteException {

        }

        @Override
        public void printTextWithFont(String text, String typeface, float fontsize, ICallback callback) throws RemoteException {

        }

        @Override
        public void printColumnsText(String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, ICallback callback) throws RemoteException {

        }

        @Override
        public void printBitmap(Bitmap bitmap, ICallback callback) throws RemoteException {

        }

        @Override
        public void printBarCode(String data, int symbology, int height, int width, int textposition, ICallback callback) throws RemoteException {

        }

        @Override
        public void printQRCode(String data, int modulesize, int errorlevel, ICallback callback) throws RemoteException {

        }

        @Override
        public void printOriginalText(String text, ICallback callback) throws RemoteException {

        }

        @Override
        public void commitPrinterBuffer() throws RemoteException {

        }

        @Override
        public void cutPaper(ICallback callback) throws RemoteException {

        }

        @Override
        public int getCutPaperTimes() throws RemoteException {
            return 0;
        }

        @Override
        public void openDrawer(ICallback callback) throws RemoteException {

        }

        @Override
        public int getOpenDrawerTimes() throws RemoteException {
            return 0;
        }

        @Override
        public void enterPrinterBuffer(boolean clean) throws RemoteException {

        }

        @Override
        public void exitPrinterBuffer(boolean commit) throws RemoteException {

        }
    };
}

package gino247;

public class JustAnotherSimpleByteUtil {
    
    final protected static char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    
    public static byte[] hex2byteArray(String hex) {
        byte[] b = new byte[hex.length() / 2];
        int k;

        for (int i = 0, j = 0; i < hex.length() / 2; i++, j++) {
            k = Integer.parseInt(hex.substring(j * 2, j * 2 + 2), 16) & 0xff;
            b[i] = (byte) k;
        }
        return b;
    }

    public static String byte2hexString(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        int v;
        for (int j = 0; j < bytes.length; j++) {
            v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
    
}

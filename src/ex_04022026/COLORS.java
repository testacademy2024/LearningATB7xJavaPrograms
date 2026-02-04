package ex_04022026;

public enum COLORS {
    RED("#ff0000"),
    GREEN("#f0d0d0d"),
    BLUE("#f0d0d0d");
    private String hexValue;
    COLORS(String hexValue)
    {
this.hexValue=hexValue;
    }
    public String getValue(){
        return hexValue;
    }
}

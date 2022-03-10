package by.belstu.it.nekrasova.basejava;

import java.util.Objects;

public class WrapperString {
    private String strwrap;
    public String getStrwrap() {
        return strwrap;
    }
    public void setStrwrap(String strwrap) {
        this.strwrap = strwrap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(strwrap, that.strwrap);
    }
    @Override
    public int hashCode() {
        return Objects.hash(strwrap);
    }
    @Override
    public String toString() {
        return "WrapperString{" +
                "strwrap='" + strwrap + '\'' +
                '}';
    }

    public void replace(char oldchar, char newchar) {
        strwrap = strwrap.replace(oldchar, newchar);
    }
    public WrapperString(String strwrap) {
        this.strwrap = strwrap;
    }
}

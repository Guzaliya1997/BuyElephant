public class Check {
    String s;
    String str;

    public Check(String s, String str) {
        this.s = s;
        this.str = str;
    }

    public Check() {

    }


    public boolean ifDuplicated(String s) {
      if(str.indexOf(s)!=-1){
       return false;
      }
        return true;
    }
}
package tools;

import java.lang.reflect.Array;


        // Integer.toHexString();//转码
        // Integer.parseInt();//解码

public class Encryption {

    //构造函数
    public Encryption(String publicPassword, String plainText) {
        this.publicPassword = publicPassword;
        this.plainText = plainText;
    }

    public void test() {
        String s = "核心价值观";
        char[] array = s.toCharArray();
        int l = array.length;
        for (int i=0;i<l;i++) {
            String number = Integer.toHexString(array[i]);
            System.out.print(number);
           // String str = Integer.parseInt(number);
            //System.out.println(str);
        }
    }
    //公钥
    private String publicPassword = null;
    //明文
    private String plainText = null;
    //密码工具
    private password liupengPrivatepassword = null;

    public String getPublicPassword() {
        return publicPassword;
    }

    public void setPublicPassword(String publicPassword) {
        this.publicPassword = publicPassword;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public password getLiupengPrivatepassword() {
        return liupengPrivatepassword;
    }

    public void setLiupengPrivatepassword(password liupengPrivatepassword) {
        this.liupengPrivatepassword = liupengPrivatepassword;
    }

    public void createPasswordTool() {
        this.setLiupengPrivatepassword(new password(this.getPublicPassword()));
    }

    public static void main(String[] args) {
        new Encryption("liupeng.0@outlook.com", "fghjk").test();
    }
}

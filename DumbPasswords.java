
public class DumbPasswords {
    public static String DumbPasswords(int m, int n){
        String password = "";
        for(int i = 1; i < m+1; i++){
            for(int j = 1;j < m+1; j++){
                for(int k = 97; k < 97+n;k++){
                    for(int l = 97;l< 97+n;l++){
                        for(int five = Math.max(i,j)+1;five < m+1;five++){
                            password += Integer.toString(i)+ Integer.toString(j) + (char)k + (char)l+ Integer.toString(five)+' ';
                        }
                    }
                }
            }
        }
        return password;
    }
    public static void main(String args[]){
        String words = DumbPasswords(3,1);
        System.out.println(words);
    }
}

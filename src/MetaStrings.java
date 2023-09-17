public class MetaStrings {
    public static void MetaString(String a, String b){
        int[] unmatched = new int[10];
        int sum=0;
        int s1 = 0,s2 = 0;
        int c=0;
        if (a.length()==b.length()){
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i)!=b.charAt(i))
                    unmatched[i]=1;
                else
                    unmatched[i]=0;
            }
            for (int n : unmatched) {
                sum+=n;
            }
            if(sum==2){
                for (int i = 0; i < unmatched.length; i++) {
                    if(unmatched[i]==1 && c==0){
                        s1=i;
                        c++;
                    }
                    else if(unmatched[i]==1 && c==1){
                        s2=i;
                    }
                }
                String s = new String(swap(a, s1, s2));
                s=s.toLowerCase();

                if(b.equals(s)){
                    System.out.println("Meta Strings: "+b+","+a);
                }
            }
            else
                System.out.println("False");

        }
        else
            System.out.println("False");
    }

    static char[] swap(String str, int i, int j)
    {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }

    public static void main(String[] args) {
        String a = "geeks";
        String b = "keegs";
        MetaString(a,b);
    }
}

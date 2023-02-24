import java.util.StringTokenizer;

public class TokenDemo {

        public int display(){
            StringTokenizer stringTokenizer = new StringTokenizer("I am Mrunmai");
            int result =0;
            while (stringTokenizer.hasMoreTokens()){
                stringTokenizer.nextToken();
                result++;
            }
            return result;
        }
    }


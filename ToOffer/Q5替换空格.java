package ToOffer;

public class Q5 {
	public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for ( int i = 0 ; i < s.length() ; i++) {
        	if(s.charAt(i) == ' ') {
        		sb.append("%20");
        	}else {
        		sb.append(s.charAt(i));
        	}
        	//sb.append(s.charAt(i) ==  ' '? "%20":s.charAt(i));//时间复杂度会上升
        }
        return sb.toString();
    }
}

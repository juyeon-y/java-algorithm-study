class Solution {
    public String solution(String new_id) {
        String s = new_id.toLowerCase();
        s = s.replaceAll("[^a-z0-9-_.]","").replaceAll("[.]{2,}",".").replaceAll("^[.]|[.]$", "");
        if(s.isEmpty()) s="a";
        if(s.length()>=16) s = s.substring(0,15).replaceAll("[.]$", "");
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()<=2) sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
}
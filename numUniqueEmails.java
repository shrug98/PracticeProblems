class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmail = new HashSet<>();
        for(String e: emails){
            int at = e.indexOf('@');
            String local = e.substring(0,at);
            String domain = e.substring(at,e.length());
            if(local.contains(".")){
                local = local.replace(".", "");
            }
            if(local.contains("+")){ 
                int ind = local.indexOf('+');
                local = local.substring(0,ind);
            }
            String email = local.concat(domain);
            uniqueEmail.add(email);
        }
        return uniqueEmail.size(); 
    }
}

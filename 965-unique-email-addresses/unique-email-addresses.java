class Solution {
    public int numUniqueEmails(String[] emails) 
    {
        HashSet <String > h = new HashSet<>();

        for (String s : emails)
        {
            String []ss = s.split("@");

            String name = ss[0];
            String ad = ss[1];

            int p = name.indexOf("+");
            if (p !=  -1)
            {
                name = name.substring(0,p);
            }
            name = name.replace(".","");
            h.add(name+"@"+ad);


        }
        return h.size();
        
    }
}
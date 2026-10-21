
import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        List<String> uniqueEmails = new ArrayList<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }

            local = local.replace(".", "");

            String modifiedEmail = local + "@" + domain;

            if (!uniqueEmails.contains(modifiedEmail)) {
                uniqueEmails.add(modifiedEmail);
            }
        }

        return uniqueEmails.size();
    }
}
